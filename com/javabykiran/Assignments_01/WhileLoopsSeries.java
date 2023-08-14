package com.javabykiran.Assignments_01;

//SeriesExercise
class ExerciseWhileLoopSeries {

	void exercise16() {
		// Series... 2 4 6 8 10 12 14 16 18 20.
		int i = 2;
		while (i <= 20) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
	}

	void exercise17() {
		// Series... 9 18 27 36 45 54 63 72 81 90.
		int j = 9;
		while (j <= 90) {
			System.out.print(j + " ");
			j += 9;
		}
		System.out.println();
	}

	void exercise18() {
		// Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
		int k = 1, l = -2;
		while (k <= 9 && l >= -10) {
			System.out.print(k + " " + l + " ");
			k += 2;
			l -= 2;
		}
		System.out.println();

	}

	void exercise19() {
		// Series... 5 10 15 20 25 30 35 40 45 50.
		int m = 5;
		while (m <= 50) {
			System.out.print(m + " ");
			m += 5;
		}
		System.out.println();
	}

	void exercise20() {
		// Series... 1 10 100 1000.
		int b = 1;
		while (b <= 1000) {
			System.out.print(b + " ");
			b *= 10;
		}
		System.out.println();
	}

	void exercise21() {
		// Series... 1 3 6 10 15 21 28 36 45.
		int a = 1, s = -1;
		while (a <= 45) {
			System.out.print(a + " ");
			s++;
			a += 2 + s;
		}
		System.out.println();
	}

	void exercise22() {
		// Series... 8 16 24 32 40 48 56 64 72 80.
		int d = 8;
		while (d <= 80) {
			System.out.print(d + " ");
			d += 8;
		}
		System.out.println();
	}

	void exercise23() {
		// Series... 0 1 1 2 3 5 8 13 21.
		int e = 0, r = 1;
		while (e <= 21) {
			System.out.print(e + " ");
			int c = e + r;
			e = r;
			r = c;
		}
		System.out.println();

	}

	void exercise24() {
		// series... 1 4 9 16 25 36 49 64 81 100.
		int h = 1;
		while (h <= 10) {
			System.out.print(h * h + " ");
			h++;
		}
		System.out.println();
	}

	void exercise25() {
		// series... 3 6 9 12 15 18 21 24 27 30.
		int o = 3;
		while (o <= 30) {
			System.out.print(o + " ");
			o += 3;
		}
		System.out.println();

	}

	void exercise26() {
		// Series... 7 14 21 28 35 42 49 56 63 70.
		int u = 7;
		while (u <= 70) {
			System.out.print(u + " ");
			u += 7;
		}
		System.out.println();
	}

	void exercise27() {
		// Series... 4 8 12 16 20 24 28 32 36 40.
		int p = 4;
		while (p <= 40) {
			System.out.print(p + " ");
			p += 4;
		}
		System.out.println();
	}

	void exercise28() {
		// Series... 10 20 30 40 50 60 70 80 90 100.
		int g = 10;
		while (g <= 100) {
			System.out.print(g + " ");
			g += 10;
		}
		System.out.println();
	}

	void exercise29() {
		// Series... 1 2 3 4 5 4 3 2 1.
		int x = 1;
		while (x < 5) {
			System.out.print(x + " ");
			x++;
		}
		while (x >= 1) {
			System.out.print(x + " ");
			x--;
		}
		System.out.println();
	}

	void exercise30() {
		// Series... 6 12 18 24 30 36 42 48 54 60.
		int t = 6;
		while (t <= 60) {
			System.out.print(t + " ");
			t += 6;
		}
		System.out.println();
	}
}

public class WhileLoopsSeries {
	public static void main(String[] args) {

		ExerciseWhileLoopSeries e = new ExerciseWhileLoopSeries();

		e.exercise16();
		e.exercise17();
		e.exercise18();
		e.exercise19();
		e.exercise20();
		e.exercise21();
		e.exercise22();
		e.exercise23();
		e.exercise24();
		e.exercise25();
		e.exercise26();
		e.exercise27();
		e.exercise28();
		e.exercise29();
		e.exercise30();

	}
}
