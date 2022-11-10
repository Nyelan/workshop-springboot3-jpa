package com.leonardo.courseSpringUdemy.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.leonardo.courseSpringUdemy.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{

}
