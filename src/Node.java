import java.util.LinkedList;

public class Node {
	private char[][] myState;
	private Node myParent;
	private LinkedList<Node> myChildren;
	
	public Node(final char[][] theState) {
		myState = theState;
		myChildren = new LinkedList<Node>();
		myParent = null;
	}
	
	public char[][] getState() {
		return myState;
	}
	
	public void setParent(final Node theParent) {
		myParent = theParent;
	}
	
	public void addChild(final Node theChild) {
		myChildren.add(theChild);
	}
	
	public LinkedList<Node> getChildren() {
		return myChildren;
	}
	
	public Node getParent() {
		return myParent;
	}
}
