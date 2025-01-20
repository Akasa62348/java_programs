import java.util.*;  
class TwoDArray{
	public static void main(String[] args) {
		// 1. 
		// int arr[][]=new int[5][5];
		// int i,j;
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter data for 5*5 matrix");
		// for(i=0;i<arr.length;i++){
		// 	for(j=0;j<arr.length;j++){
		// 		arr[i][j]=sc.nextInt();
		// 	}
		// }
		// for(i=0;i<arr.length;i++){
		// 	for(j=0;j<arr.length;j++){
		// 		System.out.print(arr[i][j]+" ");
		// 	}System.out.println("");
		// }

		//2. transfer to 1d array

   // int arr[][]=new int[5][5];
// 		int i,j,k=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter data for 5*5 matrix");
// 		for(i=0;i<arr.length;i++){
// 			for(j=0;j<arr.length;j++){
// 				arr[i][j]=sc.nextInt();
// 			}
// 		}
		// int arr1d[]=new int[arr.length*arr.length];
		// for(i=0;i<arr.length;i++){
		// 	for(j=0;j<arr.length;j++){
		// 		arr1d[k++]=arr[i][j];
		// 	}
		// }
		// for(i=0;i<arr1d.length;i++){
		// 	System.out.print(arr1d[i]+" ");
		// }

		//3. print diagonal data of both sides

		//  int arr[][]=new int[5][5];
		// int i,j,k=0;
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter data for 5*5 matrix");
		// for(i=0;i<arr.length;i++){
		// 	for(j=0;j<arr.length;j++){
		// 		arr[i][j]=sc.nextInt();
		// 	}
		// }
		// for(i=0;i<arr.length;i++){
		// 	for(j=0;j<arr.length;j++){
		// 		if((i==j)||(i+j==arr.length-1)){
		// 			System.out.print(arr[i][j]);
		// 		}else System.out.print(" ");
		// 	}System.out.println("");
		// }

		//4. transpose

 // int arr[][]=new int[5][5];
// 		int i,j,k=0;
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter data for 5*5 matrix");
// 		for(i=0;i<arr.length;i++){
// 			for(j=0;j<arr.length;j++){
// 				arr[i][j]=sc.nextInt();
// 			}
// 		}
// 		int arrtransposed[][]=new int[5][5];
 //        for(i=0;i<arr.length;i++){
 //        	for(j=0;j<arr.length;j++){
 //        		arrtransposed[j][i]=arr[i][j];
 //        	}
 //        }
 //        for(i=0;i<arrtransposed.length;i++){
 //        	for(j=0;j<arrtransposed.length;j++){
 //        		System.out.print(arrtransposed[i][j]+" ");
 //        	}System.out.println("");
 //        }


             //5. multiply two matrices


int arr[][]=new int[3][3];
int arr1[][]=new int[3][3];
int arr2[][]=new int[3][3];
		int i,j,k,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data for 1st 3*3 matrix");
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter data for 2nd 3*3 matrix");
		for(i=0;i<arr1.length;i++){
			for(j=0;j<arr1.length;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				s=0;
				for(k=0;k<3;k++){
					s=s+arr[i][k]*arr1[k][j];
				}
				arr2[i][j]=s;
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(arr2[i][j]+" ");
			}System.out.println("");
		}
	}
}