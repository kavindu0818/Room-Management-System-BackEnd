package com.example.Room_Management_BackEnd.repo;

import com.example.Room_Management_BackEnd.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,Integer> {
}
