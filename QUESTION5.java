import java.util.*;
public class QUESTION5 {
	public static void main(String[] args) {
        int i,s=0,N;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers to find the average:");
        for(i=0;i<10;i++){
            N=sc.nextInt();
            s=s+N;
        }
        avg=s/(float)10;
        System.out.println("The average of 10 number "+"is "+avg);
    }
}
