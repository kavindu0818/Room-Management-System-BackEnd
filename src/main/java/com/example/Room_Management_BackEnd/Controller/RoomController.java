package com.example.Room_Management_BackEnd.Controller;

import com.example.Room_Management_BackEnd.dto.RoomDto;
import com.example.Room_Management_BackEnd.repo.RoomRepo;
import com.example.Room_Management_BackEnd.services.RoomSerivces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class RoomController {

    @Autowired
    private RoomSerivces roomSerivces;

    @Autowired
    private RoomRepo roomRepo;

    @GetMapping(value = "/getRoom")
    public List<RoomDto> getUser(){
        return roomSerivces.getAllRooms();
    }

    @PostMapping(value = "/saveRoom")
    public RoomDto saveUser(@RequestBody RoomDto roomDto){
        return roomSerivces.saveRoom(roomDto);
    }


}
