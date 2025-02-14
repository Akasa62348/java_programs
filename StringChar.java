import java.util.*;
class StringChar{
    public static void main(String args[]){
        String str, s; char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        str = sc.nextLine();
        ch = Character.toUpperCase(str.charAt(0));
        s = str.substring(1,str.length());
        s = ch+s;
        System.out.println("output string="+s);
    }
}