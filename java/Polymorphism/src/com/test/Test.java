package com.test;

class Father {
	void readBook() {
		System.out.println("I like read book");
	}

	void whoami() {
		System.out.println("I am father");
	}
	
	// 方法重载
	void whoami(String name) {
		System.out.println("I am " + name);
	}
}

class Son extends Father {
	void playGame() {
		System.out.println("I like play game");
	}

	// 方法重写
	void whoami() {
		System.out.println("I am son");
	}
}

class Dog {
}

public class Test {

	public static void main(String[] args) {
		// 向上类型转换
		Father f = new Son();
		System.out.println(f.getClass());				//class com.test.Son

		f.readBook();									//I like read book
		
		// 多态存在的三个必要条件：
		// 1.继承
		// 2.重写
		// 3.父类引用指向子类对象
		f.whoami();										//I am son
		
		// Father类的whoami方法调不到
		((Father) f).whoami();							//I am son

		f.whoami("somebody");							//I am somebody
		
		((Son) f).playGame();							//I like play game

		// 不同类型 强制转换 编译时报错
		// Father f1 = (Father)(new Dog());
		
		// 继承关系 向下强制转换 运行时报错
		Son s = (Son) new Father();						//java.lang.ClassCastException
	}

}
