class Reserve implements Runnable{
    int available =1;
    int wanted;
    Reserve(int i){
        wanted = i;
    }
    public void run(){
        synchronized(this){
        System.out.println("Available berths="+available);
        if(available>=wanted){
            String name= Thread.currentThread().getName();
            System.out.println(wanted+"Berths reserved for "+name);{
                try{
                    Thread.sleep(1500);
                    available = available-wanted;
                }
                catch (InterruptedException e){

                }
            }
        }
        else{
            System.out.println("sorry, no berths available");
        }
    }
    }
}
public class Unsafe {
    public static void main(String[] args) {
        Reserve obj = new Reserve(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread (obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
    
}