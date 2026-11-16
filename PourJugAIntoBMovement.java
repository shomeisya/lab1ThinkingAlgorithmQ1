
package ThinkingAlgorithmQ1.MovementsConcreteClass;

import ThinkingAlgorithmQ1.Movement;
import ThinkingAlgorithmQ1.State;
import ThinkingAlgorithmQ1.ThinkingAlgorithmQ1.JugConstants;

public class PourJugAIntoBMovement extends Movement {

    @Override
    public State generateState(State parent) {

        float remainingCapacity =
            JugConstants.JUG_TWO_CAPACITY - parent.getY();

        float transferred = Math.min(
            remainingCapacity,
            parent.getX()
        );

        float newX = parent.getX() - transferred;
        float newY = parent.getY() + transferred;

        return new State(newX, newY, parent);
    }

    @Override
    public boolean isPossibleMovementInThisState(State parent) {

        if (parent.getY() == JugConstants.JUG_TWO_CAPACITY) {
            return false;
        }

        if (parent.getX() == 0) {
            return false;
        }

        return true;
    }
}
