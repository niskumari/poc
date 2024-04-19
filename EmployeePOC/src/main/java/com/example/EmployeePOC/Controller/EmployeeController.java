package com.example.EmployeePOC.Controller;

import com.example.EmployeePOC.Model.Employee;
import com.example.EmployeePOC.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class EmployeeController {
@Autowired
    EmployeeService employeeService;
    public boolean saveEmployee(Employee employee){
        return employeeService.save(employee);
    }
}
