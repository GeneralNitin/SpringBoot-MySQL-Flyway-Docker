package com.generalnitin.springdockercompose.repository;

import com.generalnitin.springdockercompose.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<Entity, Long> {

}
