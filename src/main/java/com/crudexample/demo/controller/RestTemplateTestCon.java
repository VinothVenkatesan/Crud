package com.crudexample.demo.controller;

import com.crudexample.demo.service.RestTemplateTestSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RestTemplate")
public class RestTemplateTestCon {
    @Autowired
    private RestTemplateTestSer restTemplateTestSer;

    @GetMapping("/getAllEmp")
    public ResponseEntity<String> getAllEmp() {
        return restTemplateTestSer.getAllEmp();

    }


}
