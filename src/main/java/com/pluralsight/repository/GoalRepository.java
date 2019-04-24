package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;

public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> findAll();
}
