package com.max.spring.springboot.spring_data_rest.dao;

import com.max.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ZuevMYu
 * @since 17.07.2024
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
