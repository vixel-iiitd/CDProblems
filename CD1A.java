package CodeForces;
import java.util.Scanner;
 
public class CD1A{
	public static void main(String[] args) {
	
		Scanner myobj = new Scanner(System.in);
		double n = myobj.nextInt();
		double m = myobj.nextInt();
		double a = myobj.nextInt();
		System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));		
			
		myobj.close();
 
	}}