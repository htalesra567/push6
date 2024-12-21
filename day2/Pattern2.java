import java.util.Scanner;
public class Pattern2
{
public static void main(String sr[])
	{
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("ENter no:");
		no=sc.nextInt();
		for(int i=0;i<=no/2;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(i==0){
					System.out.print("*");
					continue;
				}
				
				if(j>=no/2-i+1 && j<=no/2+i-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
		}
		System.out.println();
		}
	}
}