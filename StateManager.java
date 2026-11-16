package ThinkingAlgorithmQ1;

import java.util.ArrayList;

public class StateManager {

	private static final StateManager instance = new StateManager();

	private ArrayList<State> states;
	private ArrayList<State> visitedState;

	// Private constructor
	private StateManager() {
		states = new ArrayList<>();
		visitedState = new ArrayList<State>();
	}

	// Get the singleton instance
	public static StateManager getInstance() {
		return instance;
	}
	
	public boolean addToVisitedState(State state) {
		return visitedState.add(state);
	}

	// Add a new state
	public boolean addState(State state) {
		if (visitedState.contains(state) || states.contains(state)) {
			return false;
		}
		states.add(state);
		return true;

	}

	// Get all states
	public State getLastState() {
		return states.getLast();
	}
	

	// Get all states
	public State getFirstState() {
		return states.getFirst();
	}
    
	public State removeFirstElement() {
		return states.removeFirst();
	}
	public float getLastParentX() {
		if (states.getLast().getParent() == null) {
			return 0;
		}
		return states.getLast().getParent().getX();
	}

	public float getLastParentY() {
		if (states.getLast().getParent() == null) {
			return 0;
		}
		return states.getLast().getParent().getY();
	}

	public int getSize() {
		return states.size();
	}

	// Get all states
	public ArrayList<State> getStates() {
		return states;
	}

	// Get a state by index
	public State getState(int index) {
		return states.get(index);
	}

	// Remove a state
	public void removeState(int index) {
		states.remove(index);
	}

	// Remove a state
	public void removeLastState() {
		states.removeLast();
	}

	// Clear all states
	public void clearStates() {
		states.clear();
	}

	public void print() {
		System.out.println(states.toString());
	}
}