/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pickles.dungeons.stage;

/**
 *
 * @author t.asamoto
 */
public interface CellUnit {

	/**
	 * 入力した座標と一致するセルかどうかを調べる
	 * @param vertical 調べたい垂直座標
	 * @param horizontal 調べたい水平座標
	 * @return 一致する場合はtrue, 一致しない場合はfalse
	 */
	public boolean matchCoordinate(int vertical, int horizontal);
	
	/**
	 * このセルに設定されているエフェクトを返す
	 * @return エフェクト
	 */
	public CellEffect getEffect();
	
	
}
