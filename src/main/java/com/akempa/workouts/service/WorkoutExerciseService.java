package com.akempa.workouts.service;

import com.akempa.workouts.database.WorkoutExerciseEntityRepository;
import com.akempa.workouts.model.WorkoutExercise;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class WorkoutExerciseService {

    private final WorkoutExerciseEntityRepository workoutExerciseEntityRepository;

    public List<WorkoutExercise> getExercises() {
        return workoutExerciseEntityRepository.findAll();
    }

    public void addNewExercise(WorkoutExercise workoutExercise) {
        Optional<WorkoutExercise> exerciseByNameAndSessionNum = workoutExerciseEntityRepository
                .findExerciseByNameAndSession(workoutExercise.getName(), workoutExercise.getSessionNum());
        if (exerciseByNameAndSessionNum.isPresent()){
            throw new IllegalStateException("Exercise already added to this session");
        }
        workoutExerciseEntityRepository.save(workoutExercise);
    }

    public void deleteExercise(Long exerciseId) {
        boolean exist = workoutExerciseEntityRepository.existsById(exerciseId);
        if (!exist){
            throw new IllegalStateException("Exercise with ID " + exerciseId + " doesn't exist...");
        }
        workoutExerciseEntityRepository.deleteById(exerciseId);
    }
}
