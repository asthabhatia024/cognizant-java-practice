package com.dependency;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public void findCustomerById(int id) {
        System.out.println("Customer found with ID: " + id);
    }

}