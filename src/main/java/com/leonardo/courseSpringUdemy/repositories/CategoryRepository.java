package com.leonardo.courseSpringUdemy.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.leonardo.courseSpringUdemy.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long>{

}
