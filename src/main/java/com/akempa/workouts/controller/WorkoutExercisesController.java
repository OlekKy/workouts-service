package com.akempa.workouts.controller;

import com.akempa.workouts.model.WorkoutExercise;
import com.akempa.workouts.service.WorkoutExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "exercise")
@RequiredArgsConstructor
public class WorkoutExercisesController {

    private final WorkoutExerciseService workoutExerciseService;

    @GetMapping
    public List<WorkoutExercise> getExercises(){
        return workoutExerciseService.getExercises();
    }
}
