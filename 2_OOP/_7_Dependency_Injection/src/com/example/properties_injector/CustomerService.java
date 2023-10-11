package com.example.properties_injector;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Property injection using a setter method
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(String name) {
        // create a customer
        Customer customer = new Customer(name);
        customerRepository.save(customer); // Use the injected dependency
    }
}
