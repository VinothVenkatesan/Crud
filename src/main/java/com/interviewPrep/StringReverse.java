package com.interviewPrep;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringReverse {
    //public static void main(String[] args) {
    public String reve() {
        String str = "Welcome to London";
        String[] words = str.split(" ");
        List<String> list = Arrays.asList(words);
        Collections.reverse(list);
        for (String word : list) {
            System.out.print(word + " ");
        }
        return str;
    }

    public Map<String, List<Employee>> groupByJobTitle() {

        Employee e1 = new Employee(1,"Vin",10000);
        Employee e2= new Employee(2,"fff",10000);
        Employee e3 = new Employee(3,"ggg",5000);
        List<Employee> lii = Arrays.asList(e1,e2,e3);

       double a = lii.stream().mapToDouble(employee-> employee.getSalary()).average().getAsDouble();
        System.out.println(a);

        List<Employee> p = lii.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("HHHH"+p);

        Map<Double,List<Employee>> k = lii.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(k);

        return lii.stream()
                .collect(Collectors.groupingBy(Employee::getName));
    }

    public static void main(String[] args) {
        int a[] = {2,4, 7,9,1,4,2};
        List<Integer> li = Arrays.asList(2,4,7,9,1,4,2);
        li.stream().sorted().forEach(System.out::println);
        System.out.println("-------------------");
        li.stream().filter(i->i%2!=0).mapToInt(i->i).distinct().forEach(System.out::println);



    }
}
//791
