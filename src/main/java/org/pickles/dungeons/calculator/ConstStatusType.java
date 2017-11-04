/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pickles.dungeons.calculator;

/**
 * ステータスの種類を表現する。
 * @author t.asamoto
 */
public enum ConstStatusType implements StatusType {
	HIT_POINT("hitPoint"),
	MENTAL_POINT("mentalPoint"),
	SATIETY_POINT("satietyPoint"),
	POWER("power"),
	SPEED("speed"),
	STAMINA("stamina"),
	DEXTERITY("dexterity"),
	MAGIC("magic"),
	LUCK("luck"),
	UNSUPPORTED("unsupported");

	ConstStatusType(String type){
		this.type = type;
	}

	private String type;

	public String getType(){
		return type;
	}

	public boolean equals(StatusType target){
		return this.getType().equals(target.getType());
	}
}
