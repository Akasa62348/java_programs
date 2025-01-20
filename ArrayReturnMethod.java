class AllEven{
	int[] alleven(int n[]){
		int arr[]=new int[10],i,j=0;
		for(i=0;i<10;i++){
			if(n[i]%2==0){
				arr[j++]=n[i];
			}
		}
	return arr;
	}
}
class ArrayReturnMethod{
	public static void main(String[] args) {
		int arr1[]={10,12,13,14,16,15,18,19,21,20};
		int n2[],i;
		AllEven obj=new AllEven();
		n2=obj.alleven(arr1);
		for(i=0;i<n2.length;i++){
			System.out.println(n2[i]+" ");
		}
	}
}