package com.leonardo.courseSpringUdemy.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.leonardo.courseSpringUdemy.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long>{

}
