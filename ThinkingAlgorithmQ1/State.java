package ThinkingAlgorithmQ1;

public class State {
	private float x;
	private float y;
	private State parent;
	private boolean visited;
	private int numOfChildern;

	public State(float x, float y, State parent) {
		this.x = x;
		this.y = y;
		this.setParent(parent);

	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		State state = (State) obj;

		return Float.compare(x, state.x) == 0 && Float.compare(y, state.y) == 0;
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(x, y);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " [ " + this.getX() + " , " + this.getY() + " ] ";
	}

	public State getParent() {
		return parent;
	}

	public void setParent(State parent) {
		this.parent = parent;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getNumOfChildern() {
		return numOfChildern;
	}

	public void setNumOfChildern(int numOfChildern) {
		this.numOfChildern = numOfChildern;
	}

	 

}
