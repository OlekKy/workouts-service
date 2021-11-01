package com.akempa.workouts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class WorkoutExercise {

    @Id
    @SequenceGenerator(name = "exercise_sequence", sequenceName = "exercise_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exercise_sequence")
    private Long id;
    private Integer sessionNum;
    private String name;
    private Integer repetitionsNum;
    private Integer seriesNum;
    private Integer breakSeconds;
    private Long weight;
}
