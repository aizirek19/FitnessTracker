package com.example.fitnessTracker.entity;

import com.example.fitnessTracker.dto.ActivityDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    private int steps;

    private double distance;

    @Column(name = "calories_burned")
    private int caloriesBurned;

    public ActivityDTO getActivityDTO(){
        ActivityDTO activityDTO = new ActivityDTO();

        activityDTO.setId(id);
        activityDTO.setDate(date);
        activityDTO.setDistance(distance);
        activityDTO.setSteps(steps);
        activityDTO.setCaloriesBurned(caloriesBurned);

        return activityDTO;
    }

}
