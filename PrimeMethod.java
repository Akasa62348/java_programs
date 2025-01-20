import java.util.*;   
class Prime{
	void prime(int n){
		int i;
		for(i=2;i<=(n/2);i++){
			if(n%i==0){
				System.out.println(n+" is NOT prime");
				break;
			}
		}if(i>(n/2)) System.out.println(n+" is a Prime number");
	}
}
class PrimeMethod{
	public static void main(String[] args) {
		System.out.println("Enter any number to determine if it is prime or not");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Prime obj=new Prime();
		obj.prime(x);
	}
}