import java.util.Random;
import java.util.*;
import java.util.Scanner;
class QuickSort {
private int partition(int[] a, int low, int high) {
int temp;

// a[low]represents first element of index,
//Here ,p is assigned as the very first element to be pivot
element

int p = a[low];
int i = low + 1; // i, it starts from next

element after the pivot element

int j = high; // represents last element of

index or it begins from other end of the array

while (low &lt; high) // will be true until a[i]becomes greater than pivot element
{

while(a[i] &lt;=p &amp;&amp; i&lt;high)
i = i+1;

//here j is starting from last element of

array, until a[j] is greater than pivot value

// we can keep on decrement by 1, j will stop

as soon as an element is less than the pivot element

while(a[j] &gt; p)
j= j-1;
// if i&lt;j is true, we swap the elements

keeping an intermediate variable temp

if(i&lt;j) {
temp = a[i];
a[i] = a[j];
a[j] = temp;
}

// in case i&lt;j is false that is i as crossed

j

//then we will swap a[j] value to first
element ie: pivot element using again the temp variable

else {
temp=a[low];
a[low]=a[j];
a[j]=temp;
return j;

}

}
return j;

}

// Sorting the elements
// Here sort() takes 3 parameters an array, first

index(low) and last index(high)

public void sort(int[] a, int low, int high) {
// when low&lt;high, we pass the array, index of
first element, index of last element to partition method

if(low &lt; high)
{
int mid=this.partition(a,low,high);
sort(a,low,mid-1);// recursive call to

left side of the array

sort(a,mid+1,high); // recursive call

to right side of the array

} // once low become &gt; high if statement

terminates
}
}

//main class
public class ProgramFour {
public static void main(String[] args) {
int n=2;
int[] random_numbers=new int[5000];// array,

to hold the capacity of 5000 random numbers
long startTime,stopTime;
// to generate random number,
//we have created the object

number_generator of Random class type

Random number_generator = new Random();
Scanner scan = new Scanner(System.in); //

reading data for input

QuickSort QS = new QuickSort();
System.out.print(&quot;Enter N value:&quot;);
n=scan.nextInt(); // reading integer value

of n 5

scan.close(); //optional
System.out.println(&quot;Array before sorting&quot;);
for(int i=0;i&lt;n;i++)
{

random_numbers[i] =

number_generator.nextInt(1000);// before sorting generate random
numbers

System.out.print(random_numbers[i]+ &quot;

&quot;);

}
System.out.println(&quot;&quot;);
startTime=System.nanoTime();
QS.sort(random_numbers,0,n-1);//array

is random_num, low is 0 and high is n-1

stopTime = System.nanoTime();
System.out.println(&quot;Sorted Array&quot;);
for (int i = 0; i &lt; n; i++) {

System.out.println(random_numbers[i]+&quot; &quot;);

}

// to get positive value perform stopTime - startTime
System.out.println(&quot;Time taken to sort: &quot; + (stopTime -
startTime)+ &quot;seconds&quot;);

}// end of main
}// end of class ProgramFour