package com.example.fittracker.entity;

import com.example.fittracker.dto.GoalDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Date startDate;

    private Date endDate;

    private boolean achieved;

    public GoalDTO getGoalDTO() {
        GoalDTO dto = new GoalDTO();

        dto.setId(this.id);
        dto.setDescription(this.description);
        dto.setStartDate(this.startDate);
        dto.setEndDate(this.endDate);
        dto.setAchieved(this.achieved);

        return dto;
        //goalDTO;
    }


}