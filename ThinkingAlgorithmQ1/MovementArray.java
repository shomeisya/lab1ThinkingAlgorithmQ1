package ThinkingAlgorithmQ1;

import java.util.ArrayList;


public class MovementArray {
	private ArrayList<Movement> movements = new ArrayList<Movement>();

	public MovementArray() {

	}

	public int hasStateBeenAdded(State state) {
		var counter = 0;
		for (Movement movement : movements) {

			if (movement.addToTraverseArray(state)) {
				System.err.println(movement.getClass().getCanonicalName());
				counter++;
			}
		}
		return counter;
	}

	public void addMovement(Movement movement) {
		movements.add(movement);
	}

	public ArrayList<Movement> getMovements() {
		return movements;
	}

}
