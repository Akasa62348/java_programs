class Pattern{
	public static void main(String[] args) {
		int i,j;

		//1. print the numeral '1'

		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=5;j++){
		// 		if((i+j==6)||(j==5)){
		// 			System.out.print("*");
		// 		}else System.out.print(" ");
		// 	}
		// 	System.out.println();
		// }
		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=5;j++){
		// 		if(j==5) System.out.println("*");
		// 		else System.out.print(" ");
		// 	}
		// }
		// for(i=1;i<=10;i++)
		// 	System.out.print("*");

		//2. print 1 12 123 1234

		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=i;j++){
		// 		System.out.print(j);
		// 	}System.out.println();
		// }

		//3. 54321 5432 543

		// for(i=5;i>=1;i--){	
		//      int n=5;		
		// 	for(j=1;j<=i;j++){
		// 	System.out.print(n);
		// 	n--;
		// 	}System.out.println();
		// }

		//4. 11111 2222 333 44 5

        // int n=1;
        // for(i=5;i>=1;i--){			     		
		// 	for(j=1;j<=i;j++){
		// 	System.out.print(n);			
		// 	}
		// 	n++;
		// 	System.out.println();
		// }

		//5. 1 23 456 78910 1112131415

        // int c=1;
		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=i;j++){
		// 		System.out.print(c+"	");
		// 		c++;
		// 	}System.out.println();
		// }

		// // //6. 1 01 101 0101 10101 //not working completely//
         
		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=i;j++){
		// 		if(((i%2==0)&&(j==1))||((j%2==0)&&(j!=i))){
		// 			System.out.print("0");
		// 		}else System.out.print("1");
              

		// 	}System.out.println();
		// }

//       7. half diamond

		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=5;j++){
		// 		if(j<=(5-i)){
		// 			System.out.print(" ");
		// 		}else System.out.print("* ");
		// 	}System.out.println();
		// }

		//8.  print diamond

		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=5;j++){
		// 		if(j<=(5-i)){
		// 			System.out.print(" ");
		// 		}else System.out.print("* ");
		// 	}System.out.println();
		// }
		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=5;j++){
		// 		if(j<=i){
		// 			System.out.print(" ");
		// 		}else System.out.print("* ");
		// 	}System.out.println();
		// }

		//9. print cross or x

		// for(i=1;i<=9;i++){
		// 	for(j=1;j<=9;j++){
		// 		if((i==j)||(i+j==10))
		// 			System.out.print("*");
		// 		else System.out.print(" ");
		// 	}System.out.println();
		// }

		//10. print a ab abc
		// for(i='A';i<='E';i++){
		// 	for(j='A';j<=i;j++){
        //      System.out.print((char)j);
		// 	}System.out.println();
		// }
         
         //6.

		// int k=1;
		// for(i=1;i<=5;i++){
		// 	if(i%2==0) k=0; else k=1;
		// 	for(j=1;j<=i;j++){
		// 		System.out.print(k);
		// 		if(k==1) k=0; else k=1;
		// 	}System.out.println();
		// }

		//Diamond Outline

// int k=5,d=1;
// for(i=1;i<=10;i++){
// 	if(i<=5){
// 		for(j=1;j<=5;j++){
//         int k1=k+1;
//         if(j==k || j==5){System.out.print("* ");
//         }
//         else if(j>=k1)System.out.print("  ");
//         else System.out.print(" "); 
        
        
// 	}k--;
// }
// 	else {
// 		for(j=1;j<=5;j++){
// 			int d1=d+1;
// 			if(j==d || j==5) {System.out.print("* ");
// 			}
// 			else if(j>=d1)System.out.print("  ");
// 			else System.out.print(" ");
			
// 		}d++;}
// 	System.out.println();
// }

		// capital A 
	
// int l=10,r=10;
// 	for(i=1;i<=9;i++){
// 		if(i==6){
// 			for(j=1;j<=10;j++){
// 				if(j<=4){System.out.print(" ");}
// 				else System.out.print("* ");
				

// 			}  }
// 			else if (i!=6){
// 				for(j=1;j<=18;j++){
// 					if(j==l||j==r){
// 						System.out.print("* ");}
// 						else if (j>=l)System.out.print(" ");
// 						else System.out.print(" ");
// 					}
// 				}System.out.println();
// 				l--;
// 				r++;
// 			}


		//sir program for A

		// for(i=1;i<=5;i++){
		// 	for(j=1;j<=5;j++){
		// 		if(j<=5-i)System.out.print(" ");
		// 		else System.out.print("*");
		// 		for(int k=1;k<=i;k++){
		// 			System.out.print(" ");
		// 			System.out.print("*");
		// 		}System.out.println();
		// 	}
		// }
               

               // capital T

			// for(i=1;i<=9;i++){
			// 	for(j=1;j<=9;j++){
			// 		if(i==1){
			// 			System.out.print("*");}
			// 			 if(j==5) System.out.print("*");
			// 			else System.out.print("  ");
			// 		}System.out.println();
			// 	}

		// SWASTIK

		for(i=0;i<=12;i++){
			for(j=0;j<=12;j++){
				if((i==0 || i==12) && (j==0 || j==12))System.out.print("राम  ");
					
					else if(i==1 && ((j>=6 || j==1)&& j!=12))System.out.print("राम  ");
						
					 else if((i>=2 && i<=5) && (j==1 || j==6))System.out.print("राम  ");
					
					else if((i==6) && (j>=1 && j<=11))System.out.print("राम  ");
					else if((i>=7 && i<=10) && (j==6 || j==11)) System.out.print("राम  ");
						
						else if(i==11 && ((j>=1 && (j<=6 ||j==11)))) System.out.print("राम  ");
						else if ((i==3 ||i==9) && (j==3 || j==9))System.out.print("राम  ");
						//else if (i==9 && (j==3 || j==9))System.out.print("* ");

							else System.out.print("    ");
							
						}

			System.out.println();
		}


		    //Circle pr O
		
// 		for(i=0;i<=10;i++){
// 			for(j=0;j<=10;j++){
// 				if(i==0 || i==10) {
// 					if(j>1 && j<10){
// 					System.out.print("* ");
// 				}
// 					else System.out.print("  ");
// 				}
					
// else {
// 	    if(j==1 || j==10)
// 					System.out.print("* ");
					
// 				 else System.out.print("  ");
// 			}
// 		}
// 			System.out.println();
// 		}


			}

		}
	



	 
	