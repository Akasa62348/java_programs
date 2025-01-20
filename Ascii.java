import java.io.*;
class Ascii{
	 public static void main(String[] args) throws IOException {
		char ch;
		System.out.println("Enter character");
		ch=(char)System.in.read();
		System.out.println("Ascii value of "+ch+" is "+(int)ch);
	}
}