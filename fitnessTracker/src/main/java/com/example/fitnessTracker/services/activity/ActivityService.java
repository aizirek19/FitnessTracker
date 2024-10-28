package com.example.fitnessTracker.services.activity;

import com.example.fitnessTracker.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {
    ActivityDTO postActivity(ActivityDTO dto);

    List<ActivityDTO> getActivities();

}
