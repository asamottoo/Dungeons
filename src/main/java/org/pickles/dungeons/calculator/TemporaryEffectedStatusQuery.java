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
public class TemporaryEffectedStatusQuery extends StatusQuery {
	
	private final StatusValue temporary;

	public TemporaryEffectedStatusQuery(StatusQueryType type, StatusValue init, StatusValue temp) {
		super(type, init);
		this.temporary = temp;
	}
	
	public StatusValue getTemporary(){
		return this.temporary;
	}
	
	
}
