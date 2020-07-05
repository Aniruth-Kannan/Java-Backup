package com;
import java.util.*;

public class test_05 extends java.lang.Thread{

	public static void main(String[] args) {
		Vector vec= new Vector(3);
		vec.add(1);
		vec.add(7);
		vec.add(12);
		Collections.fill(vec, 1);
		System.out.println(vec);
		
		
		
	}
	public void run () {
		
	}

}
