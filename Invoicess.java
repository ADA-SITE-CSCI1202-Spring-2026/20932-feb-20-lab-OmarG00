import java.util.Scanner;

public class Invoicess {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoicess(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() { return partNumber; }
    public void setPartNumber(String partNumber) { this.partNumber = partNumber; }

    public String getPartDescription() { return partDescription; }
    public void setPartDescription(String partDescription) { this.partDescription = partDescription; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPricePerItem() { return pricePerItem; }
    public void setPricePerItem(double pricePerItem) { this.pricePerItem = pricePerItem; }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Invoicess[] invoices = new Invoicess[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Invoice " + (i + 1) + " ---");

            System.out.print("Part Number: ");
            String partNumber = scanner.nextLine();

            System.out.print("Part Description: ");
            String partDescription = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price Per Item: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            invoices[i] = new Invoicess(partNumber, partDescription, quantity, price);
        }

        System.out.println("\n===== Invoice Summary =====");
        for (int i = 0; i < invoices.length; i++) {
            System.out.println("\nInvoice " + (i + 1));
            System.out.println("Part Number     : " + invoices[i].getPartNumber());
            System.out.println("Description     : " + invoices[i].getPartDescription());
            System.out.println("Quantity        : " + invoices[i].getQuantity());
            System.out.println("Price Per Item  : " + invoices[i].getPricePerItem());
            System.out.println("Invoice Amount  : " + invoices[i].getInvoiceAmount());
        }
    }
}