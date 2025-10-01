
import java.util.Scanner;


public class FunArray2DService {
	public static void acceptData(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter data for row "+i+" column: "+j);
			arr[i][j]=sc.nextInt();
			
			}
		}
		
	}


public static void AddRow(int[][] arr){
	int k=0;
	int sum[] = new int[arr.length];
	for(int i=0; i<arr.length; i++) {
		for(int j =0;j<arr[0].length;j++) {
			sum[k]=sum[k]+arr[i][j];
		}
	}
	System.out.println("Sum of Row of Array are : ");
	displyData(sum);
}
public static void AllElemnt(int[][] arr){
	int k=0;
	int sum=0;
	for(int i=0; i<arr.length; i++) {
		for(int j =0;j<arr[0].length;j++) {
			sum=sum+arr[i][j];
		}
		k++;
	}
	
	System.out.println("Sum of All elemnts of Array is : "+sum);
}

public static void AddCol(int[][] arr){
	int k=0;
	int sum[] = new int[arr.length];
	for(int i=0; i<arr.length; i++) {
		for(int j =0;j<arr[0].length;j++) {
			sum[k]=sum[k]+arr[j][i];
		}
		k++;
	}
	
	System.out.println("Sum of Column of Array are : ");
	displyData(sum);
}

public static void displayData(int[][] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
}
public static void displyData(int[] arr) {
	for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		
		System.out.println();
	}
	
}
}
