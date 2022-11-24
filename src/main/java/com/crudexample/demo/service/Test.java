package com.crudexample.demo.service;

import com.crudexample.demo.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(1,"name",101,1000);

        List<Product> list = new ArrayList<>();

        list.add(p1);
        for (Product p2: list) {
            System.out.println(p2);
        }
        System.out.println(list);
    }
}
