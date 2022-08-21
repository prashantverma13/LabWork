public class Ex5 {

	public boolean check3or5(int num) {
		if(num%3 ==0 || num%5 ==0) {
			return true ;
		}
		return false ;
	}
	public int sumOfNaturalNum(int n) {
		int sum = 0 ;
		for(int i =1 ; i<=n ; i++) {
			boolean divisible = check3or5(i) ;
			if(divisible) {
				sum = sum + i ;
			}
		}
		return sum ;
	}
	
	public static void main(String[] args) {
		Ex5 e5 = new Ex5() ;
		
		int ans = e5.sumOfNaturalNum(5);
		System.out.println(ans);
		
	}
}