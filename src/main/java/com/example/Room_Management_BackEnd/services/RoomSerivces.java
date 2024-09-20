package com.example.Room_Management_BackEnd.services;

import com.example.Room_Management_BackEnd.dto.RoomDto;
import com.example.Room_Management_BackEnd.entity.Room;
import com.example.Room_Management_BackEnd.repo.RoomRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoomSerivces {
    @Autowired
    private RoomRepo roomRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<RoomDto> getAllRooms(){
        List<Room> roomDtos = roomRepo.findAll();
        return modelMapper.map(roomDtos, new TypeToken<List<RoomDto>>(){}.getType());
    }

    public RoomDto saveRoom(RoomDto roomDto){
        roomRepo.save(modelMapper.map(roomDto, Room.class));
        return roomDto;
    }


}
