import java.lang.*;
import java.util.*;
class FourDigitSum{
	public static void main(String[] args) {
		int n,d,s=0;
		System.out.println("Enter 4 digit Number");
		Scanner fd=new Scanner(System.in);
		n=fd.nextInt();
		d=n%10;
		s+=d;
		n/=10;
		d=n%10;
		s+=d;
		n/=10;
		d=n%10;
		s+=d;
		n/=10;
		d=n%10;
		s+=d;
		
		System.out.println("The sum of digits is "+s);



	}
}