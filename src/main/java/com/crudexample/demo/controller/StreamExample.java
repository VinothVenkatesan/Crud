package com.crudexample.demo.controller;

import com.interviewPrep.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {

    public List filterbyName() {
        List<String> list = Arrays.asList("Mithu", "Vinu", "Divi");
        List<String> result = list.stream().filter(name -> !name.equals("Vinu")).collect(Collectors.toList());
        return result;
    }

    public List skipValues(){
        List<Integer> lii = Arrays.asList(10,2,3,5,6);
       List<Integer> l = lii.stream().skip(2).filter(i->i>5).collect(Collectors.toList());
        return l;
    }

    public int sumValues(){
        List<Integer> o = Arrays.asList(1,2,3,4,5);
        int i1 = o.stream().mapToInt(i->i).sum();
        return i1;
    }



    public static void main(String[] args) {
       Employee e1 = new Employee(1,"Vin",10000);
        Employee e2 = new Employee(1,"Mithu",10000);
        List<Employee> m = Arrays.asList(e1,e2);
        Map<Object,List<Employee>> m1 = m.stream().collect(Collectors.groupingBy(employee->employee.getName()));
        System.out.println(m1);
    }
}
