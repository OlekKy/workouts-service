package com.akempa.workouts.config;

import com.akempa.workouts.database.WorkoutExerciseEntityRepository;
import com.akempa.workouts.model.WorkoutExercise;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class WorkoutExerciseConfig {

    @Bean
    CommandLineRunner commandLineRunner(WorkoutExerciseEntityRepository workoutExerciseEntityRepository){
        return args -> {
            WorkoutExercise workoutExercise0 = WorkoutExercise.builder()
                    .sessionNum(1)
                    .name("Bench press")
                    .repetitionsNum(10)
                    .seriesNum(4)
                    .breakSeconds(130)
                    .weight(30L)
                    .build();

            WorkoutExercise workoutExercise1 = WorkoutExercise.builder()
                    .sessionNum(1)
                    .name("Front raise")
                    .repetitionsNum(12)
                    .seriesNum(3)
                    .breakSeconds(150)
                    .weight(32L)
                    .build();

            WorkoutExercise workoutExercise2 = WorkoutExercise.builder()
                    .sessionNum(1)
                    .name("Lateral raise")
                    .repetitionsNum(6)
                    .seriesNum(5)
                    .breakSeconds(140)
                    .weight(33L)
                    .build();

            workoutExerciseEntityRepository.saveAll(List.of(workoutExercise0, workoutExercise1, workoutExercise2));
        };
    }
}
