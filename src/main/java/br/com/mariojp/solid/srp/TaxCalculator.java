package br.com.mariojp.solid.srp;

public class TaxCalculator {

	public double calcularImposto(double subtotal) {
       double tax;
        if(System.getProperty("tax.rate").isEmpty()){
            return tax = 0.1 * subtotal;
        }

		return tax = Double.parseDouble(System.getProperty("tax.rate")) * subtotal;
	}

}
