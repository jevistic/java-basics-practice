package com.example.method_injector;

public class ReportGenerator {
    public void generateReport(DataSource dataSource) {
        // Use the injected dataSource to fetch data and generate a report
        String data = dataSource.fetchData();
        System.out.println("Generating report using data: " + data);
    }
}