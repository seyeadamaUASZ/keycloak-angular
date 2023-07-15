package com.sid.gl.service;

import com.sid.gl.model.Employee;
import com.sid.gl.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id)
    {
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteById(Long id)
    {
        employeeRepository.deleteById(id);
    }
}
