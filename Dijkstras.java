/* 7.From a given vertex in a weighted connected graph, 
 find shortest paths to other vertices using Dijkstra's algorithm. 
  Write the program in Java.*/

/*Technique used: Greedy Method
Dijkstra’s Algorithm:
Dijkstra's algorithm is an algorithm for finding the shortest paths between nodes in a graph, 
which may represent, for example, road networks.
For a given source node in the graph, the algorithm finds the shortest path between 
that node and every other.*/

//Dijkstra's Algorithm 

import java.util.*; 
class Shortest
{
public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in); 
		System.out.println("enter the number of vertices:"); 
		int n=in.nextInt(); // accept no. of vertices of a graph
		int[][] c=new int[n+1][n+1]; // cost adjacency matrix or all edges present in the graph
		System.out.println("enter the cost adjacency matrix"); 
			for(int i=1;i<=n;i++) // cost adjacency matrix rows
			for(int j=1;j<=n;j++) // cost adjacency matrix columns 
				c[i][j]=in.nextInt(); // cost adjacency weights or values
				System.out.println("enter the source node"); 
				int src=in.nextInt(); // after accepting the cost adjacency matrix, we have know source vertex
				                     // this source node can be first node, second node , third node anyother node
				dijkstra(n,src,c); // passing no. of nodes, source node and cost adj matrix
	}

	public static void dijkstra(int n, int src, int[][] c)
	{
			int j;
			int[] dist = new int[n+1]; 
				for(j=1;j<=n;j++)
				dist[j] =c[src][j]; // cost adjacency value will be entered if there is an edge or infinity 
				                     // will be stored into dist[j] array
				int[] vis=new int[n+1]; 
				vis[src]=1;// initially we have visited the source node 1
				
				for(j=1;j<=n;j++)
				{
					if(j!=src)//we are checking this because source node need not be first node always, can be any node
					vis[j]=0; //initialized to zero for other nodes as we have not visited 
				}
			int count=1,min,u=1; // as we visited first node count is 1, it stops when all the nodes covered
			                      //min cost computing, u=1 which node is visited to get minimum cost
				while(count!=n) // ending criteria based on vertices visited count
				{
					min=99; // min=99, every time we want to find the smallest distance
					        // it means every time we want have min as highest value 
					         // for each and every iteration of the count
					for(j=1;j<=n;j++)
					{
							if(dist[j]<min && vis[j]!=1)// to find the smallest distance and also we should check
								                        //  the node which is already visited in previous iteration
							{
								min=dist[j]; // find the node which is not visited and 
								             //having least distance from source vertex
								u=j;           
							}
					}
							vis[u]=1; // update the visited node to 1
							count++;  // increment the node as we have selected new node 
							for( j=1;j<=n;j++)  // Now, we have to update all the remaining vertices 
							{
								if(min+c[u][j]<dist[j]&&vis[j]!=1) //mincost + from that node to other particular node is 
									                              // less than dist[j] and the node wouldn't have visited  
									
								dist[j]=min+c[u][j]; // then we update the dist value 
							}  // this process happens till you find shortest path for each and every node
				}                  
								System.out.println("the shortest path is:\n"); 
								for(j=1;j<=n;j++)
								System.out.println(src+"<--->"+ j +":"+dist[j]); // from the source node to each and every 
								                                                 // node what is the shortest dist 
		}
}