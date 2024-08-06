package com.example.Hotel_project.controller;

import com.example.Hotel_project.entity.Reservation;
import com.example.Hotel_project.entity.Room;
import com.example.Hotel_project.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/rooms")
    public List<Room> getAllRooms() {
        return employeeService.getAllRooms();
    }

    @PostMapping("/reservations")
    public Reservation makeReservation(@RequestBody Reservation reservation) {
        return employeeService.makeReservation(reservation);
    }
}
