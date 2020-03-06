package com.viktority.demo.second.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viktority.demo.second.entities.TestEntity2;

@Repository
public interface TestEntity2Repository extends JpaRepository<TestEntity2, Long> {

}
