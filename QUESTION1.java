import java.util.*;
public class QUESTION1 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int i,n=25;
	    int a[] = new int[n];
	    System.out.println("Enter 25 elements of array : ");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();	
		}
	    int max = a[0];
	    for (i = 1; i < n; i++){
	        if (a[i] > max)
	            max = a[i];
	       }
	    System.out.println(max);
	}
}

