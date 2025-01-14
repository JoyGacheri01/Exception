class EX2 {
	void display() {
//		try {
//			int a = 5/0;
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		int a = 5/0;
		System.out.println("Exception handled");
	}

	
	public static void main(String [] args) {
		EX2 obj = new EX2();
		obj.display();
	}
}