package com.example.Hotel_project.controller;

import com.example.Hotel_project.entity.Customer;
import com.example.Hotel_project.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/allCustomers")
    public List<Customer> getAllCustomers() {
        return adminService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return adminService.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public Customer active(@PathVariable Long id) {
        return adminService.activeCustomer(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        adminService.deleteCustomer(id);
    }

    @PostMapping("/employees")
    public Customer addEmployee(@RequestBody Customer employee) {
        return adminService.addEmployee(employee);
    }
}
