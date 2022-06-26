
package com.example.fitnessapp.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
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

	@OneToMany
	private List<Workout> workout;
	
	@NotEmpty
	@Column(name = "username", unique = true)
	private String username;
	
	@NotEmpty
	@Email
	@Column(name = "email", unique = true)
	private String email;
	
	@NotEmpty
	@Size(min = 6)
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role;
	
	@NotEmpty
	@Column(name = "first_name", table = "biometric")
	private String firstName;

	@NotEmpty
	@Column(name = "last_name", table = "biometric")
	private String lastName;

	@Column(name = "weight", table = "biometric")
	private Integer weight;

	@Column(name = "age", table = "biometric")
	private Integer age;
	
}