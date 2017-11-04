package org.pickles.dungeons.calculator;

import lombok.EqualsAndHashCode;

/**
 * ステータスタイプと値を保持するオブジェクト。
 * 値の変更は不可能。
 * @author t.asamoto
 */
@EqualsAndHashCode
public class StatusValue implements Status {
	
	/**
	 * デフォルトインスタンスを生成する。
	 * @return 値が0, ステータスタイプがUNSUPPORTであるインスタンス
	 */
	public static StatusValue getUnsupport(){
		return new StatusValue(0, ConstStatusType.UNSUPPORTED);
	}
	
	protected int value;
	protected final StatusType type;
	
	public StatusValue(StatusValue init){
		this.value = init.value;
		if(value < 0) throw new IllegalArgumentException(String.join("",
				"Input Value is illegal. Expect value is 1, but input value is ",
				String.valueOf(value),
				"."
		));

		this.type = init.type;
	}
	
	public StatusValue(int value, StatusType type){
		this.value = value;
		if(value < 0) throw new IllegalArgumentException(String.join("",
				"Input Value is illegal. Expect value is 1, but input value is ",
				String.valueOf(value),
				"."
		));

		this.type = type;
	}
	
	@Override
	public StatusType getStatusType(){
		return type;
	}

	@Override
	public boolean matchType(StatusType target){
		return this.type.equals(target);
	}
	
	public boolean matchType(StatusValue target){
		return this.type.equals(target.type);
	}
	
	public StatusValue reverse(){
		return new StatusValue(this.value - this.value - this.value, this.type);
	}
}
