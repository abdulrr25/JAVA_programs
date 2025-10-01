import java.util.Scanner;
public class ArrayFunc2{
	
	public static void acceptData(int arr[]) {
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter value at index :" +i);
			arr[i]=sc.nextInt();
		}
	}
	
	
	public static void arrayPrime(int arr[]){
		int k = 0;
		int ar[] = new int[arr.length]; 

		for (int i = 0; i < arr.length; i++) {
		    int currentNum = arr[i];
		    boolean isPrime = true; 

		    if (currentNum == 1) {
		        ar[k] = currentNum;
		        k++;
		    } 
		    else if (currentNum <= 0) {
		        isPrime = false;
		    }
		    else {
		        for (int j = 2; j * j <= currentNum; j++) {
		            if (currentNum % j == 0) {
		                isPrime = false;
		                break; 
		            }
		        }

		        if (isPrime) {
		            ar[k] = currentNum;
		            k++;
		        }
		    }
		}

		displayData(ar);

	}


	public static void additionOddDigits(int arr[] ){
		int k=0;
		int ar[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int sum=0;
			if(arr[i]%2!=0){
				int n= arr[i];
				while(n!=0){
					int rem=n%10;
					sum=sum+rem;
					n=n/10;
				}
				ar[k]=sum;
				k++;
			}
		}
		System.out.println("The Array of Sum of Odd Digits are ");
		displayData(ar);
	}


	public static void allFactorial(int arr[]){
		int ar []=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<7){
				int fact =1;
				if(arr[i]==1){
					fact=1;
				}
				else{

				for(int j = arr[i];j>1;j++){
					fact = fact*j;
				}
				ar[k]=fact;
				k++;
				}
			}
		}
		displayData(ar);
	}
	public static void nMaxPrime(int arr[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Nth Position");
		int n= sc.nextInt();
		int ar[]=new int[arr.length];
		int k=0;
		for (int i = 0; i < arr.length; i++) {
		    int currentNum = arr[i];
		    boolean isPrime = true; 

		    if (currentNum == 1) {
		        ar[k] = currentNum;
		        k++;
		    } 
		    else if (currentNum <= 0) {
		        isPrime = false;
		    }
		    else {
		        for (int j = 2; j * j <= currentNum; j++) {
		            if (currentNum % j == 0) {
		                isPrime = false;
		                break; 
		            }
		        }

		        if (isPrime) {
		            ar[k] = currentNum;
		            k++;
		        }
		    }
		}
		displayData(ar);		
		int nMax=findNthMax(ar,n);
		System.out.println(n+" Maximum element in the array is : "+nMax);
	}
	public static int findNthMax(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int pos = findMaxPos(arr,i);
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[n-1];
	}
	
	public static int findMaxPos(int arr[],int start) {
		int pos = start;
		int max = arr[pos];
		for(int i=pos+1;i<arr.length;i++) {
			if(max<arr[i]) {
				pos = i;
				max = arr[i];
			}
		}
		return pos;
		
	}
	

	public static void nMinPrime(int arr[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Nth Position For Minimum");
		int n= sc.nextInt();
		int ar[]=new int[arr.length];
		int k=0;
		for (int i = 0; i < arr.length; i++) {
		    int currentNum = arr[i];
		    boolean isPrime = true; 

		    if (currentNum == 1) {
		        ar[k] = currentNum;
		        k++;
		    } 
		    else if (currentNum <= 0) {
		        isPrime = false;
		    }
		    else {
		        for (int j = 2; j * j <= currentNum; j++) {
		            if (currentNum % j == 0) {
		                isPrime = false;
		                break; 
		            }
		        }

		        if (isPrime) {
		            ar[k] = currentNum;
		            k++;
		        }
		    }
		}
		
		int nMin=findNthMin(ar,n);
		System.out.println(n+" Minimum element in the array is : "+nMin);
		
		
		
	}
	public static int findNthMin(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int pos = findMinPos(arr,i);
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[n-1];
	}
	
	public static int findMinPos(int arr[],int start) {
		int pos = start;
		int min = arr[start];
		for(int i=start+1;i<arr.length;i++) {
			if(min<arr[i]) {
				pos = i;
				min = arr[i];
			}
		}
		return pos;
		
	}
	public static void displayData(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Value at "+i+" is : "+arr[i]);
		}

	}
}