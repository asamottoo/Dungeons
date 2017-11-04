/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pickles.dungeons.stage;

import lombok.Data;

/**
 *
 * @author t.asamoto
 */
@Data
public class Coordinate {

	private int vertical = -1;
	private int horizontal = -1;
	
	/**
	 * 入力されたCoordinateインスタンスと同じ位置を示しているかどうかを返す
	 * @param target
	 * @return 
	 */
	public boolean match(Coordinate target){
		return this.vertical == target.vertical && this.horizontal == target.horizontal;
	}
	
}
