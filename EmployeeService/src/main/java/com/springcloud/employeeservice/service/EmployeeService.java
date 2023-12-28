package com.springcloud.employeeservice.service;

import com.springcloud.employeeservice.dto.APIResponseDto;
import com.springcloud.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long id);
}
