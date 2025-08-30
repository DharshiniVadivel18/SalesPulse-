import java.util.Scanner;

public class DashboardApp {
    public static void main(String[] args) {
        SalesProcessor processor = new SalesProcessor();
        processor.loadSampleData();

        ReportGenerator generator = new ReportGenerator(processor);

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to SalesPulse Dashboard ===");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View Sales Summary");
            System.out.println("2. View Top Sellers");
            System.out.println("3. Filter by Region");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> generator.generateSummary();
                case 2 -> generator.generateTopSellers();
                case 3 -> {
                    System.out.print("Enter region name: ");
                    String region = scanner.nextLine();
                    processor.filterByRegion(region).forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
