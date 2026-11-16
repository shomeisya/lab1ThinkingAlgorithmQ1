package ThinkingAlgorithmQ1;

public class DFS extends SearchAlgorithm {

	@Override
	public State getElement() {
		// TODO Auto-generated method stub
		StateManager manager = StateManager.getInstance();
		return manager.getLastState();
	}

	@Override
	public void removeElement() {
		// TODO Auto-generated method stub
		StateManager manager = StateManager.getInstance();
		manager.removeLastState();

	}

}
