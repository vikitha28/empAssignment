package com.zensar.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.zensar.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
