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
public class StatusQuery extends StatusValue {

	protected final StatusQueryType type;
	
	public StatusQuery(StatusQueryType type, StatusValue init) {
		super(init);
		this.type = type;
	}
	
	public StatusQueryType getStatusQueryType(){
		return type;
	}

	public StatusQuery(StatusQueryType type) {
		super(StatusValue.getUnsupport());
		this.type = type;
	}
}
