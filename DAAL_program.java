import java.util.*;
import java.util.Random;
import java.util.Scanner;

class MergeDemo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		MergeSort msort = new MergeSort();
		int arr[] = new int[5000];
		int n,i;
		long start,stop;
		System.out.println("Enter no. of elements");
		n= in.nextInt();
		System.out.println("Enter choice:- \n1. Best case\n2.Avg case\n3.Worst case");
		int ch = in.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Before sorting:- \n------------------------");
			        for(i=0; i<n; i++)
			        {
			        	arr[i]=i+1;
			        	System.out.print(arr[i]+"\t");
			        }
			        start = System.nanoTime();
			        msort.sort(arr,0,n-1);
			        stop = System.nanoTime();
			        System.out.println("After sorting:-\n------------------------");
			        for(i=0; i<n; i++)
			        {
			        	System.out.print(arr[i]+"\t");
			        }
			        System.out.println("Time taken= "+(stop-start)+" nanoseconds");
			        break;
			case 2: System.out.println("Before sorting:- \n------------------------");
			        for(i=0; i<n; i++)
			        {
			        	arr[i]=rand.nextInt(100)+1;
			        	System.out.print(arr[i]+"\t");
			        }
			        start = System.nanoTime();
			        msort.sort(arr,0,n-1);
			        stop = System.nanoTime();
			        System.out.println("After sorting:-\n------------------------");
			        for(i=0; i<n; i++)
			        {
			        	System.out.print(arr[i]+"\t");
			        }
			        System.out.println("Time taken= "+(stop-start)+" nanoseconds");
			        break;
			case 3: System.out.println("Before sorting:- \n------------------------");
			        for(i=0; i<n; i++)
			        {
			        	arr[i]=n-i;
			        	System.out.print(arr[i]+"\t");
			        }
			        start = System.nanoTime();
			        msort.sort(arr,0,n-1);
			        stop = System.nanoTime();
			        System.out.println("After sorting:-\n------------------------");
			        for(i=0; i<n; i++)
			        {
			        	System.out.print(arr[i]+"\t");
			        }
			        System.out.println("Time taken= "+(stop-start)+" nanoseconds");
			        break;
			default: System.out.println("Invalid choice");
		}
	}
}

class MergeSort
{
	void sort(int a[], int low, int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			this.sort(a,low,mid);
			this.sort(a,mid+1,high);
			this.merge(a,low,mid,high);
		}
	}

	void merge(int a[], int low, int mid, int high)
	{
		int i=low, k=low;
		int j=mid+1;
		int result[] = new int[5000];
		while((i<=mid)&&(j<=high))
		{
			if(a[i]<a[j])
			{
				result[k]=a[i];
				k=k+1;
				i=i+1;
			}
			else
			{
				result[k]=a[j];
				k=k+1;
				j=j+1;
			}
		}
		while(i<=mid)
			result[k++]=a[i++];
		while(j<=high)
			result[k++]=a[j++];
		for(int z=low;z<=high;z++)
			a[z]=result[z];
	}
}