package org.pickles.dungeons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pickles.dungeons.calculator.ExpandableValue;
import org.pickles.dungeons.calculator.ConstStatusType;
import org.pickles.dungeons.calculator.StatusValue;

/**
 * ステータス値に関するUtilクラス
 * @author t.asamoto
 */
public class StatusValueUtils {
	
	/**
	 * それぞれの値を全て足し合わせる。
	 * ただし、baseValueとタイプの違う値は足し合わされない。
	 * @param baseValue 被対象値。
	 * @param addList 対象値リスト。
	 * @return 合算値
	 */
	public static StatusValue join(StatusValue baseValue, List<StatusValue> addList){
		if(baseValue == null) return StatusValue.getUnsupport();
		if(addList == null) return new StatusValue(baseValue);
		ExpandableValue ret = new ExpandableValue(baseValue);
		for(StatusValue add : addList){
			ret.expand(add);
		}
		return new StatusValue(ret);
	}
	
	/**
	 * それぞれの値を全て足し合わせる。
	 * ただし、baseValueとタイプの違う値は足し合わされない。
	 * @param baseValue 被対象値。
	 * @param addArrays 対象値。
	 * @return 合算値
	 */
	public static StatusValue join(StatusValue baseValue, StatusValue... addArrays){
		return join(baseValue, Arrays.asList(addArrays));
	}
	
	/**
	 * 入力したリストから指定したタイプの値を抽出する。
	 * @param type 抽出したいステータスタイプ
	 * @param valueList 抽出対象
	 * @return 
	 */
	public static List<StatusValue> filter(ConstStatusType type, List<StatusValue> valueList){
		if(valueList == null || type == null) return new ArrayList<>();
		List<StatusValue> retList = new ArrayList<>();
		for(StatusValue target : valueList){
			if(target.matchType(type)){
				retList.add(target);
			}
		}
		return retList;
	}
	
	/**
	 * 入力したリストから指定したタイプの値を抽出する。
	 * @param type 抽出したいステータスタイプ
	 * @param values 抽出対象
	 * @return 
	 */
	public static List<StatusValue> filter(ConstStatusType type, StatusValue... values){
		return filter(type, Arrays.asList(values));
	}
}
