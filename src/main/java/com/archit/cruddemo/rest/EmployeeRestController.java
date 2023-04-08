package com.archit.cruddemo.rest;

import com.archit.cruddemo.entity.Employee;
import com.archit.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    // inject employee dao
    @Autowired
    private EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    // expose "/employee" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

//    @GetMapping("/employees/{employeeId}")
//    public Employee findById(int employeeId){
//        return employeeService.findById(employeeId);
//    }
//
//    @GetMapping("/employees/save")
//    public Employee save(Employee theEmployee){
//        return employeeService.save(theEmployee);
//    }
//
//    @GetMapping("/employees/{employeeId}")
//    public void deleteById(int employeeId){
//        employeeService.deleteById(employeeId);
//    }
}
