
import java.util.Scanner;

public class CD118A {
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		String  k = myobj.nextLine();
		String  k2 = "";
		for(int i = 0 ;i<k.length();i++) {
			
			String k1 = k.substring(i,i+1);
			k1=k1.toLowerCase();
			if(k1.equals("a")||k1.equals("y")||k1.equals("e")||k1.equals("i")||k1.equals("o")||k1.equals("u")) {
				}
			else {
				k2=k2+k1;
			}
		}
		
		k2=k2.toLowerCase();
		
		for(int i = 0 ;i<k2.length();i++) {
			System.out.print("." + k2.substring(i,i+1));
		}
	}

}
