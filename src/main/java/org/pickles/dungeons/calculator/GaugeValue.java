package org.pickles.dungeons.calculator;

/**
 * 最大値と現在値を持つステータス値クラス
 * @author t.asamoto
 */
public class GaugeValue extends ExpandableValue {
	
	protected int now = 10000;
	
	public GaugeValue(StatusValue init){
		super(init);
		this.now = this.value;
	}
	
	@Override
	public StatusValue getNow(){
		return new StatusValue(now, this.type);
	}

	@Override
	public StatusResult effect(StatusValue effect){
		if(!this.matchType(effect)) return StatusResult.NOT_MATCH;
		this.now += effect.value;
		if(this.now < 0){
			this.now = 0;
			return StatusResult.EMPTY;
		}
		
		if(this.now > value){
			this.now = this.value;
			return StatusResult.FULL;
		}
		
		return StatusResult.OK;
	}
	
	@Override
	public StatusResult getNowResult(){
		if(this.now <= 0) return StatusResult.EMPTY;
		if(this.now >= value) return StatusResult.FULL;
		return StatusResult.OK;
	}
}
