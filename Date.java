import java.util.*;
class Date{
	public static void main(String[] args) {
		int d,m,y;
		System.out.println("Enter date in DD/MM/YYYY format");
		Scanner dmy=new Scanner(System.in);
		d=dmy.nextInt();
		m=dmy.nextInt();
		y=dmy.nextInt();
		System.out.println("Date is  Day-"+d+",Month-"+m+",Year-"+y);
	}
}