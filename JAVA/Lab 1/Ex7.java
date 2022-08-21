import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(checkNumber(n)) {
			System.out.println(n+" is an increasing number");
		}
		else {
			System.out.println(n+" is not an increasing number");
		}
	}

	private static boolean checkNumber(int n) {
		
		int a=0;
		while(n>0) {
			int b=n%10;
			a=b;
			if(b>a) {
				return false;
			}
		    n=n/10;
		}
		return true;
	}

}