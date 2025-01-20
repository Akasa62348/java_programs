import java.util.*;
class PosNeg{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>=1){
			System.out.println("Positive");
		}
		else if (n<0) System.out.println("Negative");
		if(n==0){
			System.out.println("Zero is neither +ve nor-ve");
		}

	}
}