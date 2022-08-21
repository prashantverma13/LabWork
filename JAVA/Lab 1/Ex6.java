public class Ex6 {
	
	int sumFirstN(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum*sum ;
	}
	
	int sumFirstNsquare(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i*i;
		}
		return sum ;
	}
	
	public int sumDifference(int n) {
		int ans = sumFirstNsquare(n) - sumFirstN(n) ;
		return ans ;
	}
	
	public static void main(String[] args) {
		Ex6 e6 = new Ex6() ;
		
		int ans = e6.sumDifference(10) ;
		System.out.println(ans);
	}
}