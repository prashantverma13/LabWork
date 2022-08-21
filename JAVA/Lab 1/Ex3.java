class Ex3 {
	
	int n ;
	

	int a =1 , b = 1 ,  c = 0;
	
	
	public Ex3() {
		this.n = 0 ;
	}
	
	public Ex3(int n) {
		this.n = n ;
	}
	
	
	public void nthFibNumLoop() {
		int count = 2 ;
		if(n == 1 || n ==2) {
			System.out.println(1);
			return ;
		}
		else if(n==0) {
			System.out.println(0);
			return ;
		}
		else {
			while(count!=n) {
				
				c= a+b ;
				a=b ;
				b =c;
				
				count = count +1 ;
			}
		}
		System.out.println(c);
	}
	
	public int nthFibNumRecursive(int n) {
		if(n==0) {
			return 0 ;
		}
		else if(n==1) {
			return 1 ;
		}
		else {
			return nthFibNumRecursive(n-1) + nthFibNumRecursive(n-2) ;
		}
	}
	
	public static void main(String[] args) {
		Exercise3 e3 = new Ex3(6) ;
		
		e3.nthFibNumLoop();
		int num = e3.nthFibNumRecursive(6);
		System.out.println(num);
		
	}
	
}