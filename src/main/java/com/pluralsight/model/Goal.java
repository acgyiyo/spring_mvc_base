package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "goals")
public class Goal {

	@Id
	@GeneratedValue
	@Column(name = "GOAL_ID")
	private Long id;

	@Range(min = 1, max = 120)
	@Column(name = "MINUTES")
	private int minutes;
	
	@OneToMany
	private List<Exercise> exercises = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
