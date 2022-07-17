/*8.Find Minimum Cost Spanning Tree of a given undirected graph using Kruskal's algorithm
*/

/*Technique used: Greedy Method
Kruskal's algorithm is a minimum-spanning-tree algorithm which finds an edge of the least 
possible weight that connects any two trees in the forest. 
It is a greedy algorithm in graph theory as it finds a minimum spanning tree for a connected 
weighted graph adding increasing cost arcs at each step. 
This means it finds a subset of the edges that forms a tree that includes every vertex, 
where the total weight of all the edges in the tree is minimized. 
If the graph is not connected, then it finds a minimum spanning forest.

Time complexity: 0(NlogN)
Program:*/

import java.util.*; 
class Kruskal
{
	public static void main(String[] args)
	{
		Kruskal obj=new Kruskal();
		Scanner in=new Scanner(System.in); 
		System.out.println("enter no of vertices:");
		int n=in.nextInt(); // no. of vertices are accepted as input 
		int ch;
		int[][] d=new int[n+1][n+1]; // two dimensional array for cost adjacency matrix 
			System.out.println("enter cost martix:"); 
				for(int i=1;i<=n;i++) // cost adjacency matrix values no. of rows 
					{
					for(int j=1;j<=n;j++)  // cost adjacency matrix values no. of columns 
					{
						d[i][j]=in.nextInt(); 
					}

						d[i][i]=99; // if there is a direct edge the value or infinity value
						            // we are going to change the diagonal elements because to move from a specific
						          // location to specific location the distance required is only zero.
						         // but if we keep it as zero, while finding min spanning tree we get values zero
						        // which is not our requirement  
					}
						obj.krus(d,n); // passing cost adjacency matrix and no. of vertices
			}
	void krus(int[][] c, int n)
	{
			int a=0,b=0,u=0,v=0; 
			int[] parent=new int[n+1];
			int ne=0;
				for(int i=1;i<=n;i++) // initially all the nodes not mentioned any nodes or connected 
				parent[i]=0; 
				int mincost=0; 
				while(ne!=n-1) // initially we have not selected any edge so no. of edges is zero 
				{
					int min=99; // infinity value 
					for(int i=1;i<=n;i++)
					{                         // we are going to find the edge with least path 
						for(int j=1;j<=n;j++)  // arranging all the elements in ascending order the kruskal algo concept
							if(c[i][j]<min)  // finding the smallest value from the given matrix, we search entire matrix
							{
								min=c[i][j]; // gives us the edge between minimum value
								a=u=i;  // both the statement gives the
								b=v=j;   // position of the values 
							}
					}
						while(parent[u]!=0)
						u=parent[u];    // find() of psuedo code
						while(parent[v]!=0)
						v=parent[v];     // find() of psuedo code 
							if(u!=v) // proceed inside if statement only if it true, if false a cycle or closed form is formed
							{
								System.out.println("\n"+a+"--->"+b+":"+min); 
								parent[v]=u;  // Union () of psuedo code 
								mincost=mincost+min; // adding the minimum cost to previous minimum cost values 
								ne=ne+1; //adding new edge to tree
							}
								c[a][b]=c[b][a]=99; // as we are using undirected graph, making it as infinity
				}
					System.out.println("\n mincost="+mincost);
 
	}
}