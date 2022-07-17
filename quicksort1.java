import java.util.Random;
import java.lang.*;

class Quicksort
{
	void sort(int a[])
	{
		//start_time=System.nanoTime();
		int n=a.length;
		System.out.print("Unsorted list:-\n");
		System.out.print("-----------------------\n");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" , ");
		}
		System.out.print("\n");
		System.out.print("-----------------------\n");
		
		int start=0;
		while(start<n-1)
		{
			for(int j=start+1;j<n;j++)
			{
				if(a[start]>a[j])
				{
					int temp=a[j];
					a[j]=a[start];
					a[start]=temp;
				}
			}
			start++;
		}
		
		System.out.print("Sorted list:-\n");
		System.out.print("-----------------------\n");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" , ");
		}
		System.out.print("\n");
		System.out.print("-----------------------\n");
		
	}
}

class QuicksortDemo
{
	public static void main(String[] args)
	{
		int n=10;//Enter array size here
		int array[]= new int[n];
		Random rand = new Random();
		for(int i=0;i<n;i++)
		{
			array[i]=rand.nextInt(100);
		}
		
		Quicksort ob = new Quicksort();
		
		long start_time=System.nanoTime();
		ob.sort(array);
		long stop_time=System.nanoTime();
		
		System.out.print("Time taken is " + (stop_time-start_time) + " nanoseconds");
	}
}