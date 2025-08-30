import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class SalesProcessor {
    private List<SalesRecord> records = new ArrayList<>();

    public void loadSampleData() {
        records.add(new SalesRecord(1, LocalDate.of(2025, 8, 1), "North", "Laptop", 5, 50000));
        records.add(new SalesRecord(2, LocalDate.of(2025, 8, 2), "South", "Phone", 10, 30000));
        records.add(new SalesRecord(3, LocalDate.of(2025, 8, 3), "North", "Tablet", 7, 21000));
        records.add(new SalesRecord(4, LocalDate.of(2025, 8, 4), "East", "Laptop", 3, 30000));
    }

    public List<SalesRecord> filterByRegion(String region) {
        return records.stream()
                .filter(r -> r.getRegion().equalsIgnoreCase(region))
                .collect(Collectors.toList());
    }

    public double calculateTotalRevenue() {
        return records.stream()
                .mapToDouble(SalesRecord::getRevenue)
                .sum();
    }

    public List<SalesRecord> getRecords() {
        return records;
    }
}
