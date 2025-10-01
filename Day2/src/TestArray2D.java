import java.util.*;
public class TestArray2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][]= {{1,2,3,4},{5,6,1,2},{4,8,6,7},{45,12,35,65}};
		int arr1[][]= {{31,22,13,44},{55,62,12,23},{41,83,26,72},{415,212,3255,865}};

		int ch;
		System.out.println("1. add all numbers\n 2. add rowwise\n 3. columnwise addition");
		System.out.println("4. find max of all numbers\n 5. maximum rowwise\n 6. find maximum columnwise");
		System.out.println("7. add 2 arrays\n 8. multiply array\n 9. find transpose of array");
		System.out.println("10. check identity matrix\n 11. rotate matrix rows\n 12. rotate matrix columns");
		System.out.println("13. convert to 1D array \n 14. exit\nchoice : ");
		do {
		ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
			int sum = Array2DFunc.addAllNumbers(arr);
			System.out.println("Sum of All Numbers of the Array is "+sum);
			break;
		case 2:
			int op[] = Array2DFunc.addRowWise(arr);
			Array2DFunc.displayData(op);
			break;
		case 3:
			int clm[] = Array2DFunc.addColumnWise(arr);
			Array2DFunc.displayData(clm);

			break;
		case 4:
			int max = Array2DFunc.MaxAllNumbers(arr);
			System.out.println("Maximum of All Numbers of the Array is "+max);

			break;
		case 5:
			int rmax[] = Array2DFunc.MaxRow(arr);
			Array2DFunc.displayData(rmax);
			break;
		case 6:
			int cmax[] = Array2DFunc.MaxCol(arr);
			Array2DFunc.displayData(cmax);
			break;
		case 7:
			int ar[][]=Array2DFunc.additionTwoArray(arr,arr1);
			Array2DFunc.display2DData(ar);
			
			break;
		case 8:
			
			int arMul[][]=Array2DFunc.MultiplicationTwoArray(arr,arr1);
			Array2DFunc.display2DData(arMul);
			break;
		case 9:
			int trn[][]=Array2DFunc.transposeMatrix(arr);
			Array2DFunc.display2DData(trn);

			break;
		
		case 10:
			
			boolean Idn=Array2DFunc.CheckIdentity(arr);
			if(Idn) {
				
			System.out.println("It is an Identity Matrix");
			}
			else {
				System.out.println("Non Identity Matrix");
			}
			break;
			
		case 11:
			int rm[][]=Array2DFunc.rotateRowMatrix(arr);
			Array2DFunc.display2DData(rm);
			break;
		case 12:
			int cm[][]=Array2DFunc.rotateColMatrix(arr);
			Array2DFunc.display2DData(cm);
			break;
		case 13:
			int oneD[]=Array2DFunc.OneDArray(arr);
			Array2DFunc.displayData(oneD);
			break;
		case 14:
			System.exit(0);
			break;
		default:
			System.out.println("You have entered a Wrong choice");
			break;
		}
		}while(ch!=14);
	}

}
