class MyException extends Exception
{
	private static int arr[]={10,12,15,30,35};
	MyException(String msg)
	{
		super(msg);
	}
	public static void main(String args[])
	{
		int i;
		try{
			for(i=0;i<5;i=i+1)
			{
				if(arr[i]>=30 && arr[i]<=34)
				{
					MyException obj =new MyException("Num is between 30 to 35");
					throw obj;
				}
				System.out.println(arr[i]);
			}
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}