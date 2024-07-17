package com.jaydoshi.newProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaydoshi.newProj.model.Employee;

// JPA repo exposes useful methods like save, findByID, deleteById etc.
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
