package com.example.fittracker.services;


import com.example.fittracker.dto.WorkoutDTO;
import com.example.fittracker.entity.Workout;
import com.example.fittracker.repository.WorkoutRepository;
import jakarta.persistence.EntityNotFoundException;
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
        workout.setType(workoutDTO.getType());
        workout.setDuration(workoutDTO.getDuration());
        workout.setCaloriesBurned(workoutDTO.getCaloriesBurned());

        return workoutRepository.save(workout).getWorkoutDto();

    }

    public List<WorkoutDTO> getWorkouts() {
        List<Workout> workouts = workoutRepository.findAll();

        return workouts.stream().map(Workout::getWorkoutDto).collect(Collectors.toList());
    }
    public WorkoutDTO updateWorkout(Long id, WorkoutDTO workoutDTO) {
        Workout workout = workoutRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Workout not found"));

        workout.setType(workoutDTO.getType());
        workout.setDate(workoutDTO.getDate());
        workout.setDuration(workoutDTO.getDuration());
        workout.setCaloriesBurned(workoutDTO.getCaloriesBurned());

        return workoutRepository.save(workout).getWorkoutDto();
    }

    public void deleteWorkout(Long id) {
        Workout workout = workoutRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Workout not found"));
        workoutRepository.delete(workout);
    }

}