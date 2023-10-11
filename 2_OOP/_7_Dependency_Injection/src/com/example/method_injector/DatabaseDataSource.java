package com.example.method_injector;

public class DatabaseDataSource implements DataSource {
    @Override
    public String fetchData() {
        // Simulate fetching data from a database
        return "Data fetched from the database";
    }
}
