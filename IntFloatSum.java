import java.util.*;
class IntFloatSum{
	public static void main(String[] args) {
		float a,b;
		Scanner fp=new Scanner(System.in);
		System.out.println("Enter two float ");
		a=fp.nextFloat();
		b=fp.nextFloat();
		int s=(int)a+(int)b;
		System.out.println("The sum of integer parts of two float numbers is "+s);
	}
}