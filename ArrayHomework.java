import java.util.*;   
class ArrayHomework{
	public static void main(String[] args) {
		//int arr[]={10,12,3,5,9,7,18,16,4,5};
	// int i,j,k;
	// 	for(i=0;i<arr.length;i+=j){
	// 		for(j=i;j<arr.length;j++){
	// 			if(arr[j]%2==1)
	// 				break;
	// 		}
	// 		for(k=j+1;k<arr.length;k++){
	// 			if (arr[k]%2==0)
	// 				break;
	// 		}
	// 		int t=arr[j];
	// 		arr[j]=arr[k];
	// 		arr[k]=t;
	// 	}
	// 	for(i=0;i<arr.length;i++){
	// 		System.out.print (arr[i]+" "); 
	// 	}




		//7.  ascending input

int arr[]=new int[10];
int i,j,n;
Scanner sc=new Scanner (System.in);
for(i=0;i<arr.length;i++){
	n=sc.nextInt();
	j=i-1;
	while(j>=0){
		if(arr[j]>n){
			arr[j+1]=arr[j];
		}
		else break;
		j=j-1;
	}
	arr[j+1]=n;
	}
	for(i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}
}