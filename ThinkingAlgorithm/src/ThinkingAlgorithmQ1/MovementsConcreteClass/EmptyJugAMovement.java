package ThinkingAlgorithmQ1.MovementsConcreteClass;

import ThinkingAlgorithmQ1.Movement;
import ThinkingAlgorithmQ1.State;

public class EmptyJugAMovement extends Movement {

	@Override
	public State generateState(State parent) {

		return new State(0, parent.getY(), parent);
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPossibleMovementInThisState(State parent) {
		// TODO Auto-generated method stub
		return true;
	}

}
