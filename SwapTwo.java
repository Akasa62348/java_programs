import java.util.*;
 class SwapTwo{
	public static void main(String[] args) {
		int a,b,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Your entered numbers are "+a +" "+b);
		s=a;
		a=b;
		b=s;
				System.out.println("Your swapped numbers are "+a +" "+b);

	}
} 
    

