package CodeForces;
import java.util.Scanner;
 
public class CD4A{
	public static void main(String[] args) {
	
		Scanner myobj = new Scanner(System.in);
		int n = myobj.nextInt();
		int k = n-2;
		
		if(k%2==0 && n>2) {
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		myobj.close();
	}
}