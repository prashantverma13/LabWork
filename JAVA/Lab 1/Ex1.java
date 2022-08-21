 class Ex1 {
	public int num;

	public Ex1() {

	}

	public Ex1(int num) {
		this.num = num;
	}

	public int sumOfDigitCubes() {
		int sum = 0;
		
		//Separating digits
		while (num != 0) {
			sum = sum + (num % 10) * (num % 10) * (num % 10);

			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		Ex1 e1 = new Ex1(123);

		System.out.println(e1.num);
		System.out.println(e1.sumOfDigitCubes());
	}
}