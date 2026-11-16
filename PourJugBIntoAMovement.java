
package ThinkingAlgorithmQ1.MovementsConcreteClass;

import ThinkingAlgorithmQ1.Movement;
import ThinkingAlgorithmQ1.State;
import ThinkingAlgorithmQ1.ThinkingAlgorithmQ1.JugConstants;

public class PourJugBIntoAMovement extends Movement {

    @Override
    public State generateState(State parent) {

        float remainingCapacity =
            JugConstants.JUG_ONE_CAPACITY - parent.getX();

        float transferred = Math.min(
            remainingCapacity,
            parent.getY()
        );

        float newX = parent.getX() + transferred;
        float newY = parent.getY() - transferred;

        return new State(newX, newY, parent);
    }

    @Override
    public boolean isPossibleMovementInThisState(State parent) {

        if (parent.getX() == JugConstants.JUG_ONE_CAPACITY) {
            return false;
        }

        if (parent.getY() == 0) {
            return false;
        }

        return true;
    }
}
