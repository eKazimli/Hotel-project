package com.example.Hotel_project.service;

import com.example.Hotel_project.entity.Reservation;
import com.example.Hotel_project.entity.Room;
import com.example.Hotel_project.repository.ReservationRepository;
import com.example.Hotel_project.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final RoomRepository roomRepository;
    private final ReservationRepository reservationRepository;

    public List<Room> getAllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
