package com.example.fitnessTracker.services.workout;

import com.example.fitnessTracker.dto.WorkoutDTO;
import com.example.fitnessTracker.entity.Workout;
import com.example.fitnessTracker.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WorkoutServiceImpl implements WorkoutService {

    private final WorkoutRepository workoutRepository;

    public WorkoutDTO postWorkout(WorkoutDTO workoutDTO) {
        Workout workout = new Workout();

        workout.setDate(workoutDTO.getDate());
        workout.setType(workout.getType());
        workout.setDuration(workout.getDuration());
        workout.setCaloriesBurned(workout.getCaloriesBurned());

        return workoutRepository.save(workout).getWorkoutDto();

    }

    public List<WorkoutDTO> getWorkouts(){
        List<Workout> workouts = workoutRepository.findAll();

        return workouts.stream().map(Workout::getWorkoutDto).collect(Collectors.toList());
    }
}
