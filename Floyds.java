import java.util.*;


class FloydsAlgo 
  {
 		public static void main(String[] args) {
			   int i,j;
			  
			Scanner in=new Scanner(System.in);
			   System.out.println("enter the number of vertices");
			   int n=in.nextInt(); // No of vertices from the user 
			   int[][] c=new int[n+1][n+1];
			   System.out.println("enter the cost adjancency matrix \n");
			   for(i=1;i<=n;i++)
			   	for(j=1;j<=n;j++)
					c[i][j]=in.nextInt();// cost adjacency matrix 
			   all_paths(c,n); // Calling Floyds method 
			   System.out.println("shortest path is \n");
			   for(i=1;i<=n;i++)
			   {
			   		for(j=1;j<=n;j++)
					System.out.print(c[i][j]+"\t");
				    System.out.println();
			   }
 		}
		public static void all_paths(int[][] c,int n)
		{
			   for(int k=1;k<=n;k++) // represents intermediate node to find the shortest path between the vertex
			   {
				for(int i=1; i<=n; i++) // rows of the matrix
					if(c[i][k]!=99 && c[i][k]!=0) 
					{
					  for(int j=1;j<=n;j++) // columns of the matrix
					     if(c[k][j]!=99 && c[k][j]!=0)// when the intermediate nodes are infinity or zero no use 
				 // only when it not infinity or zero the below statement executes to compute shortest path
						c[i][j]=min(c[i][j],c[i][k]+c[k][j]);
					 }
			     }
			}
				public static int min(int a, int b)  // to computer the minimum value of c[i][j] statement 
				{
					return (a<b)?a:b; 
				}
	}// end of FloydsAlgo