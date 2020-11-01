public class Purchase {

    private int invoiceNumber;
    private double saleAmount;
    private double tax;
    //static means it is a part of this class
    //final means it is constant
    private static final double RATE = 0.05;

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        tax = saleAmount * RATE;
    }

    public void display(){
        System.out.println("Invoice #"
        + invoiceNumber + " AMount of sale: $" +
                saleAmount + " Tax: $" + tax);
    }

}
