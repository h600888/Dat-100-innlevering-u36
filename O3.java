package no.hvl.data100;

import static javax.swing.JOptionPane.*;

public class O3 {

	
	public static void main(String[] args) {
		
		String input = showInputDialog("Skriv et tall: ");
		
		int n = Integer.parseInt(input);
		
		int sum = 1;
		
		for (int i = 2; i <=n; i++) {
			
			sum *= i;

		
		}	
		System.out.println(sum);
		}
} 
