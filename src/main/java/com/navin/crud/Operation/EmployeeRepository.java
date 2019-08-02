/**
 * Connection is made with database
 */

package com.navin.crud.Operation;

import com.navin.crud.Operation.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByIsActive(Boolean active);

}
