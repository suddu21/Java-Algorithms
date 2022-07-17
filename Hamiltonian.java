import java.util.Scanner;

public class Hamiltonian
{
	static int n;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter No. of Vertices");
		n=in.nextInt(); // No. of vertices 
		int graph[][]=new int[10][10];
		System.out.println("Enter adjacency matrix of graph");
			for(int i=0;i<n; i++)
			for(int j=0;j<n; j++)// Input for Hamiltonian cycle
			graph[i][j] =in.nextInt(); // Values of adjacency matrix 
			System.out.println("Entered adjacency matrix of graph is");
				for(int i=0;i<n; i++) // display the matrix values 
				{
						for(int j=0;j<n; j++)
						{
							System.out.print("\t"+graph[i][j]);
						}
						System.out.println();
				}
					hamCycle(graph); // call to Hamiltonian cycle, adjacency matrix is the input 
					System.out.println("\n**********************************\n");
		}

	static void printSolution(int path[])
	{
	System.out.println("Solution Exists:");
	System.out.println("Following is one Hamiltonian Cycle");
		for(int i=0; i<n; i++)
			System.out.println(path[i]);
			System.out.println(path[0]);
	}

	static boolean isSafe(int v,int graph[][], int path[], int pos)
	{
		if (graph[path[pos-1]][v]==0)
				return false;
				for(int i=-0; i<pos; i++) // tracking the possible vertices for path 
					if (path[i]==v)
						return false; // If path not found return false 
					return true;// If path found return true.
	}

	static Boolean hamCycleUtil(int graph[][], int path[], int pos)
	{
		if(pos==n)
		{
			if(graph[path[pos-1]][path[0]]==1)// when you are returning to original vertex, return true 
			return true;
			else return false;// when you are not returning to original vertex, return false 
		}
			for(int v=1; v<n; v++)
			{
				if(isSafe(v, graph,path,pos)) // Here we are checking whether 
					//we have visited all vertices without repetition or not
				{
					path[pos]=v;
					if(hamCycleUtil(graph,path,pos+1)==true) // If obtained proper path return success
						return true;
						path[pos]=-1; // return -1, if not found proper path for cycle
				}
			}
				return false;
	}

	static boolean hamCycle(int graph[][])
	{
		int path[]=new int[n+1];  // This will check for Hamiltonian cycle, whether the path exit or not kind
			for(int i=0; i<n; i++)
			path[i]=-1;
			path[0]=0;
				if(hamCycleUtil(graph, path, 1)==false)
				{
						System.out.println("\nSolution does not exist");
						return false;
				}
					printSolution(path);
					return true;
		}
}