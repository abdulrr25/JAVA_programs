class TestFactorial{
	//To return the factorial of a number
	public static int factorial(int n){
		int fact = 1;
		for (int i =1 ; i<=n;i++){
			fact = fact *i;
			}

		return fact ;
}

	public static void main(String args[]){
		if(args.length<=0){
			System.out.println("Enter at least one parameter");
			}
		else{

			int n= Integer.parseInt(args[0]);
			int ans  = factorial(n);
			System.out.println("Factorial is "+ans);
			
		}
}
}