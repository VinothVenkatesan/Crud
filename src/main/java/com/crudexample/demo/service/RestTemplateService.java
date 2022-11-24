package com.crudexample.demo.service;

import com.crudexample.demo.entity.Product;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class RestTemplateService {

    RestTemplate restTemplate = new RestTemplate();
    private static final String Get_All_URL = "http://localhost:8081/products";
    private static final String Create_EMP_URL = "http://localhost:8081/addProduct";
    private static final String Get_EmpById_URL = "http://localhost:8081/productById/{id}";
    private static final String Update_Employee_URL = "http://localhost:8081/update";
    private static final String Delete_Employee_URL = "http://localhost:8081/delete/{employeeId}";

    public ResponseEntity<String> allEmployees() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(Get_All_URL, HttpMethod.GET, entity, String.class);

        return response;
    }

    public ResponseEntity<Product> createEmployee(Product product) {
        return restTemplate.postForEntity(Create_EMP_URL, product, Product.class);
    }

    public Product getEmployeeById(int id) {
        Map<String, Integer> map = new HashMap<>();
        map.put("id", id);
        return restTemplate.getForObject(Get_EmpById_URL, Product.class, map);
    }

    public void updateEmployee(Product product) {
        restTemplate.put(Update_Employee_URL, product);
    }

    public void deleteEmployee(int id) {
        Map<String, Integer> param = new HashMap<>();
        param.put("employeeId", id);
        restTemplate.delete(Delete_Employee_URL, param);
    }
}
