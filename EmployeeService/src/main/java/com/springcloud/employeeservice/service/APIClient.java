package com.springcloud.employeeservice.service;

import com.springcloud.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8090", value = "DEPARTMENT-SERVICE")
//public interface APIClient {
//    @GetMapping("api/departments/{departmentCode}")
//    DepartmentDto getDepartment(@PathVariable("departmentCode") String code);
//}

//here we dont need to create an implementation openfeign will dynamically create and call the department api


//the below configs is for load balancing purposes if we create multiple instances of the ms
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {
    @GetMapping("api/departments/{departmentCode}")
    DepartmentDto getDepartment(@PathVariable("departmentCode") String code);
}