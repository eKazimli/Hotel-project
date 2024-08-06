package com.example.Hotel_project.service;

import com.example.Hotel_project.entity.Customer;
import com.example.Hotel_project.entity.Role;
import com.example.Hotel_project.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public Customer activeCustomer(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setEnabled(true);
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setEnabled(false);
        customerRepository.save(customer);
    }

    public Customer addEmployee(Customer employee) {
        employee.getRoles().clear();
        employee.getRoles().add(Role.EMPLOYEE);
        return customerRepository.save(employee);
    }
}
