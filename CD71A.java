package CodeForces;
import java.util.Scanner;

public class CD71A{
	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		
		
		int n = myobj.nextInt();
			
		for(int i =0;i<n;i++) {
			String  k = myobj.nextLine();
			if(k.length()<=10) {
				System.out.println(k);
			}
			else {
				String a = k.substring(0,1);
				String  b = k.substring(k.length()-1, k.length());
				String c = k.substring(1,k.length()-1);
				System.out.println(a+c.length()+b);
			}
		}
		myobj.close();
		
	}
	
}
