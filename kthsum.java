import java.util.Scanner;
public class kthsum {
	public static void main(String[] args) {
	int sum,count=0;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	System.out.print("Enter the elemnts : ");
	for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
	}
	System.out.print("Enter the number : ");
	int b=s.nextInt();
	
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			sum=a[i]+a[j];
		if(sum==b) {
		count++;
		break;
		}
		
		}
		
		}
		if(count>0) {
			System.out.print("true"); 
		}
		else {
			System.out.print("false");
		}
		}
		}