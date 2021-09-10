package no.hvl.data100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		for (int i=0; i<=10; i++) {
		
		String karakter;	
		int poengsum;	
		
		do {
			karakter = showInputDialog("Skriv inn poengsum: ");
			poengsum = parseInt(karakter);
		}
			
		while (poengsum < 0 || poengsum > 100);

		
		if (poengsum >= 90 && poengsum <= 100) {
			showMessageDialog(null, "Karakter: " + "A");
		}
		
		else if (poengsum <90 && poengsum >=80) {
			showMessageDialog(null, "Karakter: " + "B");
		}
		else if (poengsum <80 && poengsum >=60) {
			showMessageDialog(null, "Karakter: " + "C");
		}
		else if (poengsum <60 && poengsum >=50) {
			showMessageDialog(null, "Karakter: " + "D");
		}
		else if (poengsum <50 && poengsum >=40) {
			showMessageDialog(null, "Karakter: " + "E");
		}
		else if (poengsum <40 && poengsum >=0) {
			showMessageDialog(null, "Karakter: " + "F");
		}
		else {
			showMessageDialog(null,"Ugyldig poengsum");
		}

	}
	}
}
