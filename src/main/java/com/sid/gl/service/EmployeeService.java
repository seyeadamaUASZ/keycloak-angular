package com.sid.gl.service;

import com.sid.gl.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    void deleteById(Long id);
}
