package ThinkingAlgorithmQ1;

public abstract class Movement {
	public boolean addToTraverseArray(State parent) {
		if (!this.isPossibleMovementInThisState(parent)) {
			return false;
		}

		StateManager manager = StateManager.getInstance();
		State generatedState = this.generateState(parent);
		return manager.addState(generatedState);

	}

	public abstract State generateState(State parent);

	public abstract boolean isPossibleMovementInThisState(State parent);

}
