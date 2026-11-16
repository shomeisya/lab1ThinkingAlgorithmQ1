package ThinkingAlgorithmQ1.MovementsConcreteClass;

import ThinkingAlgorithmQ1.JugConstants;
import ThinkingAlgorithmQ1.Movement;
import ThinkingAlgorithmQ1.State;

public class FillJugTwoMovement extends Movement {
	@Override
	public State generateState(State parent) {

		return new State(parent.getX(), JugConstants.JUG_TWO_CAPACITY, parent);
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isPossibleMovementInThisState(State parent) {
		// TODO Auto-generated method stub
		return parent.getY() < JugConstants.JUG_TWO_CAPACITY;
	}

}
