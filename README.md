#  SalesPulse: Sales Analytics Dashboard (Console-Based Java App)

SalesPulse is a modular, console-based Java application that helps businesses track and analyze their sales data. It allows users to input sales records, view performance summaries, and generate reports such as top-selling products or region-wise sales. Built with clean architecture and Object-Oriented Programming principles, the system is designed for easy extension and future upgrades.

---

##  Features

- Add and manage sales records
- View total revenue and sales summaries
- Generate top-selling product reports
- Filter sales data by region
- Console-based interface for lightweight execution
- Modular class structure for easy maintenance

---

##  Problem Statement

Sales teams often collect large amounts of data but struggle to turn it into useful insights. Without a proper dashboard, it's difficult to identify which products are performing well, which regions are lagging, or how revenue is trending. SalesPulse solves this by providing a structured, easy-to-use analytics tool.

---

##  Target Users

- Sales Managers  
- Business Analysts  
- Executives and Decision Makers  

---

##  OOP Concepts Used

- **Abstraction**: Each class handles a specific responsibility (data, logic, reporting, UI).
- **Encapsulation**: Private fields with public getters/methods ensure data integrity.
- **Inheritance**: Future report types can extend the base `ReportGenerator` class.
- **Polymorphism**: Interfaces can be used to generalize report generation behavior.

---

##  Class Structure (UML Overview)

- `SalesRecord`: Stores individual sales data  
- `SalesProcessor`: Handles filtering and calculations  
- `ReportGenerator`: Generates summaries and top-seller reports  
- `DashboardApp`: Main class for user interaction  

---

## 🛠 Technologies Used

- Java (JDK 17+ recommended)
- Java Collections & Streams
- Console I/O (Scanner)
- LocalDate for date handling

---

##  How to Run

1. Clone the repository  
2. Compile all `.java` files  
