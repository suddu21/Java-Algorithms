import java.util.Scanner;
class Hello
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); //System.in is a standard input stream.
System.out.println("Enter first number- ");
int weather = sc.nextInt();
switch(weather)
{
case 0 :
System.out.println("Sunny");
break;
case 1 :
System.out.println("Rainy");
break;
case 2 :
System.out.println("Cold");
break;
case 3 :
System.out.println("Windy");
break;
default :
System.out.println("Pleasant");
}
}
}