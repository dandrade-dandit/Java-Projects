package inheritance;

public class TestInterfaces implements Interface1, Interface2, Interface3 {
	public int add (int a, int b) {
		return a+b;
	}
	public int sub (int a, int b) {
		return a-b;
	}
	public int prod (int a, int b) {
		return a*b;
	}
}
