class StringBufferDemo
{
	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("Computer");
		str.append("+Mouse");
		System.out.println(str);
		str.insert(8,"+cpu");
		System.out.println(str);
		str.delete(8,12);
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		StringBuffer str2= new StringBuffer("Computer");
		str2.replace(1,3,"mpu");
		System.out.println(str2);
		StringBuffer str3=new StringBuffer("Ram is good boy,he read in class 5,he is good in study");
		System.out.println(str3.length());
		System.out.println(str3.capacity());


	}
}