package Java;

import java.util.Scanner;

public class MatrixTranspose {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][3];
	
	
      public void code1()
      {
    	  System.out.println("Que11.matrix");
    	  System.out.println("Enter 1st matrix elements");
    	  for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}	 
      }
      public void code2()
      {
    	 
    	  System.out.println("Rotate matrix elements");
    	  for (int j = 0; j < a.length; j++) {
    		  int sum=0;
			for (int i = a[0].length-1; i >=0 ; i--) {
		     
				System.out.print(a[i][j]+" "); 	
			
			
			}
		
    	  
			System.out.println();
		}
    	  
      } 
      
      public static void main(String[] args) {
    	  MatrixTranspose obj=new MatrixTranspose();
    	  obj.code1();
    	  obj.code2();
	}
}
