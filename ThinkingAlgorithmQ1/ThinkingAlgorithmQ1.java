package ThinkingAlgorithmQ1;

import ThinkingAlgorithmQ1.MovementsConcreteClass.EmptyJugAMovement;
import ThinkingAlgorithmQ1.MovementsConcreteClass.EmptyJugBMovement;
import ThinkingAlgorithmQ1.MovementsConcreteClass.FillJugOneMovement;
import ThinkingAlgorithmQ1.MovementsConcreteClass.FillJugTwoMovement;
import ThinkingAlgorithmQ1.MovementsConcreteClass.PourJugAIntoBMovement;
import ThinkingAlgorithmQ1.MovementsConcreteClass.PourJugBIntoAMovement;

public class ThinkingAlgorithmQ1 {

	public class JugConstants {

		public static final int JUG_ONE_CAPACITY = 5;
		public static final int JUG_TWO_CAPACITY = 3;

	}

	public static void main(String[] args) {

		System.out.println();
		State initialState = new State(0, 0, new NullState(0, 0, null));
		StateManager manager = StateManager.getInstance();
		manager.addState(initialState);

		MovementArray movementArray = new MovementArray();
		Movement emptyJugAMovement = new EmptyJugAMovement();
		Movement emptyJugBMovement = new EmptyJugBMovement();
		Movement fillJugOneMovement = new FillJugOneMovement();
		Movement fillJugTwoMovement = new FillJugTwoMovement();
		Movement pourJugAIntoBMovement = new PourJugAIntoBMovement();
		Movement pourJugBIntoAMovement = new PourJugBIntoAMovement();

		movementArray.addMovement(emptyJugAMovement);
		movementArray.addMovement(emptyJugBMovement);
		movementArray.addMovement(fillJugOneMovement);
		movementArray.addMovement(fillJugTwoMovement);
		movementArray.addMovement(pourJugAIntoBMovement);
		movementArray.addMovement(pourJugBIntoAMovement);

		var index = 0;
		while (manager.getSize() > 0) {
			System.out.println("Index: " + index);
			State parent = manager.getLastState();

			var numOfAddedChild = movementArray.hasStateBeenAdded(parent);
			if (numOfAddedChild == 0) {
				parent.setVisited(true);
				manager.addToVisitedState(parent);
				parent.getParent().setNumOfChildern(parent.getParent().getNumOfChildern() - 1);
				manager.removeLastState();
			}
			parent.setNumOfChildern(numOfAddedChild);
			index++;
			manager.print();

		}

		// TODO Auto-generated method stub

	}

}
