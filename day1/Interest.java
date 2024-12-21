
import java.util.*;
public class Interest{
	static float SI (float p,float r,float t){
			float si = (p*r*t)/100;
				return si;
} 
	static double CI(float p,float r,float t){
			double ci = p*(Math.pow(((1)+(r/100)),t)) ;
				return ci;
}

public static void main(String []args){
	
	System.out.println("1. simple intrest : ");
	System.out.println("1. compound intrest : ");	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your choice : ");
	int ch = sc.nextInt();


	System.out.println("enter the principalamount ,rate of intrest ,time  : ");
	float p = sc.nextFloat();
	float r = sc.nextFloat();
	float t = sc.nextFloat();

	if(ch==1){
	float si = Interest.SI(p,r,t);
	System.out.println("simple intrest : "+si);
}
	else if(ch==2){
	double ci = Interest.CI(p,r,t);
	System.out.println("coumpound intrest : "+ci);
}

} 
}