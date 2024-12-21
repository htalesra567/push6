import java.util.Scanner;
public class SumOfDigits{
	//static int rem=0;
		static int Calc(int num,int rem){
			if(num==0){
					return rem;
				
			}	
			int r = num%10 ;
			rem +=r;
			
			return Calc(num/10, rem);
		}
		static int CalcLoop(int num){
			int total=0;
			while(num>0){
				int r = num%10;
				total +=r;
				num = num/10;
			}
			return total;
			
		}
		public static void main(String []args){
			
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a 4 digit number : " );
				int num = sc.nextInt();
				
				int sum = SumOfDigits.Calc(num,0);
				System.out.println("the sumof digits using recursion: " +sum);
				int total = SumOfDigits.CalcLoop(num);
				System.out.println("the sumof digits using loop: " +total);
				
 }
	
} 