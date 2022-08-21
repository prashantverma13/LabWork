class Ex2 {
	
	
	String choice ="" ;
	
	public Ex2() {
	}
	
	public Ex2(String choice) {
		this.choice = choice.toLowerCase()  ;
		
	}
	
	public void message() {
		String[] msg = {"Stop", "Go", "Ready" } ;
		String retMsg ="" ;
		
		//using switch case to match the msg
		switch (choice){
			case "red":
				retMsg = msg[0] ;
				break;
			case "green":
				retMsg =  msg[1] ;
				break ;
			case "yellow":
				retMsg = msg[2] ;
				break ;
			default :
				System.out.println();
		}
		System.out.println(retMsg) ;
	}
	
	public static void main(String[] args) {
		Ex2 e2 = new Ex2() ;
		e2.message();
	}
	
}