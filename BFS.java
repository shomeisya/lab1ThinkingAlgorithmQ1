package ThinkingAlgorithmQ1;

public class BFS extends SearchAlgorithm {

	@Override
	public State getElement() {
		// TODO Auto-generated method stub
		StateManager manager = StateManager.getInstance();
		return manager.getFirstState();
	}

	@Override
	public void removeElement() {
		// TODO Auto-generated method stub
		StateManager manager = StateManager.getInstance();
		manager.removeFirstElement();
	}

}
