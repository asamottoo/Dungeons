/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pickles.dungeons.calculator;

import java.util.Arrays;
import java.util.List;
import lombok.NonNull;

/**
 * ステータスを生成する
 * @author t.asamoto
 */
public class StatusFactory {
	
	private static final List<ConstStatusType> variableGaugeSet = Arrays.asList(
		ConstStatusType.HIT_POINT,
		ConstStatusType.MENTAL_POINT,
		ConstStatusType.SATIETY_POINT
	);
	
	private static final List<ConstStatusType> expandableSet = Arrays.asList(
		ConstStatusType.POWER,
		ConstStatusType.SPEED,
		ConstStatusType.STAMINA,
		ConstStatusType.DEXTERITY,
		ConstStatusType.MAGIC,
		ConstStatusType.LUCK
	);
	
	
	public static Status init(@NonNull StatusValue value){
		
		for(ConstStatusType type : variableGaugeSet){
			if(value.matchType(type)){
				return new VariableGaugeValue(value);
			}
		}
		
		for(ConstStatusType type : expandableSet){
			if(value.matchType(type)){
				return new ExpandableValue(value);
			}
		}
		
		return new DefaultStatus();
	}
	
	
}
