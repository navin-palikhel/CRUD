package com.navin.crud.Service;

import com.navin.crud.Entity.Employee;
import com.navin.crud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        employee.setActive(Boolean.TRUE);
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> listAllEmployee() {

        return employeeRepository.findByIsActive(Boolean.TRUE);
    }

    @Override
    public Employee find(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    // Soft - DELETE
    @Override
    public void delete(long id) {
        employeeRepository.findById(id).ifPresent(employee -> {
            employee.setActive(false);
            employeeRepository.save(employee);
        });


        // Alternative - way
/*

        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent() ){
            Employee employee1
        }

*/
    }
   /*  Hard - DELETE*/
/*
    @Override
    public void delete(long id) {

        employeeRepository.deleteById(id);
    }
*/


}
