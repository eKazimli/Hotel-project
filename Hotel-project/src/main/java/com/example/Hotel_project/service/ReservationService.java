package com.example.Hotel_project.service;

import com.example.Hotel_project.entity.Reservation;
import com.example.Hotel_project.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public List<Reservation> AllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation findById(Long id) {
        return reservationRepository.findById(id).orElseThrow(() -> new RuntimeException("Reservation Not Found"));
    }
}
