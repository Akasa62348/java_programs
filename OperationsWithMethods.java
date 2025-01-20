import java.util.*;  
class Count{
	void count(int n){
		int c=0,n1=n;
		while(n>0){
			n/=10;
			c++;
		}System.out.println(n1+" is of "+c+" digits");
	}
}
class Sum{
	void sum(int n){
		int s=0,n1=n;
		while(n>0){
			int d=n%10;
			s+=d;
			n/=10;
		}System.out.println("Sum of the digits of "+n1+" is "+s);
	}
}
class Reverse{
	void reverse(int n){
		int rev=0,n1=n;
		while(n>0){
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}System.out.println("Reverse of "+n1+" is "+rev);
	}
}
class Palindrome{
	void palindrome(int n){
	int rev=0,n1=n;
		while(n>0){
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		if(rev==n1)System.out.println(n1+" is a Palindrome");
		   else System.out.println(n1+" is NOT a Palindrome ");
		   }	
	}


class OperationsWithMethods{
	public static void main(String[] args) {
		System.out.println("Enter any number  then select operations to perform on it.");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Press 1 to COUNT total digits of the number");
		System.out.println("Press 2 to get SUM of all digits of the number");
		System.out.println("Press 3 to get REVERSE of the number");
		System.out.println("Press 4 to Check if the number is PALINDROME or NOT");



		int y=sc.nextInt();
		switch (y) {
		case 1:
			Count c=new Count();
			c.count(x);
			break;
		case 2:
			Sum s=new Sum();
			s.sum(x);
			break;
		case 3:
			Reverse r=new Reverse();
			r.reverse(x);
			break;
		case 4:
			Palindrome p=new Palindrome();
			p.palindrome(x);
			break;
		default:
			System.out.println("You have chosen an INVALID option (*_*)---(^..^)");
		}
	}
}