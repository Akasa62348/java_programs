import java.util.*;  
class EachDigit{
	public static void main(String[] args) {

		//1. print each digit of the number

		// System.out.println("Enter any number");
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// while(n>0){
		// 	int d=n%10;
		// 	System.out.print(d+" ");
		// 	n/=10;
		// }

         //2. print sum of all digits

        // System.out.println("Enter any number");
        //    int s=0;
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// while(n>0){
		// 	int d=n%10;
		// 	s+=d;
		// 	n/=10;
		// }System.out.println(s);

		//3. reverse the number

		//   System.out.println("Enter any number");
        //    int rev=0;
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// while(n>0){
		// 	int d=n%10;
		// 	rev=rev*10+d;
		// 	n/=10;
		// }System.out.println(rev);

		//4. determine palindrome

		//   System.out.println("Enter any number");
        //    int rev=0;
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// int n1=n;
		// while(n>0){
		// 	int d=n%10;
		// 	rev=rev*10+d;
		// 	n/=10;
		// }
		// if(rev==n1){
		// 	System.out.println(n1+" is PALINDROME");
		// }else System.out.println(n1+" is NOT palindrome");

         //5. Armstrong or not

	// 	  System.out.println("Enter any number");
       //     double arm=0;
	// 	Scanner sc=new Scanner(System.in);
	// 	int n=sc.nextInt();
	// 	int n1=n,n2=n;
	// 	double armsum=0;
	// 	while(n>0){
	// 		int d=n%10;
	// 		 arm++;
	// 		n/=10;
	// 	}
	// 	System.out.println(arm);

       // while(n1>0){
       // 	double d1=n1%10;
       // 	armsum+=(Math.pow(d1,arm));
       // 	n1/=10;
       // }
       // System.out.println(armsum);
       // if(armsum==n2){
       // 	System.out.println(n2+" is an Armstrong Number");
       // }else System.out.println(n2+" is NOT an armstrong number");

        //6. find biggest digit

		// System.out.println("Enter any number");
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// int big=0,n1=n;
		// while(n>0){
		// 	int d=n%10;
		// 	if(big<d)big=d;
		// 	n/=10;
		// }
		// System.out.println(big+" is the biggist digit in "+n1);

            // 7. print table of 1 to 5 in column wise

		for(int i=1;i<=10;i++){
			for(int j=1;j<=5;j++){
				System.out.print(i*j+"	");
			}System.out.println("");
		}
         
         //8. print factorial of 1 to 7

       //   int fact=1;
       // for(int i=1;i<=7;i++){
       // 	for(int j=1;j<=i;j++){
       // 		 fact*=j;
       // 	}System.out.print(i+"-"+fact+" ");
       // 	fact=1;
       // }

          //9. print factorial of each digit

		// System.out.println("Enter any number");
		// Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// int fact=1;
		// while(n>0){
		// 	int d=n%10;
		// 	for(int j=1;j<=d;j++){
       	// 	 fact*=j;
       	// }System.out.print(d+"-"+fact+" ");
       	//     fact=1;
		// 	n/=10;
		// }

         //10. print all prime numbers from 2 to 50;

        //   int i,j;
		// for(i=2;i<=50;i++){
		// 	for(j=2;j<=i/2;j++){
		// 		if(i%j==0)break;
		// 	}	if(j>i/2)	 System.out.print(i+" ");

		// }

		//11. count total armstrong numbers from 100 to 999

		// int i,j,n,d,c=0,arms=0;
		// for( i=100;i<=999;i++){
		// 	arms=0;
		// 	n=i;
		// 	for(j=1;j<=3;j++){
				
		// 		 d=n%10;
		// 		arms+=(Math.pow(d,3));
		// 		n=n/10;

		// 	}
		// 	if (arms==i) c++;
				
		// }System.out.println(c);

		//12. print sum of the series
          
        // int i;double sum=0;
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter value of x");
		// int x=sc.nextInt();
		// System.out.println("Enter number of terms");
        // int n=sc.nextInt();
        // for(i=1;i<=n;i++){
        // 	sum=sum+(Math.pow(x,i));
        // }System.out.println(sum);

	}
}