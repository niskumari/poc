package com.example.EmployeePOC.Service.Implementation;

import com.example.EmployeePOC.Model.Employee;
//import com.example.EmployeePOC.Repository.EmployeeRepository;
import com.example.EmployeePOC.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public boolean save(Employee employee) {
        System.out.println("Name : "+employee.getFirstName()+"+ "+employee.getLastName());
        //employeeRepository.save(employee);
        return true;
    }
}
