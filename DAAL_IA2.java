import java.util.Scanner;

class HamCycle
{
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter No. of Vertices");
		n=in.nextInt();
		int g[][]=new int[10][10];
		System.out.println("Enter adjacency matrix of graph");
		for(int i=0;i<n; i++)
		  for(int j=0;j<n; j++)
			  g[i][j] =in.nextInt();
		hamCycle(g);
	}

	static boolean hamCycle(int g[][])
	{
		int path[]= new int[n+1];
		for(int i=0;i<n;i++)
			path[i]=-1;
		path[0]=0;
		if(hamCycleUtility(g,path,1)==false)
		{
			System.out.println("No solution exists");
			return false;
		}
		printSol(path);
		return true;
	}

	static boolean hamCycleUtility(int g[][], int path[], int pos)
	{
		if(pos==n)
		{
			if(g[path[pos-1]][path[0]]==1) 
				return true;
			else 
				return false;
		}
			for(int i=1; i<n; i++)
			{
				if(isSafe(i,g,path,pos)) 
				{
					path[pos]=i;
					if(hamCycleUtility(g,path,pos+1)==true)
						return true;
					path[pos]=-1;
				}
			}
				return false;
	}

	static boolean isSafe(int v, int g[][], int path[], int pos)
	{
		if (g[path[pos-1]][v]==0)
			return false;
		for(int i=0; i<pos; i++) 
			if (path[i]==v)
				return false; 
		return true;
	}

	static void printSol(int path[])
	{
		System.out.println("This is one Hamiltonian Cycle");
		for(int i=0; i<n; i++)
			System.out.print((path[i]+1)+"-->");
		System.out.println((path[0]+1));
	}
}