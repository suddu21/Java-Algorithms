import java.util.Scanner;

class Strassens
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int A[][] = new int [2][2];
		int B[][] = new int [2][2];
		int C[][] = new int [2][2];
		int m1,m2,m3,m4,m5,m6,m7,c00,c01,c10,c11;

		System.out.println("Enter first matrix");
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				A[i][j]=in.nextInt();

		System.out.println("Enter second matrix");
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				B[i][j]=in.nextInt();
		
		m1=A[0][0]*(B[0][1]-B[1][1]);
		m2=(A[0][0]+A[0][1])*B[1][1];
		m3=(A[1][0]+A[1][1])*B[0][0];
		m4=A[1][1]*(B[1][0]-B[0][0]);
		m5=(A[0][0]+A[1][1])*(B[0][0]+B[1][1]);
		m6=(A[0][1]-A[1][1])*(B[1][0]+B[1][1]);
		m7=(A[0][0]-A[1][0])*(B[0][0]+B[0][1]);

		C[0][0]=m5+m4-m2+m6;
		C[0][1]=m1+m2;
		C[1][0]=m3+m4;
		C[1][1]=m5+m1-m3-m7;

		System.out.println("Product is");
		for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					System.out.print(C[i][j]+"  ");
				System.out.println();
			}
 
	}
}