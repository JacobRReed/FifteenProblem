import java.util.ArrayList;
import java.util.Queue;

public class Tree {
    private Node myRoot; //init state
    private Queue<Node> myFringe;
    private ArrayList<Node> myVisited;
    private Integer myMaxFringe;
    private Integer myDepth;
    private Integer myNodesCreated;
    private Integer myNumExpanded;
    
    //Priority expand order Right->Down->Left->Up
    public Tree(final Node theRoot) {
    	myRoot = theRoot;
    	myMaxFringe = 0;
    	myDepth = 0;
    	myVisited = new ArrayList<Node>();
    	myNodesCreated = 0;
    	myNumExpanded = 0;
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
    
    public Integer getCreated() {
    	return myNodesCreated;
    }
    
    public Integer getExpanded() {
    	return myNumExpanded;
    }
}