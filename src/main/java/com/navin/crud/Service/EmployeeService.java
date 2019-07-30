/**
 * Does the Bussiness logic operations
 * has a direct link with repository
 * has a direct link with controller
 */


package com.navin.crud.Service;

import com.navin.crud.Entity.Employee;
import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    List<Employee> listAllEmployee();
    Employee find(long id);
    void delete(long id);
}
