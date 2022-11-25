package com.leonardo.courseSpringUdemy.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.leonardo.courseSpringUdemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, Long>{

}
