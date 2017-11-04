/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pickles.dungeons.calculator;

/**
 * 
 * @author t.asamoto
 */
public class VariableGaugeValue extends GaugeValue {
	
	protected StatusValue variable;
	
	public VariableGaugeValue(StatusValue init){
		super(init);
		this.variable = new StatusValue(0, init.type);
	}
	
	@Override
	public StatusResult setVariable(StatusValue variable){
		if(this.matchType(variable)) return StatusResult.NOT_MATCH;
		this.variable = variable;
		return StatusResult.OK;
	}
	
	@Override
	public StatusValue getVariable(){
		return variable;
	}
	
	@Override
	public StatusResult update(){
		return this.effect(variable);
	}
}
