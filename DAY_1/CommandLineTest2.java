class CommandLineTest2
{
	public static void main(String args[]){
		if(args.length<=0){
			System.out.println("At least One paramater need to be passed");
}	
		else{
			int sum =0 ;
			for(int i=0;i<Integer.parseInt(args[0]);i++){
				sum = sum + i;	
			}
			System.out.println("Sum is : " + sum);

}
	}
}