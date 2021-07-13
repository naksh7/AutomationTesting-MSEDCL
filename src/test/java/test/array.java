package test;

import java.util.Scanner;

public class array {
	
	public static void main(String[] args) {
		
		String [][] name = new String[1][2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<2;j++) {
				name[i][j] = sc.next();
			}
		}
		
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(name[i][j]);
			}
		}
		
	}

}
