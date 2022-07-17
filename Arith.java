class Arith
{
	public static void main(String[] args)
	{
		int num[][]=new int[3][3];
		int i,j;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				num[i][j]=i*3+j+1;
		for(i=0;i<3;i++)
			{for(j=0;j<3;j++)
				System.out.print(" "+num[i][j]);
			System.out.println("");}
	}
}