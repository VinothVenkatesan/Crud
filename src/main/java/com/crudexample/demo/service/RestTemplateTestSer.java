package com.crudexample.demo.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class RestTemplateTestSer {
    private static final String GetAllEmp = "http://localhost:8081/RestTemplate/getEmployees";

    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getAllEmp() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<String> response = restTemplate.exchange(GetAllEmp, HttpMethod.GET, entity, String.class);
        return response;
    }


}
