class CountInteger{
	static int countInt(String ... n) {
		int i,c=0;
		for(i=0;i<n.length;i++){
		// 	try{
		// 		Integer.parseInt(n[i]);
		// 	}
		// 	catch(Exception e){
		// 		c++;
		// 	}
		// }i=n.length-c;
		// return i;
			if(isInteger(n[i])) c++;
	}return c;}
	public static void main(String[] args) {
		int x;
		x=countInt("Ram","123","1729","sohan","2.56");
		System.out.println(x);
	}
}