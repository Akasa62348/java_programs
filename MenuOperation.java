import java.util.*; 
class MenuOperation{ 
public static void main(String[] args) {
	System.out.println("Enter 1st number");
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	System.out.println("Enter 2nd number");
		double b=sc.nextDouble();
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Subtraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Division");
	System.out.println("Press 5 for Modulus");
	System.out.println("Press 6 for Power");
	

	System.out.println("Press 7 for Exit");
	Double c=null;
	int m=sc.nextInt();
	switch (m){
	case 1:
		c=a+b;
		break;
	case 2:
		c=a-b;
		break;
	case 3:
		c=a*b;
		break;
	case 4:
		c=a/b;
		break;
	case 5:
		c=a%b;
		break;
	case 6:
		c=Math.pow(a,b);
		break;
	
	case 7:
		sc.close();
		break;
	default:
		System.out.println("Invalid Input");
	}
	System.out.println("Result= "+c);



}

}