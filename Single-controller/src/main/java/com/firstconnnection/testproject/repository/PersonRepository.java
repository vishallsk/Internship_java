package com.firstconnnection.testproject.repository;

import com.firstconnnection.testproject.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

