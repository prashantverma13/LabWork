public class Ex1 {
	
	public void validate(int age) throws Exception{
		if(age<15) {
			throw new Exception("Age is not valid ") ;
		}
		else {
			System.out.println("Eligible person : ");
		}
	}
	
	public static void main(String[] args) {
		
		Ex1 e1 = new Ex1() ;
		
		try {
			e1.validate(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("end");
	}
}