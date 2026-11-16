package ThinkingAlgorithmQ1;

import java.util.ArrayList;

public class MovementArray {
	private ArrayList<Movement> movements = new ArrayList<Movement>();

	public MovementArray() {

	}

	public int hasStateBeenAdded(State state) {
		var counter = 0;
		System.out.println( "Done Actions to add these states, Note action that produce repeated state are ignored:" );
		for (Movement movement : movements) {
		

			if (movement.addToTraverseArray(state)) {
				var movementNameFull = movement.getClass().getCanonicalName();
				String moveMentName = movementNameFull.substring(movementNameFull.lastIndexOf('.') + 1);

				System.out.println(moveMentName);
				counter++;
			}
		}
		System.out.println();
		return counter;
	}

	public void addMovement(Movement movement) {
		movements.add(movement);
	}

	public ArrayList<Movement> getMovements() {
		return movements;
	}

}
