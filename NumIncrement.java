import java.io.*; 
import java.util.*;   
class NumIncrement{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter any integer value");

		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		if(n>=500){
			n=n+50;
			System.out.println(n+"");
		}else if(n>=400){
			n=n+40;
			System.out.println(n+"");
		}else if(n>=300){
			n=n+30;
			System.out.println(n+"");
		}else if(n>=200){
			n=n+20;
			System.out.println(n+"");
		}else if(n>=100){
			n=n+10;
			System.out.println(n+"");
		}else if (n>=50){
			n=n+5;
						System.out.println(n+"");

		}
	}
}