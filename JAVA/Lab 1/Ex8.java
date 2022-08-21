public class Ex8{

	public static boolean power(int n) {
		
		if (n < 2) {
			return false;
		}
		while (n > 2) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(power(3));
	

	}
}