package org.pickles.dungeons.calculator;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author t.asamoto
 */
@Data
public class StatusManager {
	
	private final String name;
	private final List<Status> statusList = new ArrayList<>();
	
	public StatusManager(String name){
		this.name = name;
	}
	
	/**
	 * 現在の可変値を取得
	 * @param query
	 * @return 
	 */
	public StatusValue getNow(StatusValue query){
		return getStatus(query.getStatusType()).getNow();
	}
	
	/**
	 * 現在の可変値の状態を取得
	 * @param query
	 * @return 
	 */
	public StatusResult getNowResult(StatusValue query){
		return getStatus(query.getStatusType()).getNowResult();
	}
	
	/**
	 * 時間更新値を取得
	 * @param query
	 * @return 
	 */
	public StatusValue getVariable(StatusValue query){
		return getStatus(query.getStatusType()).getVariable();
	}
	
	/**
	 * 時間更新値を設定
	 * @param query
	 * @param variable
	 * @return 
	 */
	public StatusResult setVariable(StatusValue query){
		return getStatus(query.getStatusType()).setVariable(query);
	}
	
	/**
	 * 最大値を拡張する
	 * @param query
	 * @param value
	 * @return 
	 */
	public StatusResult expand(StatusValue query){
		return getStatus(query.getStatusType()).expand(query);
	}
	
	/**
	 * 可変値を変更する
	 * @param query
	 * @param value
	 * @return 
	 */
	public StatusResult effect(StatusValue query){
		return getStatus(query.getStatusType()).effect(query);
	}
	
	/**
	 * 時間更新を行う
	 * @param query
	 * @return 
	 */
	public StatusResult update(StatusValue query){
		return getStatus(query.getStatusType()).update();
	}
	
	private Status getStatus(ConstStatusType type){
		for(Status status : statusList){
			if(status.matchType(type)){
				return status;
			}
		}
		return new DefaultStatus();
	}
}
