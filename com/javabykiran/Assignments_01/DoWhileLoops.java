package com.javabykiran.Assignments_01;

class ExerciseDoWhile {

	void exercise1() {
		// Program To print 1 to 25 nos.
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 25);
		System.out.println();

	}

	void exercise2() {
		// Program To print 25 to 1 nos.
		int j = 25;
		do {
			System.out.print(j + " ");
			j--;
		} while (j > 0);
		System.out.println();

	}

	void exercise3() {
		// Program To print 1 to 100 Odd nos.
		int k = 1;
		do {
			if (k % 2 != 0) {
				System.out.print(k + " ");
			}
			k++;
		} while (k < 100);
		System.out.println();
	}

	void exercise4() {
		// Program To print 1 to 100 even nos.
		int l = 2;
		do {
			if (l % 2 == 0) {
				System.out.print(l + " ");
			}
			l++;
		} while (l <= 100);
		System.out.println();
	}

	void exercise5() {
		// Program To print sum of 1 to 50 Odd nos.
		int m = 1;
		do {
			if (m % 2 != 0) {
				System.out.print(m + " ");
			}
			m++;
		} while (m <= 50);
		System.out.println();
	}

	void exercise6() {
		// Program To print sum of 1 to 50 EVEN nos.
		int n = 2;
		do {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
			n++;
		} while (n <= 50);
		System.out.println();

	}

	void exercise7() {
		// Program To print -45 to +45 nos.
		int o = -45;
		do {
			System.out.print(o + " ");
			o++;
		} while (o <= 45);
		System.out.println();
	}

	void exercise8() {
		// Program To print 50 to 100 nos.
		int p = 50;
		do {
			System.out.print(p + " ");
			p++;
		} while (p <= 100);
		System.out.println();
	}

	void exercise9() {
		// Program To print sum of odd and even no.
		int q = 0;
		int oddSum = 0;
		int evenSum = 0;
		do {
			if (q % 2 == 0) {
				evenSum += 1;
			} else {
				oddSum += 1;
			}
			q++;
		} while (q < 100);
		System.out.println("Odd Sum : " + oddSum + " Even Sum : " + evenSum);

	}

	void exercise10() {
		// Program To print even and odd No
		int r = 0;
		do {
			if (r % 2 == 0) {
				System.out.println(r + " even");
			} else {
				System.out.println(r + " odd");
			}
			r++;
		} while (r <= 100);
	}

	void exercise11() {
		// Program To print 1 to 100 no.
		int s = 1;
		do {
			System.out.print(s + " ");
			s++;
		} while (s <= 100);
		System.out.println();
	}

	void exercise12() {
		// Program To print 100 to 1 no.
		int i = 100;
		do {
			System.out.print(i + " ");
			i--;
		} while (i > 0);
		System.out.println();
	}

	void exercise13() {
		// Program To print 30 to 50 no.
		int i = 30;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 50);
		System.out.println();
	}

	void exercise14() {
		// Program To print count of even No 1 to 25 no.
		int i = 1;
		int evenSum = 0;
		do {
			if (i % 2 == 0) {
				evenSum += 1;
			}
			i++;
		} while (i <= 25);
		System.out.println("Even Sum : " + evenSum);
	}

	void exercise15() {
		// Program To print count of odd No 1 to 25 no.
		int w = 1;
		int oddSumSec = 0;
		do {
			if (w % 2 != 0) {
				oddSumSec += 1;
			}
			w++;
		} while (w <= 25);
		System.out.println("Odd Sum : " + oddSumSec);
	}

	void exercise16() {
		// Series... 2 4 6 8 10 12 14 16 18 20.
		int x = 2;
		do {
			System.out.print(x + " ");
			x += 2;
		} while (x <= 20);
		System.out.println();
	}

	void exercise17() {
		// Series... 9 18 27 36 45 54 63 72 81 90.
		int y = 9;
		do {
			System.out.print(y + " ");
			y += 9;
		} while (y <= 90);
		System.out.println();
	}

	void exercise18() {
		// Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
		int z = 1;
		int temp = 0;
		do {
			if (z % 2 == 0) {
				temp = z;
				temp = z * -1;
				System.out.print(temp + " ");
			} else {
				System.out.print(z + " ");
			}
			z++;
		} while (z <= 10);
		System.out.println();
	}

	void exercise19() {
		// Series... 5 10 15 20 25 30 35 40 45 50.
		int a = 5;
		do {
			System.out.print(a + " ");
			a += 5;
		} while (a <= 50);
		System.out.println();
	}

	void exercise20() {
		// Series... 1 10 100 1000.
		int b = 1;
		do {
			System.out.print(b + " ");
			b = b * 10;
		} while (b <= 1000);
		System.out.println();
	}

	void exercise21() {
		// Series... 1 3 6 10 15 21 28 36 45.
		int c = 1;
		int tem = 1;
		do {
			System.out.print(c + " ");
			tem++;
			c += tem;
		} while (c <= 45);
		System.out.println();
	}

	void exercise22() {
		// Series... 8 16 24 32 40 48 56 64 72 80.
		int d = 8;
		do {
			System.out.print(d + " ");
			d += 8;
		} while (d <= 80);
		System.out.println();
	}

	void exercise23() {
		// Series... 0 1 1 2 3 5 8 13 21.
		int count = 0;
		int firstTerm = 0;
		int secTerm = 1;
		int nextTerm = 0;

		do {
			System.out.print(firstTerm + " ");
			nextTerm = firstTerm + secTerm;
			firstTerm = secTerm;
			secTerm = nextTerm;
			count++;

		} while (count < 9);
		System.out.println();

	}

	void exercise24() {
		// series... 1 4 9 16 25 36 49 64 81 100.
		int g = 1;
		do {
			System.out.print(g * g + " ");
			g++;
		} while (g <= 10);
		System.out.println();
	}

	void exercise25() {
		// series... 3 6 9 12 15 18 21 24 27 30.
		int h = 3;
		do {
			System.out.println(h + " ");
			h += 3;
		} while (h <= 30);
		System.out.println();
	}

	void exercise26() {
		// Series... 7 14 21 28 35 42 49 56 63 70.
		int aa = 7;
		do {
			System.out.print(aa + " ");
			aa += 7;
		} while (aa <= 70);
		System.out.println();
	}

	void exercise27() {
		// Series... 4 8 12 16 20 24 28 32 36 40.
		int bb = 4;
		do {
			System.out.print(bb + " ");
			bb += 4;
		} while (bb <= 40);
		System.out.println();
	}

	void exercise28() {
		// Series... 10 20 30 40 50 60 70 80 90 100.
		int cc = 1;
		do {
			System.out.print(cc * 10 + " ");
			cc++;
		} while (cc <= 10);
		System.out.println();
	}

	void exercise29() {
		// Series... 1 2 3 4 5 4 3 2 1.
		int dd = 1;
		do {
			System.out.print(dd + " ");
			dd++;
		} while (dd < 5);
		do {
			System.out.print(dd + " ");
			dd--;
		} while (dd >= 1);
		System.out.println();
	}

	void exercise30() {
		// Series... 6 12 18 24 30 36 42 48 54 60.
		int ee = 6;
		do {
			System.out.print(ee + " ");
			ee += 6;
		} while (ee <= 60);
		System.out.println();
	}
}

public class DoWhileLoops {
	public static void main(String[] args) {

		ExerciseDoWhile e = new ExerciseDoWhile();

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
