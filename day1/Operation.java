import java.util.Scanner;
public class Operation{
	static int add(int a,int b){
		return a+b;
	}
	static int subtract(int a,int b){
		return a-b;
	}
	static int multiply(int a,int b){
		return a*b;
	}
	static int division(int a,int b){
		return a/b;
	}
	public static void main(String []args){
	
			
			
			
			
			System.out.println("1. addition ");
			System.out.println("2. subtraction ");
			System.out.println("3. multiplication ");
			System.out.println("4. division ");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the choice(0-4)");
			int ch = sc.nextInt();
			
			System.out.println("enter two number : "  );
			int a = sc.nextInt();
			int b = sc.nextInt();
			
				
				switch(ch){
				
					case 1: 
							int sum = Operation.add(a,b);
							System.out.println("sum = "+sum);
							break;
					case 2:
							int sub = Operation.subtract(a,b);
							System.out.println("subtract  = "+sub);
							break;
					case 3:
							int mult = Operation.multiply(a,b);
							System.out.println("multiplication= "+ mult);
							break;
					case 4:
							float div = Operation.division(a,b);
							System.out.println("division = "+div);
							break;
					default : 
							System.out.println("wrong input");
				}
	}
}