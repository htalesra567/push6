import java.util.Scanner;
public class Pattern3
{
public static void main(String sr[])
	{
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("ENter no:");
		no=sc.nextInt();
		
		for(int i=0;i<no*2-1;i++)
		{		
			for(int j = 0; j<no;j++) {
			if(i<no){
				if(j<no-i){
					System.out.print("*");
				}
			}
			else{
				if(j<i-(no-2)){
					System.out.print("*");
				}
			}
			
		}
		System.out.println();
	}
}
}