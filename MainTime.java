import java.util.*;
class Time implements Runnable
{
	public void run(){
		int i,h,m,s,t;
		String arr[]={"AM","PM"};
		for(i=1;i<10;i=i+1){
			Calendar c1=Calendar.getInstance();
			h=c1.get(Calendar.HOUR);
			m=c1.get(Calendar.MINUTE);
			s=c1.get(Calendar.SECOND);
			t=c1.get(Calendar.AM_PM);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
			System.out.println(h+":"+m+":"+s+arr[t]);
		
	}
		}
}
class MainTime{
	public static void main(String[] args) {
		Thread t1=new Thread(new Time());
		t1.start();
	}
}