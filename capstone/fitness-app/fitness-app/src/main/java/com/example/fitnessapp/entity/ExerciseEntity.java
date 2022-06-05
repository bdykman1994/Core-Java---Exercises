package com.example.fitnessapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

public class ExerciseEntity implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exercise_id")
	private Long exerciseId;
	
	@OneToOne
	@JoinColumn(name = "fk_exercise_type_id")
	private ExerciseTypeEntity exerciseTypeEntity; 
	
	@Column(name = "sets")
	private Long sets;
	
	@Column(name = "reps")
	private Long reps;
	
	@Column(name = "distance")
	private Integer distance;
	
	@Column(name = "time")
	private Integer time;


}
