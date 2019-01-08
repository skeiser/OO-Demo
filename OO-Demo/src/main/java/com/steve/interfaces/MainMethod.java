package com.steve.interfaces;

interface StaticVarInterface {
	String name = "Bubba";
	default String letsStop(int x) {
		return "Default letsStop has been called with " + x;
	}
	default String sayHey(int x) {
		return "Default sayHey has been called with " + x;
	}
	void letsGo();

}

class InterfaceExample implements StaticVarInterface {
	public void sayName() {
		System.out.println(name);
	}

	public String sayHey(int x) {
		return "Derived sayHey has been called with " + x;
	}
	@Override
	public void letsGo() {
		System.out.println("LetsGo has been called");
	}
}

public class MainMethod {
	public static void main(String argsp[]) {
		InterfaceExample ie = new InterfaceExample();
		ie.sayName();
		System.out.println(ie.sayHey(2));
		System.out.println(ie.letsStop(3));
	}
}
