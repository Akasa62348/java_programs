import java.util.*;
class GeneralStore{
	public static void main(String[] args) {
		String store[][][]=new String[3][6][6];
		int s,i,j;
		store[0][0][1]="Pen";
		store[0][0][2]="Pencil";
		store[0][0][3]="Copy";
		store[0][0][4]="Book";
		store[0][0][5]="Eraser";

		store[1][0][1]="Pen";
		store[1][0][2]="Pencil";
		store[1][0][3]="Copy";
		store[1][0][4]="Book";
		store[1][0][5]="Eraser";

		store[2][0][1]="Pen";
		store[2][0][2]="Pencil";
		store[2][0][3]="Copy";
		store[2][0][4]="Book";
		store[2][0][5]="Eraser";

		store[0][1][0]="Ram";
		store[0][2][0]="Mohan";
		store[0][3][0]="Sohan";
		store[0][4][0]="Rohan";
		store[0][5][0]="Mukesh";

		store[1][1][0]="Amit";
		store[1][2][0]="Prince";
		store[1][3][0]="Tiwari";
		store[1][4][0]="Balaji";
		store[1][5][0]="Dipin";

		store[2][1][0]="Pankaj";
		store[2][2][0]="Aman";
		store[2][3][0]="Rahul";
		store[2][4][0]="Sujit";
		store[2][5][0]="Ankit";
		Scanner sc=new Scanner(System.in);
		Random random = new Random(); 
		int op;
		for(s=0;s<3;s=s+1)
		{
			//System.out.println("Enter product value for Branch="+(s+1));
			for(i=1;i<6;i=i+1)
			{
				for(j=1;j<6;j=j+1)
				{
					store[s][i][j]=String.valueOf(random.nextInt(100));
				}
			}
		}
		while(true)
		{
			System.out.println("Total Sale for each Store-1");
			System.out.println("Max Sale for each Store-2");
			System.out.println("Name of empolye which sale is max-3");
			System.out.println("Sum of Total item sold each store-4");
			System.out.println("Sum of Selling ammount of each emp of each store-5");
			System.out.println("Press 6 for exit");
			System.out.println("Select your option");
			op=sc.nextInt();
			if(op==1)
			{
			int sum;
				for(s=0;s<3;s=s+1)
				{
					sum=0;
					for(i=1;i<6;i=i+1)
					{
						for(j=1;j<6;j=j+1)
						{
							sum=sum+Integer.parseInt(store[s][i][j]);
						}
					}
				System.out.println("Total Sell of Branch="+(s+1)+" is "+sum);
				}

			}
			else if(op==2)
			{
				int big,sum=0,c=1;
				for(s=0;s<3;s=s+1)
				{
					big=0;

					for(i=1;i<6;i=i+1)
					{
						sum=0;
						for(j=1;j<6;j=j+1)
						{
						sum=sum+Integer.parseInt(store[s][j][i]);	
						}
						if(big<sum){
							big=sum;
							c=i;
						}

					}
				System.out.println("Highest selling Item of branch="+(s+1)+" is "+store[s][0][c]+"="+sum);

				}
			}
			else if(op==3)
			{

			}
			else if(op==4)
			{

			}
			else if(op==5)
			{

			}
			else if(op==6)
			{
				System.exit(0);
			}
		}



		
	}
	
}