package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

/**
 * @deprecated se cambia a la implementación de springDataJpa en la interfaz
 * @author Alejandro.Cuervo
 *
 */
@Deprecated
@Repository("exerciseRepositoryImpl")
public class ExerciseRepositoryImpl {

	@PersistenceContext
	private EntityManager em;
	
	public Exercise saveModel(Exercise exercise) {
		em.persist(exercise);
		em.flush();
		return exercise;
	}


}
