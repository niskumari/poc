package com.example.EmployeePOC.Api;

import com.example.EmployeePOC.Controller.EmployeeController;
import com.example.EmployeePOC.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeApi {
    @Autowired
    EmployeeController employeeController;
@PostMapping("/saveEmployee")
   public Boolean saveEmployee(@RequestBody(required = true) Employee employee){
    return employeeController.saveEmployee(employee);
}
}
