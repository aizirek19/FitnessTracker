package com.example.fittracker.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class ActivityDTO {
    private Long id;
    private Date date;
    private int steps;
    private double distance;
    @JsonProperty("caloriesBurned")
    private int caloriesBurned;
}
