package com;
import java.io.IOException;

public class test_03 {

	public static void main(String[] args) {
		try {
			throw new IOException();
		}
		catch(Exception e) {
			System.out.println("Exception");
			
		}
		

	}

}
