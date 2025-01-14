class Main {
	void display() {
	try {
		int a = 5/0;
	}

	catch(ArithmeticException e) {
		System.out.println(e);
	}
	}
	public static void main ( String [] args) {
		Main obj = new Main();
		obj.display();
	}
}
