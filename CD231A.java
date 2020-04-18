package CodeForces;
import java.util.Scanner;
 
public class CD231A{
	public static void main(String[] args){
		Scanner Reader2 = new Scanner(System.in);
		
		int n = Reader2.nextInt();
		int ind = 0;
		
		for(int i = 0;i<n;i++) {
			int ind2 = 0;
			for(int  j = 0;j<3;j++) {
				if(Reader2.nextInt()==1) {
					ind2++;
				}
			}
			if(ind2>=2) {
				ind++;
			}
		}
		System.out.println(ind);
		Reader2.close();
	
	}
}
 
 