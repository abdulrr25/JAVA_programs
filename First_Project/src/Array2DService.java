
import java.util.*;
public class Array2DService {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the size of row:");
		int n = sc.nextInt();
		System.out.println("Enter the size of column:");
		int n1 = sc.nextInt();
		int ch;
		int [][] arr=new int[n][n1];
		FunArray2DService.acceptData(arr);
		do {
			System.out.println("Enter Your Choice For the below Operations \n 1 : Add All Numbers From the Array \n 2 : Add All Rows \n 3 : Add All Column \n 4 : Exit ");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				FunArray2DService.AllElemnt(arr);
				break;
				
			case 2:
				FunArray2DService.AddRow(arr);
				break;
				
			case 3:
				FunArray2DService.AddCol(arr);
				break;
				
			case 4:
				System.exit(0);
				break;
			}
			
		}while(ch>4);
		System.out.println("");
		FunArray2DService.displayData(arr);
		}


			

		

	}


