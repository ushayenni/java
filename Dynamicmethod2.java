import java.io.*;
class A {
	void CallMe()
	{
		System.out.println("I am from A");
	}
}
class B extends A {
	void CallMe() {
		System.out.println("I am from B");
	}
}
class Main {
	public static void main(String args[]) {
		A a1=new A();
		A a2=new B();
        B b=new B();
        a1.CallMe();
        a2.CallMe();
        b.CallMe();
	}
}
