package no.hvl.data100;

	import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;


public class O1 {

	public static void main(String[] args) {
		
		String lønn = showInputDialog("Skriv inn bruttoinntekt: ");
		int bruttoLønn = Integer.parseInt(lønn);
		int skatteFriLønn = 164100;
		
		double trinn0 = 0.00;
		double trinn1 = 0.0093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452; 
		
		
		if (bruttoLønn <= 164100) {
			double skatt = trinn0;
			double trinnSkatt = skatt*bruttoLønn;
			
			showMessageDialog(null,"Du er på skattetrinn 0, Skattesats er: " + trinn0 + "\n" + "Trinnskatt: " + trinnSkatt + " NOK");

		}
		
		else if (bruttoLønn > 164100 && bruttoLønn <= 230950) {
			int skattbarLønn = bruttoLønn - skatteFriLønn;
			double trinnSkatt = skattbarLønn * trinn1;
			
			showMessageDialog(null,"Du er på skattetrinn 1, Skattesats er: "  + trinn1 + "\n" + "Trinnskatt: " + trinnSkatt + " NOK");	
		}

		else if (bruttoLønn > 230950 && bruttoLønn <= 580650) {
			int skattbarLønn = bruttoLønn - skatteFriLønn;
			double trinnSkatt = skattbarLønn * trinn2;
			
			showMessageDialog(null, "Du er på skattetrinn 2, Skattesats er: " + trinn2 + "\n" + "Trinnskatt: " + trinnSkatt+ " NOK");
		}
		else if (bruttoLønn > 580650 && bruttoLønn <= 934050) {
			int skattbarLønn = bruttoLønn - skatteFriLønn;
			double trinnSkatt = skattbarLønn * trinn3;
			
			showMessageDialog(null, "Du er på skattetrinn 3, Skattesats er: " + trinn3 + "\n" + "Trinnskatt: " + trinnSkatt + " NOK");
		}
		
		else if (bruttoLønn > 934050) {
			int skattbarLønn = bruttoLønn - skatteFriLønn;
			double trinnSkatt = skattbarLønn * trinn4;
			
			showMessageDialog(null, "Du er på skattetrinn 4, Skattesats er: " + trinn4 + "\n" + "Trinnskatt: " + trinnSkatt + " NOK");
		
	}
	
	
}
}