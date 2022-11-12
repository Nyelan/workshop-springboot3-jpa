package com.leonardo.courseSpringUdemy.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.leonardo.courseSpringUdemy.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long>{

}
