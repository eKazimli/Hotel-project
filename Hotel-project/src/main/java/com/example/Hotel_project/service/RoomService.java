package com.example.Hotel_project.service;

import com.example.Hotel_project.entity.Customer;
import com.example.Hotel_project.entity.Room;
import com.example.Hotel_project.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public List<Room> AllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    public Room save(Room room) {
        return roomRepository.save(room);
    }

    public Room findById(Long id) {
        return roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Room not found"));
    }
}
