import java.util.*;
public class matrixAddMul
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows for 1st matrix: ");
		int nr1=sc.nextInt();
		System.out.println("Enter no of cols for 1st matrix: ");
		int cr1=sc.nextInt();
		System.out.println("Enter no of rows for 2nd matrix: ");
		int nr2=sc.nextInt();
		System.out.println("Enter no of cols for 2nd matrix: ");
		int cr2=sc.nextInt();
		int arr1[][]=new int[nr1][cr1];
		System.out.println("Enter data for 1st matrix : ");
		for(int i=0;i<nr1;i++){
		    for (int j=0;j<cr1;j++){
		        arr1[i][j]=sc.nextInt();
		    }
		}
		int arr2[][]=new int[nr2][cr2];
		System.out.println("Enter data for 2nd matrix : ");
		for(int i=0;i<nr2;i++){
		    for (int j=0;j<cr2;j++){
		        arr2[i][j]=sc.nextInt();
		    }
		}
		if(nr1==nr2 && cr1==cr2){
		    int sum[][]=new int[nr1][cr1];
    		for(int i=0;i<nr1;i++){
    		    for (int j=0;j<cr1;j++){
    		        sum[i][j]=arr1[i][j]+arr2[i][j];
    		    }
    		}
    		System.out.println("Result for ADD : ");
    		for(int i=0;i<nr1;i++){
    		    for (int j=0;j<cr1;j++){
    		        System.out.print(sum[i][j]+" ");
    		    }
    		}
		}
		else{
		    System.out.println("/n we cannot add matrices of diff order");
		}
		int mul[][]=new int[nr1][cr2];
		if(cr1==nr2){
		    for(int i=0;i<nr1;i++){
    		    for (int j=0;j<cr2;j++){
    		        for(int k=0;k<nr2;k++){
    		            mul[i][j]+=arr1[i][k]*arr2[k][j];
    		        }
    		    }
		    }
		    System.out.println("\nResult for MUL: ");
		    for(int i=0;i<nr1;i++){
			 for (int j=0;j<cr2;j++){
			      System.out.print(mul[i][j]+" ");
			   }
		    }
		}
		else{
		    System.out.println("\nmul can not be done");
		}
		
		
	}
}
