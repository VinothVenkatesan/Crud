package com.interviewPrep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMapSortTest {

    @Test
    public void testList(){
        EmployeeMapSort e = new EmployeeMapSort();
        //e.employeeList();
        //assertEquals("[Employee(id=1, name=a, salary=100.0)]",e.employeeList().toString());
    }

    @Test
    public void testMap(){
        EmployeeMapSort ee = new EmployeeMapSort();
        //ee.mapSort();
    }

    @Test
    public void testSort(){
        EmployeeMapSort f = new EmployeeMapSort();
        f.sortList();
    }

}