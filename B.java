package inheritance.single;

public class B extends A {
	void sub() {
		int a=10, b=20,sub;
		sub = a-b;
		System.out.println("sub is : "+sub);
	}
	void name() {
		System.out.println("anand");
	}
	void data(int n) {
		System.out.println("single parameter : "+n);
	}
	public static void main(String[] args) {
		B b = new B();
		b.add();
		b.sub();
		b.name();
		A a = new A();
		a.name();
		b.data(2);
		a.data(10,"ramisetti");
	}
}
