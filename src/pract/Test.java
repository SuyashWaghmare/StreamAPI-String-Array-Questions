package pract;

class A {
	private C c;

	public void method1(String a, String b) {
		String c = a + b;
		int p = (Integer.parseInt(a) + Integer.parseInt(b));
		System.out.println(c);
		System.out.println(p);
	}
}

class B {
	public static int method2(int c, int d) {
		System.out.println(c);
		System.out.println(d);
		return c + d;
	}

	public static int method3(int l, int m) {
		int n = B.method2(l, m);
		int o = n - m;

		System.out.println(n);
		System.out.println(o);

		return o;
	}
}

class C {
	public int add(int e, int f) {
		int g = e + f;
		int h = sub(e, f);
		int i = g + h;

		System.out.println(g);
		System.out.println(h);
		System.out.println(i);

		return i;
	}

	private int sub(int j, int k) {
		if (j < k) {
			return j - k;
		} else {
			return k - j;
		}
		// return null;

	}

}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.method1("2", "3");

		B.method2(5, 6);
		B.method3(3, 4);
		

		C c = new C();
		c.add(8, 9);
		
		

	}
}
