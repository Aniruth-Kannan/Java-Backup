package com;

public class classExample extends aClass1{
	//int x = 1;
	public void add() {
		System.out.println("Inside classExample class");
	}
	

	public static void main(String[] args) {
		final int x = 10;
		//int x=25;
		classExample ex = new classExample();
		System.out.println(new classExample().toString());
		aClass1 ac = new classExample();
		ac.add();
		ac.addNew();

	}

}
