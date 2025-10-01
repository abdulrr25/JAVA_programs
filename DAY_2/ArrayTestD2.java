import java.util.Scanner;
class ArrayTestD2{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size of the Array");	
	int n = sc.nextInt();
	int arr[] = new int[n];
	ArrayFunc2.acceptData(arr);
	{
		System.out.println("Enter Your Choice For the below Operations \n 1 : All Prime Numbers From the Array \n 2 : Addition of Digit of odd Numbers \n 3 : Factorial Of all numbers less than 7 \n 4 : Find Nth MaxPrime Number \n 5 : Find Nth MinPrime Number 6 : Exit ");
		int ch= sc.nextInt();
		switch(ch){
		
	case 1 : 
		ArrayFunc2.arrayPrime(arr);
		break;
	case 2: 
		ArrayFunc2.additionOddDigits(arr);
		break;
	case 3: 
		ArrayFunc2.allFactorial(arr);
		break;
	case 4: 
		ArrayFunc2.nMaxPrime(arr);
		break;
	case 5: 
		ArrayFunc2.nMinPrime(arr);
		break;
	case 6:
		System.exit(0); 
		break;
	default : 
		System.out.println("Enter Valid Input");
		break;
		} 

	};
	
}
}