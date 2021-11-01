package com.akempa.workouts.service;

import com.akempa.workouts.database.WorkoutExerciseEntityRepository;
import com.akempa.workouts.model.WorkoutExercise;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class WorkoutExerciseService {

    private final WorkoutExerciseEntityRepository workoutExerciseEntityRepository;

    public List<WorkoutExercise> getExercises() {

        /*WorkoutExercise workoutExercise = WorkoutExercise.builder()
                .id(1L)
                .sessionNum(1)
                .name("Bench Press")
                .repetitionsNum(10)
                .seriesNum(4)
                .breakSeconds(130)
                .build();
        return List.of(workoutExercise);*/

        return workoutExerciseEntityRepository.findAll();
    }
}
