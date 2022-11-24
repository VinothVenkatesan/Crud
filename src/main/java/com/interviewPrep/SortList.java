package com.interviewPrep;

import com.interviewPrep.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Joy","Vinu","India","London");

        List<Integer> intList = Arrays.asList(9,5,7,3,3,7,4);

        Map<Integer,Long> map = intList.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));

        List<Employee> ll = Arrays.asList(new Employee(1,"Ff",2000),
                                          new Employee(2,"rrr",3000),
                                          new Employee(3,"ggg",4000));
        Map<Integer,String> bb = ll.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));

        System.out.println(bb);

        List<Employee> nn = ll.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("List Sort===>"+nn);

        System.out.println(map);
String str = "Welcome To London";
String[] f = str.split(" ");
        List<String> p = Arrays.asList("Welcome To London");

        Map<String,Long> msp = p.stream().collect(Collectors.groupingBy(emp->emp,Collectors.counting()));
        System.out.println(msp);

        Map<Character,Long> pp = p.stream().flatMap(b->b.chars().mapToObj(d->(char) d)).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character, Long> charFrequency = p.stream() //Stream<String>
                .flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charFrequency);

        List<Integer> inn= intList.stream().sorted().collect(Collectors.toList());
        System.out.println(inn);


        List<String> sortedList = list.stream().filter(i->!i.isEmpty()).sorted().collect(Collectors.toList());

        List<String> listDuplicates = Arrays.asList("new","old","new","india");

       List<String> removedDuplicedList = listDuplicates.stream().filter(i->!i.isEmpty()).distinct().collect(Collectors.toList());
        System.out.println(removedDuplicedList);

        System.out.println(sortedList);
        Employee emp = new Employee(1,"vin",2000);

        Map<Integer,String> has = new HashMap<>();
        has.put(1,"Vi");
        has.put(2,"Mi");

        has.entrySet().stream().
                sorted(Comparator.comparing(i->i.getKey())).forEach(System.out::println);

        ll.stream().filter(i->i.getSalary()>=3000).map(i->i.getSalary()*2).forEach(System.out::println);

        has.entrySet().stream().filter(i->i.getKey() == 1).map(i->i.getKey()+2).forEach(System.out::println);
    }
}
