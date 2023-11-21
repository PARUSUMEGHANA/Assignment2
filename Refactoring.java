package dardenpractice;

public class Refactoring {
	void num1() {
		num1(5);
	}
	void num1(int six1) {
		num1(six1, 10, 1);
	}

	void num1(int six1, int n1, int p1) {
		for (int i = p1; i <= n1; i++) {
			System.out.printf("%d * %d = %d", six1, i, six1 * i).println();
		}
	}
}
