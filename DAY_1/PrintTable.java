import java.util.*;
class PrintTable{

	//To print the table
	public static void PrintTablee(int num){
		for(int i= 1 ; i<=10;i++){
			System.out.println(num +" * " +i+" = "+(num*i) );
}

}
	public static void main(String args[]){
		if(args.length<=0){
			System.out.println("Enter at least one parameter");
}
		else{
			int num= Integer.parseInt(args[0]); 
			PrintTablee(num);
}
}
}