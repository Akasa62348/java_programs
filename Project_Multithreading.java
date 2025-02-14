import java.util.Scanner;
class QuestionAnswer implements Runnable{
    Scanner sc = new Scanner(System.in);
    int i;
    int score=0;
    String str;
    String []ques = {   "Q No.1: Who is the founder of C? ", 
                        "Q No.2: Who is the founder of C++? ", 
                        "Q No.3: Who is the founder of Java? ", 
                        "Q No.4: Who is the founder of Python? ", 
                        "Q No.5: Who is the founder of HTML? ", 
                        "Q No.6: Who is the founder of CSS?",
                        "Q No.7: Who is the father of Computer? ", 
                        "Q No.8: Who is the father of Internet? ", 
                        "Q No.9: How many layers are there in TCP/IP model?", 
                        "Q No.10: How many layers are there in OSI model?" 
                        };

    String []ans = {    "Dennis Ritchie",
                        "Bjarne Stroustrup",
                        "James Arthur Gosling",
                        "Guido van Rossum",
                        "Tim Berners Lee",
                        "Hakon Wium Lie",
                        "Charles Babbage",
                        "Vint Cerf",
                        "4",
                        "7"
                    };
    public void run(){
        synchronized(this)
        {
        try{
            for(i=0; i<10; i++)
            {
                    System.out.println(ques[i]);
                   //long startTime = System.currentTimeMillis();
                    Thread.sleep(5000);
                   //long endTime = System.currentTimeMillis();
                  // long timeInterval = endTime - startTime;
                   //System.out.println(timeInterval);
                    System.out.println("Pls Answer:");
                    str=sc.nextLine();                
                    if (str.equalsIgnoreCase(ans[i])) {
                        score = score+5;
                    }
                    // try {
                    //     Thread.sleep(2000);
                    // } catch (Exception e) { }
            }
        }
        catch(Exception e)
        {}
        }
        System.out.println("Score = "+score);

    }
}

public class Project_Multithreading {
    public static void main(String[] args) {
        QuestionAnswer obj1 = new QuestionAnswer();
        //QuestionAnswer obj2 = new QuestionAnswer();


        Thread t1 = new Thread(obj1);
        // t1.setPriority(10);
        t1.start();
        //Thread t2 = new Thread(obj1);
        //t2.setPriority(9);
       // t2.start();

    }
}