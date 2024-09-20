package com.example.Room_Management_BackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Room{
    @Id
    private String id;
    private String name;
    private String type;
    private double price;
    private int accomCount;
    private double width;
    private double lenth;
    private int adultCount;
    private int children;
    private String amenities;
    private byte image;
    private String sdes;
    private String des;

}
