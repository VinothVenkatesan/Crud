package com.interviewPrep;
import java.util.*;

public class MapSort {

    public static void main(String[] args) {
        Map<String,String> hashmap = new HashMap<>();
        hashmap.put("Vinu","Mithu");
        hashmap.put("Bala","Cat");
        hashmap.put("Mithu","Apple");

        List<Map.Entry<String,String>> entries = new ArrayList<>(hashmap.entrySet());

        hashmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


        System.out.println("*********************************");

        List<Map.Entry<String,String>> lsit = new ArrayList<>(hashmap.entrySet());
        //Collections.sort(lsit,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        List<Employee> input = new ArrayList<>(Arrays.asList(
                new Employee(1, "SW Station", 3),
                new Employee(2, "Clovis", 4),
                new Employee(3, "SW Station", 5),
                new Employee(1, "Mayfair", 10),
                new Employee(3, "Mayfair", 20),
                new Employee(2, "DT Fresno", 25)));
    }
}
