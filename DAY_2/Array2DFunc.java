import java.util.Scanner;
public class Array2DFunc {




	public static int addAllNumbers(int [][]arr) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		return sum;
		
	}
	
	public static int[] addRowWise(int [][]arr) {
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				temp[i]+=temp[i]+arr[i][j];
			}
		}
		
		return temp;
	}
	
	public static int[] addColumnWise(int [][]arr) {
		int temp[]=new int[arr.length];
		for(int i=0;i<arr[i].length;i++) {
			temp[i]=0;
			for(int j=0;j<arr.length;j++) {
				temp[i]+=temp[i]+arr[j][i];
			}
		}
		
		return temp;
	}
	
	
	public static void displayData(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at "+i+"th Index is "+arr[i]);
		}
	}
	
	public static void display2DData(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at "+i+"th Index is "+arr[i]);
		}
	}


	public static int[][] additionTwoArray(int[][] arr,int arr1[][]) {
		// TODO Auto-generated method stub
		
		int [][]temp=new int[arr.length][arr[0].length]; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j] = arr[i][j]+arr1[i][j];
			}
		}
		
		return temp;
	}

	public static int[][] MultiplicationTwoArray(int[][] arr, int[][] arr1) {
		int temp[][] = new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr.length;k++) {
					temp[i][j]+=arr[i][k]*arr1[k][j];
				}
			}
		}
		return temp;
	}

	public static int[][] transposeMatrix(int[][] arr) {
		int temp[][] = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j] = arr[j][i];
			}
		}
		return temp;
	}

	public static boolean CheckIdentity(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if((i==j) && (arr[i][j]!=1)) {
					return false;
				}
				else if((i!=j)&&(arr[i][j]!=0)) {
					return false;
				}
			}
		}
		
		return true;
		
		
	}

	public static int[] OneDArray(int[][] arr) {
		// TODO Auto-generated method stub
		int temp [] = new int[arr.length*arr[0].length];
		int k=0;
		for(int i =0 ; i < arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				temp[k]=arr[i][j];
				k++;
			}
		}
		
		return temp;
	}

	public static int[][] rotateRowMatrix(int[][] arr) {
		// TODO Auto-generated method stub
		int temp[][] = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[i]=temp[i+1];
				
			}
		}
		int [] temp1 = temp[0];
		for(int i=0;i<temp.length-1;i++) {
			temp[i]=temp[i+1];
		}
		temp[temp.length-1]=temp1;

		return temp;
	}

	public static int[][] rotateColMatrix(int[][] arr) {
		// TODO Auto-generated method stub
		int temp[][] = new int[arr.length][arr[0].length];
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;i++) {
				temp[i][j]=arr[i][j];
			}
		}
		
		int [] temp1 =new int[temp.length];
		for(int i=0; i<temp1.length;i++) {
			temp1[i]=temp[i][temp[0].length-1];
		}
		
		//
		for(int i=0; i<temp.length;i++) {
			for(int j=temp[0].length-2;j>=0;j++) {
				temp[i][j+1]=temp[i][j];
				
			}
		}
		
		//Copy temp1 into 0th index
		for(int i=0;i<temp.length;i++) {
			temp[i][0]=temp1[i];
		
			
		}

		return temp;
	}

	public static int MaxAllNumbers(int[][] arr) {
		// TODO Auto-generated method stub
		int max =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		return max;
	}

	public static int[] MaxRow(int[][] arr) {
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int max=0;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			temp[i]=max;
		}
		
		return temp;
	}

	public static int[] MaxCol(int[][] arr1) { 
		int temp[] =new int[arr1.length];
		
		for(int j=0; j<arr1.length;j++) {
			int max=0;
			
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i][j]>max) {
					max=arr1[i][j];
				}
			}
			temp[j]=max;
		}
		
		return temp;
		
	}
}
