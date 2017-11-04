/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pickles.dungeons.calculator;

import java.util.ArrayList;
import java.util.List;
import org.pickles.dungeons.StatusValueUtils;

/**
 *
 * @author t.asamoto
 */
public class TemporaryEffectedVariableGaugeValue extends VariableGaugeValue {

	public TemporaryEffectedVariableGaugeValue(StatusValue init) {
		super(init);
	}
	
	protected int turn = 0;
	protected List<StatusValue> tempList = new ArrayList<>();

	/**
	 * 一時的に可変量を変更する。
	 * @param temporary
	 * @return 
	 */
	public StatusResult temporary(StatusValue temporary){
		if(this.matchType(temporary)) return StatusResult.NOT_MATCH;
		if(temporary == null) return StatusResult.UNSUPPORT;
		if(temporary instanceof TemporaryEffectedStatusQuery)
			tempList.add(((TemporaryEffectedStatusQuery) temporary)
				.getTemporary());
		tempList.add(temporary);
		return StatusResult.OK;
	}
	
	@Override
	public StatusResult update(){
		if(tempList == null) return super.update();
		return this.effect(StatusValueUtils.join(variable, tempList));
	}
}
