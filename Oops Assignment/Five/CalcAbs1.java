package Com.Oops.Five;

public class CalcAbs1 extends CalcAbs {

	@Override
	void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Addition = " + sum);
	}

	void sub(int a, int b) {
		int sub = a - b;
		System.out.println("subtraction = " + sub);
	}

	@Override
	void mul(int a, int b) {
		int mul = a * b;
		System.out.println("multiplication = " + mul);
	}

	@Override
	void div(int a, int b) {
		int div = a / b;
		System.out.println("division = " + div);
	}

}
