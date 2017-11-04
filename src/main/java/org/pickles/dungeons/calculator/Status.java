package org.pickles.dungeons.calculator;

/**
 *
 * @author t.asamoto
 */
public interface Status {
	
	/**
	 * 現在の可変値を取得
	 * @return 
	 */
	public default StatusValue getNow(){
		return StatusValue.getUnsupport();
	}
	
	/**
	 * 現在の可変値の状態を取得
	 * @return 
	 */
	public default StatusResult getNowResult(){
		return StatusResult.UNSUPPORT;
	}
	
	/**
	 * 時間更新値を取得
	 * @return 
	 */
	public default StatusValue getVariable(){
		return StatusValue.getUnsupport();
	}
	
	/**
	 * 時間更新値を設定
	 * @param variable
	 * @return 
	 */
	public default StatusResult setVariable(StatusValue variable){
		return StatusResult.UNSUPPORT;
	}
	
	/**
	 * 最大値を拡張する
	 * @param value
	 * @return 
	 */
	public default StatusResult expand(StatusValue value){
		return StatusResult.UNSUPPORT;
	}
	
	/**
	 * 可変値を変更する
	 * @param value
	 * @return 
	 */
	public default StatusResult effect(StatusValue value){
		return StatusResult.UNSUPPORT;
	}
	
	/**
	 * 時間更新を行う
	 * @return 
	 */
	public default StatusResult update(){
		return StatusResult.UNSUPPORT;
	}
	
	public default StatusType getStatusType(){
		return ConstStatusType.UNSUPPORTED;
	}
	
	public default boolean matchType(StatusType type){
		return false;
	}
}
