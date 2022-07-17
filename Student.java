import java.util.*;
class Students
{
	String usn, name, branch, phone;
	Students(String u, String n, String b, String p)
	{
		usn=u;
		name=n;
		branch=b;
		phone=p;
	}
}

class Student
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = in.nextInt();
		Students[] st= new Students[n];
		String name,branch,usn,ph;
		System.out.println("Enter usn, name, branch, phone");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of student"+(i+1));
			usn=in.next();
			name=in.next();
			branch=in.next();
			ph=in.next();
			st[i]=new Students(usn, name, branch, ph);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("USN  Name  Branch  Ph");
			System.out.println(st[i].usn+"  "+st[i].name+"  "+st[i].branch+"  "+st[i].phone);
		}
	}
}