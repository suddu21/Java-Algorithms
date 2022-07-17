/*9.	Find Minimum Cost Spanning Tree of a given undirected graph using Prim’s Algorithm.
Prim's algorithm is a greedy algorithm that finds a minimum spanning tree for a weighted undirected graph. 
This means it finds a subset of the edges that forms a tree that includes every vertex, 
where the total weight of all the edges in the tree is minimized. 
The algorithm operates by building this tree one vertex at a time, 
from an arbitrary starting vertex, at each step adding the cheapest possible connection 
from the tree to another vertex.*/

 
import java.util.*; 
public class Prims
{
		public static void main(String[] args)
		{
			Prims obj=new Prims();
			Scanner in=new Scanner(System.in); 
			System.out.println("enter no of vertices:"); 
			int n=in.nextInt(); // Accept the no. of vertices from the user
			int ch;
			int[][] e=new int[n+1][n+1]; // two dimensional array 
				System.out.println("enter cost martix:"); // accept the cost adjacency matrix 
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n;j++)
					{
						e[i][j]=in.nextInt();// accepting the values of cost adjacency matrix
						                     // since we accept adjacency matrix the diagonal elements will be zero
					}                         // while computing minimum cost, it will result zero, 
					e[i][i]=99; // So, we have are going to assign as 99 for infinity for that diagonal elements 
				}
					obj.prim(e,n);// passing cost adjacency matrix and no. of vertices
}
 

		void prim(int[][] g,int n)
		{
			int mincost=0;
			int[] visited=new int[n+1]; // this is require to state that we are visiting all the nodes 
			visited[1]=1; // Prims algorithm always starts as source as A, so we are making it as 1.
				for(int k=2;k<=n;k++) // then we start from 2nd node onwards 
					visited[k]=0;      // initially all the nodes are assigned to zero 
				for(int k=1;k<n;k++)  // this is for selecting n-1 edges
				{
					int min=99; 
					int u=1;  // starting from first node its value is 1
					int v=1;  // first edge 
					for(int i=1;i<=n;i++)
					{
						if(visited[i]==1) // here we are finding for unvisited nodes 
						{
							for(int j=1;j<=n;j++)
							{
								if(g[i][j]<min)  // Now, among all visited nodes, we are finding the minimum cost edge
								{
									min=g[i][j]; // once we obtain the edge with minimum cost 
									u=i;  //Here, u being part of spanning tree,
									v=j;  //whereas v is not part of spanning tree
								}
							}
						}
					}
						mincost=mincost+g[u][v]; // adding that new edge to the spanning tree, 
						            // since are adding the edge the cost of spanning will be added to minimum cost 
						visited[v]=1; // then we make visited node as 1. 
						System.out.println("("+u+","+v+")"+" is:"+g[u][v]);//once node is visited we select it as part 
						                                                  // of spanning tree
						for(int i=1;i<=n;i++) // this both for loops used to remove the edges
							for(int j=1;j<=n;j++)// that will not lead to cycle formation 
								if(visited[i]==1 && visited[j]==1) 
									g[i][j]=g[j][i]=99; // in order to avoid any cycle formation we are using this
				}
				System.out.println("\n mincost="+mincost); // finally, when we come to n-1 edges, we compute mincost
		}
}