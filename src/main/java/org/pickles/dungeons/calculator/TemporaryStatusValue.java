package org.pickles.dungeons.calculator;

/**
 *
 * @author t.asamoto
 */
public class TemporaryStatusValue extends StatusValue {
	private final int turn;
	public TemporaryStatusValue(StatusValue init, int turn) {
		super(init);
		this.turn = turn;
	}
}
