import java.util.Scanner;

public class Minmax {
   
   public static void main(String args[]) {


   	  int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  

n=sc.nextInt();  
 
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  

array[i]=sc.nextInt();  
}  	
      

      int max = array[0];
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }

      int min = array[0];
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }

      System.out.println("Maximum value in the array is::"+max);
      System.out.println("Minimum value in the array is::"+min);
   }
}