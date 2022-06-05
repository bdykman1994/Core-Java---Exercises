package com.example.fitnessapp.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userinfo")
public class UserEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_userid_id", referencedColumnName="user_id")
	private List<WorkoutEntity> workoutEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_bio_id" )
	private BiometricsEntity biometricsEntity;
}
