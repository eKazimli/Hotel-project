package com.example.Hotel_project.repository;

import com.example.Hotel_project.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
