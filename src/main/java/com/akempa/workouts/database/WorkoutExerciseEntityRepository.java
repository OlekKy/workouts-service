package com.akempa.workouts.database;

import com.akempa.workouts.model.WorkoutExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkoutExerciseEntityRepository extends JpaRepository<WorkoutExercise, Long> {

    @Query("SELECT s FROM WorkoutExercise s WHERE s.name = ?1 and s.sessionNum = ?2")
    Optional<WorkoutExercise> findExerciseByNameAndSession(String name, Integer sessionNum);
}
