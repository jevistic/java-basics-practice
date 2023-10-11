package com.example.properties_injector;

public class DatabaseCustomerRepository implements CustomerRepository {
    @Override
    public void save(Customer customer) {
        // save customer data in a database
        System.out.println("Saved customer: " + customer.getName());
    }
}
