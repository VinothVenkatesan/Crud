package com.crudexample.demo.controller;

import com.crudexample.demo.entity.Product;
import com.crudexample.demo.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/RestTemplate")
public class RestTemplateController {

    @Autowired
    private RestTemplateService restTemplateService;

    @GetMapping("/getEmployees")
    public ResponseEntity<String> getAllEmployees() {
        return restTemplateService.allEmployees();
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Product> createEmployee(@RequestBody Product product) {
        return restTemplateService.createEmployee(product);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Product getEmployeeById(@PathVariable int id) {
        return restTemplateService.getEmployeeById(id);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Product product) {
        restTemplateService.updateEmployee(product);
        return "Product updated Successfully";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        restTemplateService.deleteEmployee(id);
        return "Product Deleted Successfully";
    }
}
