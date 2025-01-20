import java .util.*;
class Demo{
	int sum(int...n){
		int i,s=0;
		for(i=0;i<n.length;i++){
			s+=n[i];
		}return s;
	}
public static void main(String[] args) {
	Demo d=new Demo();
	int x;
	x=d.sum(10,12,13,18);
	System.out.println(x);
	x=d.sum(5,4);
	System.out.println(x);
	int arr[]={4,8,9,};
	x=d.sum(arr);
	System.out.println(x);

}

}
