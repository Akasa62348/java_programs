import java.util.*;  
class Consonants{
	public static void main(String[] args) {
		for(int i='A';i<='Z';i++){
			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
				continue;
			}
			System.out.println((char)i);
		}
	}
}