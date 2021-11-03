package com.akempa.workouts.controller;

import com.akempa.workouts.model.WorkoutExercise;
import com.akempa.workouts.service.WorkoutExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void addNewExercise(@RequestBody WorkoutExercise workoutExercise){
        workoutExerciseService.addNewExercise(workoutExercise);
    }

    @DeleteMapping(path = "{exerciseId}")
    public void deleteExercise(@PathVariable("exerciseId") Long id){
        workoutExerciseService.deleteExercise(id);
    }
}
