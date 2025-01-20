import java.util.*;
import java.lang.*;
class FractionFloatSum{
	public static void main(String[] args) {
		float a,b;
		Scanner fp=new Scanner(System.in);
		System.out.println("Enter two float ");
		a=fp.nextFloat();
		b=fp.nextFloat();
		float s=(a-(int)a)+(b-(int)b);
		System.out.println("The sum of fraction parts of two float numbers is "+s);
	}
}