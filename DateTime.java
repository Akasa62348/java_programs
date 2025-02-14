import java.util.*;
class DateTime {
public static void main(String[] args) {
    Calendar c1= Calendar.getInstance();
    int d,m,y;
    String mnth[]={"jan","feb","march","apr","may","jun","july","aug","sep","oct","nov","dec"};
    d=c1.get(Calendar.DATE);
    m=c1.get(Calendar.MONTH);
    y=c1.get(Calendar.YEAR);
   
    System.out.println(d+"/"+mnth[m]+"/"+y);
}
    
}