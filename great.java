import java.util.Scanner;
public class great {
	public static void main(String[] args) {
	int sum,count=0,b=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int[] a=new int[n];
	System.out.print("Enter the elemnts : ");
	for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
	}
	int k=s.nextInt();
	int max=0;
	for(int i=b;i<k;i++) {
		if(max<a[i])
			max=a[i];
			if(i==k-1) {
				b++;
				k++;
				i=0;
				System.out.print(max+" ");
				max=0;
			}
		if(k>n) {
					break;
		}
		
	}
	System.out.println("");
	}
}
	