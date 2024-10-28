package com.example.fitnessTracker.services.goal;

import com.example.fitnessTracker.dto.GoalDTO;
import com.example.fitnessTracker.entity.Goal;
import com.example.fitnessTracker.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoalServiceImpl implements GoalService {

    private final GoalRepository goalRepository;

    public GoalDTO postGoal(GoalDTO dto){
        Goal goal = new Goal();

        goal.setDescription(dto.getDescription());
        goal.setStartDate(dto.getStartDate());
        goal.setEndDate(dto.getEndDate());
        goal.setAchieved(false);

        // Преобразуем Goal в GoalDTO с помощью нового метода toDTO()
        return goalRepository.save(goal).toDTO();
    }
    }


