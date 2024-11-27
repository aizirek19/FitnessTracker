package com.example.fittracker.services;

import com.example.fittracker.dto.GoalDTO;

import java.util.List;

public interface GoalService {

    GoalDTO postGoal(GoalDTO dto);
    List<GoalDTO> getGoals();

    GoalDTO updateStatus(Long id);

    Object updateGoal(Long id, GoalDTO dto);

    void deleteGoal(Long id);
}
