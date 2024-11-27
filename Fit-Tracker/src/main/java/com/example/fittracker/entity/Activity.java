package com.example.fittracker.entity;

import com.example.fittracker.dto.ActivityDTO;
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