package com.firstconnection.testproject.repository;

import com.firstconnection.testproject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}