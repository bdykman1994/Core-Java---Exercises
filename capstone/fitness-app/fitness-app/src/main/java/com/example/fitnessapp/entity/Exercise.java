package com.example.fitnessapp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exercise")

public class Exercise implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long exerciseid;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)	
	@JoinColumn(name ="exercise_type_id")
	private ExerciseType exerciseType; 
	
	@Column(name = "sets")
	private Long sets;
	
	@Column(name = "reps")
	private Long reps;
	
	@Column(name = "distance")
	private Integer distance;
	
	@Column(name = "time")
	private Integer time;

	@ManyToOne
	@JoinColumn(name ="excersie_id")
	private Workouts workouts;
}
