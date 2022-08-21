public class Exercise4 {
	
	public Ex4() {
	}
	
	public void primeNums(int n) {
		if(n==1) {
			System.out.println(1);
			return ;
		}
		int i, j ;
		System.out.print(1 + " ");
		for(i =2 ; i<=n; i++) {
			for( j=2; j<=i; j++) {
				if(i%j == 0) {
					break ;
				}
			}
			if(j==i) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Ex4 e4 = new Ex4() ;
		
		e4.primeNums(11);
	}
}