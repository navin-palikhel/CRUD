/**
 * has a direct link with service
 * act as a bridge between service and view
 * fetch data from view and sends data to view [front end page]
 */

package com.navin.crud.Operation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/index")
    public String listEmployee(Model model) {
        List<Employee> employeeList = employeeService.listAllEmployee();
        model.addAttribute("employees", employeeList);
        return "Table";
    }

    @GetMapping("/employee/new")
    public String getEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping("/employee/save")
    public String saveEmployee(Employee employee) {
        employeeService.save(employee);
        return "redirect:/index";
    }


    @GetMapping("/employee/update/{id}")
    public String getEditEmployee(@PathVariable("id") Long id, Model model) {
        Employee employee = employeeService.find(id);
        model.addAttribute("employee", employee);
        return "index";
    }

    @GetMapping("/employee/delete/{id}")
    public String getDeleteEmployee(@PathVariable("id") Long id) {
        employeeService.delete(id);
        return "redirect:/index";
    }

}
