
public class Purchase {
	public static final double SALES_TAX_PERC = 0.05;
	
	private int invoiceNumber;
	private double salesAmount;
	private double salestax;
	
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public double getSalestax() {
		return salestax;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
		this.salestax = salesAmount * SALES_TAX_PERC;
	}
	
	Purchase (int invoiceNumber,double salesAmount) {
		setInvoiceNumber(invoiceNumber);
		setSalesAmount(salesAmount);
	}
	
	Purchase () {
		this (0, 0);
	}

}
