import java.util.*;

class Random_Num_Thread extends Thread	
{
public int num; 
public void run()
{
Random rand; 
int i=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter How many seconds you want to run"); 
int timer=in.nextInt(); 
do
{
rand =new Random();
try
{
num=rand.nextInt(100)+1; 
System.out.println("Number selected randomly is "+num); 
i++; 

Thread thread2=new Square_Num(num); 
thread2.start();
Thread thread3=new Cube_Num(num);
thread3.start();
Thread.sleep(1000);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
 
       }
while(i<timer);
}
}


class Square_Num extends Thread 
{
int n;
public void run()
{
System.out.println("Square of the number "+n+" is: "+Math.pow(n,2));
}
public Square_Num(int a)
{
n=a; 
}
}
class Cube_Num extends Thread
{
int n;
public void run()
{
System.out.println("Cube of a number "+n+" is: "+Math.pow(n,3));
}
public Cube_Num(int a)
{
n=a; 

}
}

class Lab3B
{ 
public static void main(String[] args)
{
Thread thread1 = new Random_Num_Thread(); 

thread1.start(); 

}
}