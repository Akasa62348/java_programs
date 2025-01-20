import java.lang.*;
import java.util.*;
class ReverseFour{
	public static void main(String[] args) {
		int n,d,rev=0;
		System.out.println("Enter 4 digit Number");
		Scanner fd=new Scanner(System.in);
		n=fd.nextInt();
		d=n%10;
		rev=rev*10+d;
		n/=10;
		d=n%10;
		rev=rev*10+d;
		n/=10;
		d=n%10;
		rev=rev*10+d;
		n/=10;
		d=n%10;
		rev=rev*10+d;
		
		System.out.println("The reverse is "+rev);



	}
}