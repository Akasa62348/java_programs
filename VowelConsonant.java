import java.io.*;
import java.util.*;
class VowelConsonant{
	public static void main(String[] args)throws IOException {
		char ch;
		System.out.println("Enter any Alaphabet");
		Scanner sc=new Scanner(System.in);
		ch=(char)System.in.read();
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			System.out.println("Vowel");}
		else {System.out.println("Consonant");}}
	else {System.out.println("Invalid");
}
}}