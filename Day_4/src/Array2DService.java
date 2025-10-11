import java.util.Scanner;

public class Array2DService {

	public static int[][] acceptData(int arr[][]) {
	    Scanner sc = new Scanner(System.in);
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print("Enter number of columns for row " + i + ": ");
	        int cols = sc.nextInt();
	        arr[i] = new int[cols];
	        for (int j = 0; j < cols; j++) {
	            System.out.print("Enter value for [" + i + "][" + j + "]: ");
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    return arr;
	}


	public static void displayData(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);
			}
		}

	}

	public static int findMax(int[][] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}

			}
		}
		return max;
	}

	public static int[] findMaxRowwise(int[][] arr) {
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (temp[i] < arr[i][j]) {
					temp[i] = arr[i][j];
				}
			}
		}
		return temp;

	}

	public static int[] findMaxColumnwise(int[][] arr) {

		int maxCols = 0;
		for (int[] row : arr) {
		    if (row.length > maxCols) maxCols = row.length;
		}
		int[] temp = new int[maxCols];
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        if (temp[j] < arr[i][j]) {
		            temp[j] = arr[i][j];
		        }
		    }
		}
		return temp;
	}

	public static int[] AdditionRowWise(int[][] arr) {
		int sum[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
		}
		return sum;
	}

	public static int[] AdditionColumnWise(int[][] arr) {
		int maxCols = 0;
		for (int[] row : arr) {
		    if (row.length > maxCols) maxCols = row.length;
		}
		
		int sum[] = new int[maxCols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[j] += arr[i][j];
			}
		}
		return sum;

	}
}
