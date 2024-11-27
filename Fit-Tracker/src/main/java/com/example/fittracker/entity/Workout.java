package com.example.fittracker.entity;

import com.example.fittracker.dto.WorkoutDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Date date;

    private int duration;

    @Column(name = "calories_burned")
    private int caloriesBurned;

    public WorkoutDTO getWorkoutDto() {
        WorkoutDTO workoutDTO = new WorkoutDTO();

        workoutDTO.setId(id);
        workoutDTO.setType(type);
        workoutDTO.setDate(date);
        workoutDTO.setDuration(duration);
        workoutDTO.setCaloriesBurned(caloriesBurned);

        return workoutDTO;
    }
}
