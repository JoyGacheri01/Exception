class Exception{
	private void method1() {
		method2();
	}

	private void method2() {
		method3();
	}
	private void method3() {
		int b = 5/0; 
	}
	public static void main(String[] args) {
		Exception e = new Exception();
		e.method1();
	}

}