package com.viktority.demo.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viktority.demo.first.entities.TestEntity1;

@Repository
public interface TestEntity1Repository extends JpaRepository<TestEntity1, Long> {

}
