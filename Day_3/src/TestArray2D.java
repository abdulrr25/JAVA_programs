import java.util.Scanner;
public class TestArray2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows of the Array");
		int n =sc.nextInt();
		int [][] arr = new int[n][];
		Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		int choice=0;
		do {
		System.out.println("1. find max of all data\n2. find max rowwise");
		System.out.println("3. find max column wise\n4. find addition rowwise");
        System.out.println("5. find addition columnwise\n6.exit\n choice:");
        choice=sc.nextInt();
        switch(choice) {
        case 1:
        	int max=Array2DService.findMax(arr);
        	System.out.println("Maximum of array : "+max);
        	break;
        case 2:
        	int[] maxarr=Array2DService.findMaxRowwise(arr);
        	for(int x:maxarr) {
        		System.out.println("Max : "+x);
        	}
        	
        	break;
        case 3:
        	int[] maxarr1=Array2DService.findMaxColumnwise(arr);
        	for(int x:maxarr1) {
        		System.out.println("Max : "+x);
        	}
        	
        	break;
      
        case 4:
        	int sumr[] = Array2DService.AdditionRowWise(arr);
        	for(int x:sumr) {
        		System.out.println("Max : "+x);
        	}
        	
        	break;
        case 5:
        	int sumc[] = Array2DService.AdditionColumnWise(arr);
        	for(int x:sumc) {
        		System.out.println("Max : "+x);
        	}        	break;
        case 6:
        	System.out.println("Thank you for visiting......");
        	sc.close();
        	break;
        default:
        	System.out.println("wrong choice");
        		
        }
		}while(choice!=6);
	}

}
