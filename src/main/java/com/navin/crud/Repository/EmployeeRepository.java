/**
 * Connection is made with database
 */

package com.navin.crud.Repository;

import com.navin.crud.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByIsActive(Boolean active);

}
