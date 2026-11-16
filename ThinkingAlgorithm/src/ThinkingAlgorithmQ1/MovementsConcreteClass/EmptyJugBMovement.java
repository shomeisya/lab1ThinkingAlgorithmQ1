package ThinkingAlgorithmQ1.MovementsConcreteClass;

import ThinkingAlgorithmQ1.Movement;
import ThinkingAlgorithmQ1.State;

public class EmptyJugBMovement extends Movement {

	@Override
	public State generateState(State parent) {
		// TODO Auto-generated method stub
		return new State(parent.getX(), 0, parent);
	}

	@Override
	public boolean isPossibleMovementInThisState(State parent) {
		// TODO Auto-generated method stub
		return true;
	}

}
