import java.util.*;
class BiggestFour{
	public static void main(String[] args) {
		int n1,n2,n3,n4;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		if(n1>n2&&n1>n3&&n1>n4){
			System.out.println("Biggest number is "+n1);}
		else if(n2>n3&&n2>n4){
	System.out.println("Biggest number is "+n2);
	}
	else if(n3>n4){
	System.out.println("Biggest number is "+n3);

		}
		else System.out.println("Biggest number is "+n4);

	}
	}
