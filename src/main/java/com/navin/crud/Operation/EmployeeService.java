/**
 * Does the Bussiness logic operations
 * has a direct link with repository
 * has a direct link with controller
 */


package com.navin.crud.Operation;

import com.navin.crud.Operation.Employee;
import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);
    List<Employee> listAllEmployee();
    Employee find(long id);
    void delete(long id);
}
