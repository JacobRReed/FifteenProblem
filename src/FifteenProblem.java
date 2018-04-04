import java.util.ArrayList;
import java.util.Arrays;

public class FifteenProblem {
	private static String myInitString;
	private static String myMethod;
	private static String myOption;
	private static Integer myIntOption;
	private static char myInitState[][];
	private static Tree myTree;
	private static final String[] SEARCH_METHODS = {"BFS", "DFS", "DLS", "GBFS", "AStar"};
	
	public static void main(String[] theArgs) {
		//myInitState = theArgs[0];
		//myMethod = theArgs[1];
		//myOption = theArgs[2];
		myInitString = "123456789AB DEFC";
		myMethod = "BFS";
		myOption = "10";
		myInitState = new char[4][4];
		
		//Argument Checks
		if(myInitString.length() != 16) {
			throw new IllegalArgumentException("[initialstate] must be 16 characters!");
		}
		if(!Arrays.asList(SEARCH_METHODS).contains(myMethod)) {
			throw new IllegalArgumentException("[searchmethod] must be BFS, DFS, DLS, GBFS, or AStar!");
		}
		if(myMethod.equals("GBFS") || myMethod.equals("AStar")) {
			if(!myOption.equals("h1") || !myOption.equals("h2")) {
				throw new IllegalArgumentException("[option] for GBFS/AStar must be h1 or h2!");
			}
		}
		if(myMethod.equals("DLS")) {
			if(myOption != null && myOption.matches("[-+]?\\d*\\.?\\d+")) {
				myIntOption = Integer.parseInt(myOption);
			}else {
				throw new IllegalArgumentException("[option] for DLS must be a number!");
			}
			
		}
		//End Argument Checks
		
		//Create 2D array from argument
		String row1 = myInitString.substring(0,4);
		String row2 = myInitString.substring(4,8);
		String row3 = myInitString.substring(8,12);
		String row4 = myInitString.substring(12,16);
		ArrayList<String> puzzleStrings = new ArrayList<String>();
		puzzleStrings.add(row1);
		puzzleStrings.add(row2);
		puzzleStrings.add(row3);
		puzzleStrings.add(row4);
		for(int i = 0; i < puzzleStrings.size(); i++) {
			myInitState[i] = ((String) puzzleStrings.get(i)).toCharArray();
		}
		//End 2D Array Creations
		Node rootNode = new Node(myInitState);
		myTree = new Tree(rootNode);
		
		switch(myMethod) {
		case "BFS":
			searchBFS();
			System.out.println("Searching via BFS");
			break;
		case "DFS":
			searchDFS();
			System.out.println("Searching via DFS");
			break;
		case "DLS":
			searchDLS();
			System.out.println("Searching via DLS");
			break;
		case "GBFS":
			searchGBFS();
			System.out.println("Searching via GBFS");
			break;
		case "AStar":
			searchAStar();
			System.out.println("Searching via AStar");
			break;
		default:
			searchBFS();
			System.out.println("Search type not found. Defaulting to BFS search");
			break;
		}
		
		System.out.println("Root:\n" + Arrays.deepToString(myTree.getRoot().getState()).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		System.out.println("--Depth: " + myTree.getDepth());
		System.out.println("--Visited: " + myTree.getVisited());
		System.out.println("--Max Fringe: " + myTree.getMaxFringe());
	}
	
	private static void searchBFS() {
		//TODO
	}
	
	private static void searchDFS() {
		//TODO
	}
	
	private static void searchDLS() {
		//TODO
	}
	
	private static void searchGBFS() {
		//TODO
	}
	
	private static void searchAStar() {
		//TODO
	}
}
