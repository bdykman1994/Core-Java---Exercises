package com.example.fitnessapp.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userinfo")
@SecondaryTable(name = "biometric", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_id"))
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private Long userId;


	@OneToMany(cascade = CascadeType.ALL)
	private List<Workout> workout;
	
	@Column(name = "username", unique = true)
	private String username;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "first_name", table = "biometric")
	private String firstName;

	@Column(name = "last_name", table = "biometric")
	private String lastName;

	@Column(name = "height", table = "biometric")
	private Integer height;

	@Column(name = "weight", table = "biometric")
	private Integer weight;

	@Column(name = "age", table = "biometric")
	private Integer age;
	
}
