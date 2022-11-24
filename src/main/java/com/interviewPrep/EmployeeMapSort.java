package com.interviewPrep;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMapSort {

    public List<Employee> employeeList(){
        List<Employee> l = new ArrayList<>();
        Employee e1 = new Employee(1,"a",100);
        l.add(e1);
        l.stream().filter(employee -> employee.getName().equals("a")).collect(Collectors.toList()).forEach(System.out::println);
//        for (Employee e: l) {
//            System.out.println(e);
//            //System.out.println("Ennnd");
//        }
        return l;
    }

    public Map<String,Employee> mapSort(){
        Map<String,Employee> map = new HashMap<>();
        map.put("Mithu",new Employee(1,"Mithu",1000));
        map.put("Vinu",new Employee(2,"Vinu",2000));

        List<Map.Entry<String,Employee>> list = new ArrayList<>(map.entrySet());
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        return map;
    }

    public List<Integer> sortList(){
        List<Integer> list = Arrays.asList(3,5,2,4,6,1,8);
        list.stream().sorted().forEach(System.out::println);
        return list;
    }

//    public static void main(String args[]){
//
//
//        Map<String,Employee> map = new HashMap<>();
//        map.put("Mithu",new Employee(1,"Mithu",1000));
//        map.put("Vinu",new Employee(2,"Vinu",2000));
//
//        List<Map.Entry<String,Employee>> list = new ArrayList<>(map.entrySet());
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
//        List<Integer> list1 = Arrays.asList(5,2,1,4,6,6);
//
//       list1.stream().map(i->i*i).distinct().collect(Collectors.toList()).forEach(System.out::println);
//        System.out.println("*******");
//
//        //list1.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
//
//       //list1.stream().filter(i->i%2==0).forEach(System.out::println);
//
//        int cou = (int) list1.stream().count();
//        System.out.println(cou);
//
//        int co = (int) list1.stream().filter(i->i>=2).count();
//        System.out.println(co);
//
//        List<String> lit = Arrays.asList("India","USA","UK");
//
//        lit.stream().map(i->i.toLowerCase()).collect(Collectors.toList()).forEach(System.out::println);
//
//    }
}
