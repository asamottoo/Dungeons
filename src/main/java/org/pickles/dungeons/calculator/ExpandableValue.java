package org.pickles.dungeons.calculator;

/**
 * 保持している値を変更可能な値オブジェクト。
 * @author t.asamoto
 */
public class ExpandableValue extends StatusValue {
	
	public ExpandableValue(StatusValue init){
		super(init);
	}
	
	/**
	 * ステータスの最大値を拡張する。
	 * ステータスタイプが合致しない場合は動作しない。
	 * @param expand 拡張値。
	 * @return 
	 * ステータスタイプが合わない	: NOT_MATCH
	 * 値が変更された				: OK
	 * 値が0になった				: EMPTY
	 */
	@Override
	public StatusResult expand(StatusValue expand){
		if(!this.matchType(expand)) return StatusResult.NOT_MATCH;
		this.value += expand.value;
		if(this.value < 0) this.value = 0;
		return this.value == 0 ? StatusResult.EMPTY : StatusResult.OK;
	}
}
