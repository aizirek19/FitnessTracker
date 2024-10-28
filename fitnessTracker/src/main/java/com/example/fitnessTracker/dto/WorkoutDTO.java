package com.example.fitnessTracker.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class WorkoutDTO {

    private Long id;

    private String type;

    private Date date;

    private int duration;
    @Column(name = "calories_burned")
    private int caloriesBurned;
}
