import java.util.*; 

	class Subset
	{
		public static void main(String[] args)
		{
			Scanner in=new Scanner(System.in); 
			System.out.println("enter number of elements:"); 
			int n=in.nextInt();
			int[] s=new int[n];
			System.out.println("enter number of elements increasing order:"); 
			for(int i=0;i<n;i++)
			{
					s[i]=in.nextInt(); // enter the elements in increasing order
			}
				System.out.println("enter the sum of subset:"); 
				int d=in.nextInt(); // positive sum value of integer type
				subset(n,d,s); // call to the subset method/function
			}
				static void subset(int n, int d, int[]s)
				{
					int found=0,i;
					int[] se1=new int[50]; 
						for(i=0;i<n;i++)
						{
						se1[i]=0; // All the elements initialled assigned as Zero 
						}
						int k=0,sum=0; 
						se1[k]=1; // Making zeroth element has One (selection of first element) 
							while(k>=0) // Here we keep checking elements from DFS, when K<=0 backtrack loop stops 
							{
							if(k<n && se1[k]==1) // here the number is checked subset
							{
								if(sum+s[k]==d) // if we found the number will add to the sum value 
								{
									found=1; // This message is appropiate as per the question we have to display message
									System.out.print("the solution is \n{"); 
							for(i=0;i<n;i++)
							{
								if(se1[i]==1) 
								{
									System.out.print(s[i]+",");// we have to display the element
								}
							}
								System.out.println("}\n\n"); 
								se1[k]=0;
						}
						else if(sum+s[k]<d) // the number selected does not help to sum 
						  sum = sum+s[k];
 						else
 							se1[k]=0;  // then make  that element as zero.
							} 

						else
						{
							do
							{ 	
								k--;
		 					}
					while(k>=0 && se1[k]==0);  // Here backtracking process 
							if(k>=0)
							{
								se1[k]=0;    
								sum=sum-s[k];  // remove the particular number from sum, and select for other number 
							}
					}
							if(k>=0)
							{
								k++;
								se1[k]=1;
							}
				}
					if(found==0)  // after selecting the numbers, 
						//if the sum is not computed we print the message after while loop
					{
						System.out.println("\n\n the solution does not exit");
					}
				}
	}
