package com.example.fittracker.dto;


import lombok.Data;

import java.util.Date;

@Data
public class GoalDTO {

    private Long id;

    private String description;

    private Date startDate;

    private Date endDate;

    private boolean achieved;
}
//    public GoalDTO getGoalDTO(){
//        GoalDTO goalDTO = new GoalDTO();
//
//        goalDTO.setId(id);
//        goalDTO.setDescription(description);
//        goalDTO.setStartDate(startDate);
//        goalDTO.setEndDate(endDate);
//        goalDTO.setAchieved(achieved);
//
//        return goalDTO;
//
//    }

