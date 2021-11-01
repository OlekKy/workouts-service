package com.akempa.workouts.database;

import com.akempa.workouts.model.WorkoutExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutExerciseEntityRepository extends JpaRepository<WorkoutExercise, Long> {
}
