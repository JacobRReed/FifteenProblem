import java.util.ArrayList;
import java.util.Queue;

public class Tree {
    private Node myRoot; //init state
    private Queue<Node> myFringe;
    private ArrayList<Node> myVisited;
    private Integer myMaxFringe;
    private Integer myDepth;
    
    //Priority expand order Right->Down->Left->Up
    public Tree(final Node theRoot) {
    	myRoot = theRoot;
    	myMaxFringe = 0;
    	myDepth = 1;
    	myVisited = new ArrayList<Node>();
    }
    
    public ArrayList<Node> getVisited() {
    	return myVisited;
    }
    
    public Integer getMaxFringe() {
    	return myMaxFringe;
    }
    
    public Node getRoot() {
    	return myRoot;
    }
    
    public Integer getDepth() {
    	return myDepth;
    }
}