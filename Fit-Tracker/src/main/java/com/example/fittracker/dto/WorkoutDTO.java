package com.example.fittracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.Date;

@Data
public class WorkoutDTO {

    private Long id;

    private String type;

    private Date date;

    private int duration;

    @JsonProperty("caloriesBurned")
    private int caloriesBurned;
}
