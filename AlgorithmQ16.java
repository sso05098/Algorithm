package aaaa;

import java.util.Scanner;

public class AlgorithmQ16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for ( int i=0; i<a; i++) {
			for( int j=1; j<a-i; j++) {
				System.out.print(" ");
			}
			for ( int k=0; k<2*i+1; k++) {
			System.out.print(i);
		}
			System.out.println();
	}
}
}
