class MyThread implements Runnable {
String s;
MyThread(String str)
{
    this.s=str;
}
public void run()
{
    int i;
    for(i=1; i<=5; i++)
    {
        try {
            System.out.println(s+" "+i);
            Thread.sleep(1000);
           // System.out.println(s);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}   
}
class MultiThreading {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread("CUTyour ticket"));
        Thread t2=new Thread(new MyThread("Show the ticket"));
        t1.start();
        t2.start();
    }
}