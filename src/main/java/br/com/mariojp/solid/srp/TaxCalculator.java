package br.com.mariojp.solid.srp;

public class TaxCalculator {

	public double calcularImposto(double subtotal) {
		double tax = Double.parseDouble(System.getProperty("tax.rate")) * subtotal;
		return tax;
	}

}
