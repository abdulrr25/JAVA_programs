import java.util.Scanner;
class TestDataType{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer Value");
		int n = sc.nextInt();
		System.out.println("Enter the Float value ");
		float n1 = sc.nextFloat();
		System.out.println("Enter String without spaces ");
		String s1 = sc.next();
		
		sc.nextLine();
		System.out.println("Enter String with spaces ");
		String s2 = sc.nextLine();
		
		System.out.println(" Integer Value is : "+n );
		System.out.println(" Float Value is : "+n1 );
		System.out.println(" String Without space is : "+s1 );
		System.out.println(" String with spaces is : "+s2 );
}
}