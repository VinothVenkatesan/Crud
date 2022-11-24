package com.interviewPrep;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Vinu","Mithu","Divi");

        List<String> listEmpty = Arrays.asList("Vinu","Mithu","Divi"," ");

        long listCount = list.stream().filter(i->!i.isEmpty()).count();
        System.out.println(listCount);

        long lengthCount = list.stream().filter(i->i.length()>4).count();
        System.out.println(lengthCount);

        long startCount = list.stream().filter(i->i.startsWith("V")).count();
        System.out.println(startCount);

        List<String> removeEmpty = list.stream().filter(i->!i.isEmpty()).collect(Collectors.toList());
        System.out.println(removeEmpty);

        List<String> moretwochar = list.stream().filter(i->i.length()>2).collect(Collectors.toList());
        System.out.println(moretwochar);

        String uppercaseJoin = list.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(uppercaseJoin);

        List<Integer> listInt = Arrays.asList(1,2,3,4,5);

        List<Integer> squareInt = listInt.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println(squareInt);

       IntSummaryStatistics summaryStatistics = listInt.stream().mapToInt(i->i).summaryStatistics();
        System.out.println(summaryStatistics);
        System.out.println(summaryStatistics.getAverage());

        List<Employee> employeeList = Arrays.asList(new Employee(1,"Vinu",2),
                new Employee(2,"Divi",3));

        Map<String,Employee> listToMap = employeeList.stream().collect(Collectors.toMap(Employee::getName,b->b));
        System.out.println(listToMap);
    }
}
