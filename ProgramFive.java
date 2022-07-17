import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class ProgramFive
{
public static void main(String[] args)
{
int number_of_elements;
int array[]=new int[10000]; 
long startTime; 
long stopTime;
Scanner scan = new Scanner(System.in);
Random random = new Random(); // to generate random numbers 
Mergesort mSort = new Mergesort();// object mSort of Mergesort
System.out.println("Enter value of N:");
number_of_elements = scan.nextInt();
//scan.close(); // optional 
int ch;
System.out.println("Merge Sort");
System.out.println("1. Best Case");
System.out.println("2. Average Case");
System.out.println("3. Worst Case");
ch = scan.nextInt();
 switch (ch) 
{
case 1:System.out.println("Before sorting the elemenets are as follows:");
for(int i=0; i<number_of_elements; i++) 
{
array[i]=i+1;
System.out.print(array[i] + " ");
}

startTime=System.nanoTime();
mSort.sort(array, 0, number_of_elements-1);
stopTime= System.nanoTime(); 
System.out.println("Sorted Array");
for (int i = 0; i<number_of_elements; i++) 
{
System.out.println(array[i]+ " ");
 }

System.out.println("Time taken to sort: " +
(stopTime - startTime)+ " seconds to sort array.");
 break;
 case 2:System.out.println("Random Number:");
System.out.println("Before sorting the elemenets are as follows:");
for(int i=0; i<number_of_elements; i++) 
{

array[i]=random.nextInt(9876);
System.out.print(array[i] + " ");
}

startTime=System.nanoTime();
mSort.sort(array, 0, number_of_elements-1);
stopTime= System.nanoTime();
System.out.println("Sorted Array");
for (int i = 0; i<number_of_elements; i++) 
 {
System.out.println(array[i]+ " ");
 }

System.out.println("Time taken to sort: " +
(stopTime - startTime)+ " seconds to sort array.");
 break;
 case 3: System.out.println("Before sorting the elemenets are as follows:");
for(int i=0; i<number_of_elements; i++) 
{
array[i]=number_of_elements - i;
System.out.print(array[i] + " ");
}

startTime=System.nanoTime();
mSort.sort(array, 0, number_of_elements-1);
stopTime= System.nanoTime();
System.out.println("Sorted Array");
for (int i = 0; i<number_of_elements; i++) 
 {
System.out.println(array[i]+ " ");
 }

System.out.println("Time taken to sort: " +
(stopTime - startTime)+ " seconds to sort array.");
 break;
 }//switch
}// end of main()
} // end of ProgramFive
class Mergesort
{

private void merge(int[] array,int low, int mid, int high)
{
int i=low;
int j=mid+1;
int k=low; 
//temporary array to store the sorted values of arrays in it, 
//again with a capacity to hold 10000 array
int resultArray[] = new int[10000]; 
while(i<=mid && j<=high) // When while condition is true.
{

// to result array, and increment i and k
if(array[i] <array[j]) {
resultArray[k] = array[i]; // left side part 
i = i+1;
k = k+1;
}
// otherwise we copy the contents of j to result array.
else
{
resultArray[k] = array[j]; // right side part 
j = j+1;
k = k+1;
}
}
while(i<=mid) // when this is true(left part)
// we transfer the remaining elements to result array(left part)
resultArray[k++]= array[i++]; 
while(j<= high)//when this is true(right part)

resultArray[k++]=array[j++];
for(int m=low;m<=high;m++)
// Transferring all the elements into reference array 
array[m]=resultArray[m];
}
// Sorting of the elements 
public void sort(int[] array, int low,int high) 
{
 
if(low<high) 
{
int mid=(low+high)/2;
// recursive call on left sub array
this.sort(array,low,mid);
// recursive call on right sub array
this.sort(array, mid+1,high);
// once left and right elements are 

this.merge(array, low, mid, high);
}
}
}