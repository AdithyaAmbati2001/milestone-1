import java.util.*;
public class QUESTION2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=10,max=0,count=0;
		int a[]=new int[n];
		System.out.println("Enter 10 elements of array : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]>max){
				max=a[i];count=0;
			}
			if(a[i]==max)
				count++;
		}
		System.out.print(count);
	}
}
