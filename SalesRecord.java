import java.time.LocalDate;

public class SalesRecord {
    private int recordId;
    private LocalDate date;
    private String region;
    private String product;
    private int quantity;
    private double revenue;

    public SalesRecord(int recordId, LocalDate date, String region, String product, int quantity, double revenue) {
        this.recordId = recordId;
        this.date = date;
        this.region = region;
        this.product = product;
        this.quantity = quantity;
        this.revenue = revenue;
    }

    public double getRevenue() {
        return revenue;
    }

    public String getRegion() {
        return region;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Date: %s | Region: %s | Product: %s | Qty: %d | Revenue: %.2f",
                recordId, date, region, product, quantity, revenue);
    }
}
