import java.util.*;
import java.io.*;
class IdentifyChar{
	public static void main(String[] args)throws IOException {
		char ch;
	System.out.println("Press any key");
Scanner sc=new Scanner(System.in);
		ch=(char)System.in.read();
		if((int)ch>=65&&(int)ch<=65+25){
			System.out.println(ch+" is Uppercase");
		}
	else if((int)ch>=97&&(int)ch<=97+25){
			System.out.println(ch+" is Lowercase");
		}
		else if((int)ch>=48&&(int)ch<=48+9){
			System.out.println(ch+" is Numeric");
		}
else{
			System.out.println(ch+" is Special Character");
		}
	}
}