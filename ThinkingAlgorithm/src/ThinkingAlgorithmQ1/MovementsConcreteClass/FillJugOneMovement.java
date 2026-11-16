package ThinkingAlgorithmQ1.MovementsConcreteClass;

import ThinkingAlgorithmQ1.JugConstants;
import ThinkingAlgorithmQ1.Movement;
import ThinkingAlgorithmQ1.State;


public class FillJugOneMovement extends Movement {

	@Override
	public State generateState(State parent) {
		return new State(JugConstants.JUG_ONE_CAPACITY, parent.getY(), parent);
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isPossibleMovementInThisState(State parent) {
		// TODO Auto-generated method stub
		return parent.getX() < JugConstants.JUG_ONE_CAPACITY;
	}

}
