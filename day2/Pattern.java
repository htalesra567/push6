import java.util.Scanner;
public class Pattern{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--)
		{		System.out.println();
			for(int j=i;j>0;j--)
			{
				System.out.print("*");
			}
		}
	}
}