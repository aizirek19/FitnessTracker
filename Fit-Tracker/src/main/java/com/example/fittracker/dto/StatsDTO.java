package com.example.fittracker.dto;

import lombok.Data;

@Data
public class StatsDTO {

    private long achievedGoals;

    private long notAchievedGoals;

    private int steps;

    private double distance;

    private int totalCaloriesBurned;

    private int duration;
}
