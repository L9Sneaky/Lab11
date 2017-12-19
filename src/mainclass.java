import java.util.Scanner;

public class mainclass {
	public static void main(String[] args) {
		int[] x ;
		Scanner s =new Scanner(System.in);
		System.out.print("how big do you want your array :");
		x =new int[s.nextInt()];
		System.out.print("Enter the numbers: ");
		for(int i =0; i<x.length; i++) {
			x[i]=s.nextInt();
		}
		System.out.print("your numbers are : ");
		for(int i=0; i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
}
