import java.util.*;
import java.util.stream.Collectors;

public class ReportGenerator {
    private SalesProcessor processor;

    public ReportGenerator(SalesProcessor processor) {
        this.processor = processor;
    }

    public void generateSummary() {
        System.out.println("📋 Sales Summary Report:");
        for (SalesRecord record : processor.getRecords()) {
            System.out.println(record);
        }
        System.out.printf("Total Revenue: ₹%.2f%n", processor.calculateTotalRevenue());
    }

    public void generateTopSellers() {
        System.out.println("\n🏆 Top Selling Products:");
        Map<String, Integer> productSales = new HashMap<>();

        for (SalesRecord record : processor.getRecords()) {
            productSales.put(record.getProduct(),
                    productSales.getOrDefault(record.getProduct(), 0) + record.getQuantity());
        }

        productSales.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(entry -> System.out.printf("%s: %d units%n", entry.getKey(), entry.getValue()));
    }
}
