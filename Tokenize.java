import java.util.*;
import java.util.StringTokenizer;

class Customer
{
private String name;
private String date_of_birth;

public void readData()
{
Scanner in=new Scanner(System.in); 
System.out.println("customer details:");
System.out.print("Enter Name:");
name=in.next(); 
System.out.print("Enter Date of birth:");
date_of_birth=in.next();
}
public void displayData()
{
StringTokenizer st=new StringTokenizer(this.date_of_birth,"/");


System.out.print(this.name); 
while(st.hasMoreTokens()) 
{
System.out.print(","+st.nextToken());
}
}
} 

class CustomerStringToken
{
public static void main(String[] args)
{

Customer cust=new Customer();
cust.readData();
cust.displayData();
}
}