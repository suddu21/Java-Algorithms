import java.util.*; 
	class Stack
	{ 
		public static final int capacity=4; 
		int[] arr=new int[capacity]; 
		int top=-1; 
		public void push(int pushedElement)
		{ 
			if(top<capacity-1)
			{ 
				top++; 
				arr[top]=pushedElement; 
				System.out.println("Element "+pushedElement+" is pushed into Stack!"); 
			} 
				else 
				{ 
					System.out.println("stack overflow!");
				 } 
		} 
			public void pop() 
			{ 
				if(top>=0)
				{ 
					System.out.println(top); 
					System.out.println("pop operation is successful!"); 
					System.out.println("and popped element is:"+arr[top--]); 
					System.out.println(top); 
				} 
			        else 
			       { 
				System.out.println("stack underflow!"); 
			       } 
			} 
				public void printElement() 
				{ 

				    if(top>=0) 
				         { 
					     System.out.println("elements in stack are:"); 
					  for(int i=top;i>=0;i--) 
						{ 
						System.out.println(arr[i]); 
						} 
				         } 
					   else 
					   { 
					    System.out.println("stack is empty"); 
					   } 
				 } 
		} 

	class StackDem
	{ 
		public static void main(String[] args) 
		{ 
		     Stack stackDemo=new Stack(); 
		     Scanner in=new Scanner(System.in); 
		     int Choice; 
			   do 
			   { 
				System.out.println("*******MENU*******\n1.Push\n 2.Pop\n 3.Display\n4.Exit"); 
				System.out.println("\n enter your choice:-"); 
				Choice=in.nextInt(); 
			switch(Choice) 
			      { 
				case 1:System.out.println("enter number to be pushed:-"); 
				int Number=in.nextInt(); 
				stackDemo.push(Number); 
				break; 
				case 2:stackDemo.pop(); 
				break; 
				case 3:stackDemo.printElement(); 
				break;
				 default: if(Choice!=4) System.out.println("invalid choice"); 
			      } 
			   }
			     while(Choice!=4); 
		}
	}