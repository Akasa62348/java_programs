import java.util.*;  
class MenuOpearand{
	public static void main(String[] args)throws  Exception {
		double a,b,r;
		char c;
		System.out.println("Enter 1st number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		System.out.println("Enter 2nd number");
		b=sc.nextDouble();
		System.out.println("Enter any arithmetic operator");
		c=(char)System.in.read();
		switch(c){
		case '+':
			r=a+b;
			System.out.println(a+"+"+b+"="+r);
			break;
		case '-':
			r=a-b;
			System.out.println(a+"-"+b+"="+r);
			break;
		case '*':
			r=a*b;
			System.out.println(a+"*"+b+"="+r);
			break;
		case '/':
			r=a/b;
			System.out.println(a+"/"+b+"="+r);
			break;
		case '%':
			r=a%b;
			System.out.println(a+"%"+b+"="+r);
			break;
		case '^':
			r=Math.pow(a,b);
			System.out.println(a+"^"+b+"="+r);
			break;
		default:
			System.out.println("Invalid operator");
			sc.close();
		}

	}
}