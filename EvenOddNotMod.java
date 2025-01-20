import java.util.*;
class EvenOddNotMod{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if((n & 1)== 0){
			System.out.println("Even");
		}else System.out.println("Odd");
	}
}