package CodeForces;
import java.util.Scanner;
public class CD158A {

    public static void main (String[] args) throws java.lang.Exception
    {
        int[] scores = new int[50];
        int noOfStudents,KthPlace, counter=0;
        Scanner sc = new Scanner(System.in);
        noOfStudents = sc.nextInt();
        KthPlace = sc.nextInt();
        KthPlace = KthPlace -1 ;

        for(int i = 0 ;i < noOfStudents; i++)
        {
            scores[i] = sc.nextInt();
        }
        if(scores[KthPlace] > 0){
            for(int i = KthPlace+1 ;i < noOfStudents && scores[KthPlace]==scores[i]; i++){
                counter++;
            }
            System.out.println(counter+KthPlace+1);
        }
        else{
            for(int i= 0 ; i < KthPlace && scores[i] > 0; i++){
                counter++;
            }
            System.out.println(counter);
        }
        sc.close();
    }
}