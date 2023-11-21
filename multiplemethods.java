package dardenpractice;

public class multiplemethods {
	void num(int six) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", six, i, six * i).println();
		}
	}


	void num(int six, int n, int p) {
		for (int i = p; i <= n; i++) {
			System.out.printf("%d * %d = %d", six, i, six * i).println();
		}
}
}
