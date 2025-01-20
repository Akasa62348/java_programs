import java .util.*;  
class Arithmetic{
	int sum(int a,int b){
		int c;
		c=a+b;
		return c;
	}
	void sub(int a,int b){
		int c;
		c=a-b;
		System.out.println("Sub="+c);
	}
	void mul(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("Mul= "+c);

	}
	int div(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		return c;

	}
}
class MethodDemo{
	public static void main(String[] args) {
		Arithmetic obj=new Arithmetic();
		int x=obj.sum(10,12);
		System.out.println("Sum= "+x);
		obj.sub(15,10);
		obj.mul();
		x=obj.div();
		System.out.println("Division= "+x);
	}
}