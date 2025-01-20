import java.io.*;
import java.util.*;
class ConvertCharCase{
	public static void main(String[] args)throws IOException {
		char ch;
		System.out.println("Enter any Alaphabet");
		Scanner sc=new Scanner(System.in);
		ch=(char)System.in.read();
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
			// if((int)ch>=65&&(int)ch<=65+25){
			// 	ch=(char)(ch+32);
			// 	System.out.println(ch+"");
			// }else{System.out.println(ch+"");}}
			if((int)ch>=97&&(int)ch<=97+25){
				ch=(char)(ch-32);
				System.out.println(ch+"");
			}else{System.out.println(ch+"");}}
			else System.out.println("Invalid");
		}}

			
