package com;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class prereq {

	public static void main(String[] args) {
		int ip1 = 6;
		int ip2 = 3;
		int ip3 = 6;
		int[] ip4 = {2,1,9,3,1,4};
		int arrStrt = 0;
		int noArr = ip1/ip2;
		int  z = 0;
		int arrMin = 0;
		ArrayList <Integer> cpIp = new ArrayList<Integer>();
		int formattedList[][] = new int [noArr][ip2];
		for(int i = 0; i<ip1; i++) {
			cpIp.add(ip4[i]);
		}
		System.out.println("cpIp: " + cpIp);
		for(int i = 0; i<noArr ; i++) {
			for(int j = 0 ; j<ip2 ; j++) {
			formattedList[i][j] = ip4[z];
			System.out.println(formattedList[i][j]);
			z++;	
		}
	} 	
		int[] arrMax = new int[noArr-1]; 
		for(int i = 0; i<noArr ; i++) {
			arrMax[i] = formattedList[i][0];
			
		}
		Arrays.sort(formattedList);
		int smallestArr = arrMax[0];
		for(int i = 0 ;i<noArr;i++) {
			for(int j = 0 ; j<ip2 ; j++) {
			System.out.println(formattedList[i][j]);
		}
		}
		System.out.println("smallestArr: " + smallestArr);

}
}
