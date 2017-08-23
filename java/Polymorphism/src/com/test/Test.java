package com.test;

class Father {
	void readBook() {
		System.out.println("I like read book");
	}

	void whoami() {
		System.out.println("I am father");
	}
	
	// ��������
	void whoami(String name) {
		System.out.println("I am " + name);
	}
}

class Son extends Father {
	void playGame() {
		System.out.println("I like play game");
	}

	// ������д
	void whoami() {
		System.out.println("I am son");
	}
}

class Dog {
}

public class Test {

	public static void main(String[] args) {
		// ��������ת��
		Father f = new Son();
		System.out.println(f.getClass());				//class com.test.Son

		f.readBook();									//I like read book
		
		// ��̬���ڵ�������Ҫ������
		// 1.�̳�
		// 2.��д
		// 3.��������ָ���������
		f.whoami();										//I am son
		
		// Father���whoami����������
		((Father) f).whoami();							//I am son

		f.whoami("somebody");							//I am somebody
		
		((Son) f).playGame();							//I like play game

		// ��ͬ���� ǿ��ת�� ����ʱ����
		// Father f1 = (Father)(new Dog());
		
		// �̳й�ϵ ����ǿ��ת�� ����ʱ����
		Son s = (Son) new Father();						//java.lang.ClassCastException
	}

}
