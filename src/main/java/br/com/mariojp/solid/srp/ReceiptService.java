package br.com.mariojp.solid.srp;

public class ReceiptService {
	
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		TaxCalculator tax = new TaxCalculator();
		double total = subtotal + tax.calcularImposto(subtotal);
		ReceiptFormatter r = new ReceiptFormatter();
		return r.formatarTexto(order, subtotal, tax.calcularImposto(subtotal), total);
	}
}
