import java.util.Scanner;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of arryay");
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<=n-1;i++)
		{
			a[i] = scan.nextInt();
		}
		for(int i =0;i<=n-1;i++){
			System.out.println(a[i]);
		}
			

	}

}
