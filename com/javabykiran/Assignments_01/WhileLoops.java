package com.javabykiran.Assignments_01;
//PatternExercise

class ExerciseWhileLoopPattern {

	void exercise1() {
		// Program To print 1 to 25 nos.
		int i = 1;
		while (i <= 25) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}

	void exercise2() {
		// Program To print 25 to 1 nos.
		int j = 25;
		while (j >= 1) {
			System.out.print(j + " ");
			j--;
		}
		System.out.println();
	}

	void exercise3() {
		// Program To print 1 to 100 Odd nos.
		int a = 1;
		while (a <= 100) {
			if (a % 2 != 0) {
				System.out.print(a + " ");

			}
			a++;
		}
		System.out.println();
	}

	void exercise4() {
		// Program To print 1 to 100 even nos.
		int b = 1;
		while (b <= 100) {
			if (b % 2 == 0) {
				System.out.print(b + " ");

			}
			b++;
		}
		System.out.println();
	}

	void exercise5() {
		// Program To print sum of 1 to 50 Odd nos.
		int c = 1, sum = 0;
		while (c <= 50) {
			if (c % 2 != 0) {
				sum += c;
			}
			c++;
		}
		System.out.println(sum);
	}

	void exercise6() {
		// Program To print sum of 1 to 50 EVEN nos.
		int d = 1, sum1 = 0;
		while (d <= 50) {
			if (d % 2 == 0) {
				sum1 += d;
			}
			d++;
		}
		System.out.println(sum1);
	}

	void exercise7() {
		// Program To print -45 to +45 nos.
		int e = -45;
		while (e <= 45) {
			System.out.print(e + " ");
			e++;
		}
		System.out.println();
	}

	void exercise8() {
		// Program To print 50 to 100 nos.
		int f = 50;
		while (f <= 100) {
			System.out.print(f + " ");
			f++;
		}
		System.out.println();
	}

	void exercise9() {
		// Program To print sum of odd and even no.
		int g = 1, sum2 = 0;
		while (g <= 50) {
			if (g % 2 != 0) {
				sum2 += g;
			}
			g++;
		}

		int h = 1, sum3 = 0;
		while (h <= 50) {
			if (h % 2 == 0) {
				sum3 += h;
			}
			h++;
		}
		System.out.println(sum2 + sum3);
	}

	void exercise10() {
		// Program To print even and odd No
		System.out.println("Odd Numbers : ");
		int l = 1;
		while (l <= 100) {
			if (l % 2 != 0) {
				System.out.print(l + " ");
			}
			l++;
		}
		System.out.println("Even Numbers : ");
		int k = 1;
		while (k <= 100) {
			if (k % 2 == 0) {
				System.out.print(k + " ");
			}
			k++;
		}
		System.out.println();

	}

	void exercise11() {
		// Program To print 1 to 100 no.
		int q = 1;
		while (q <= 100) {
			System.out.print(q + " ");
			q++;
		}
		System.out.println();
	}

	void exercise12() {
		// Program To print 100 to 1 no.
		int w = 100;
		while (w >= 1) {
			System.out.print(w + " ");
			w--;
		}
		System.out.println();
	}

	void exercise13() {
		// Program To print 30 to 50 no.
		int o = 30;
		while (o <= 50) {
			System.out.print(o + " ");
			o++;
		}
		System.out.println();
	}

	void exercise14() {
		// Program To print count of even No 1 to 25 no.
		int v = 1, count1 = 0;
		while (v <= 25) {
			if (v % 2 == 0) {
				count1++;
			}
			v++;
		}
		System.out.println(count1);
	}

	void exercise15() {
		// Program To print count of odd No 1 to 25 no.
		int n = 1, count = 0;
		while (n <= 25) {
			if (n % 2 != 0) {
				count++;
			}
			n++;
		}
		System.out.println(count);
	}

}

public class WhileLoops {
	public static void main(String[] args) {

		ExerciseWhileLoopPattern e = new ExerciseWhileLoopPattern();

		e.exercise1();
		e.exercise2();
		e.exercise3();
		e.exercise4();
		e.exercise5();
		e.exercise6();
		e.exercise7();
		e.exercise8();
		e.exercise9();
		e.exercise10();
		e.exercise11();
		e.exercise12();
		e.exercise13();
		e.exercise14();
		e.exercise15();
	}
}
