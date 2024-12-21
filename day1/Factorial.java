import java.util.Scanner;

public class Factorial{
static void fact(int n){
	
	for(int i=1;i<=n;i++)
	{
			int f =1;
			for(int j=i;j>=1;j--)
			{
				f*=j;
			}
	System.out.print("  "+f);
	}
}
public static void main(String []args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		
		Factorial.fact(n);
		
}
}