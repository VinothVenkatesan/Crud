package com.crudexample.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamExampleTest {
    @Test
    public void test(){
        StreamExample e = new StreamExample();
        e.filterbyName();
        assertEquals("[Mithu, Divi]",e.filterbyName().toString());
    }

    @Test
    public void skiptest(){
        StreamExample f = new StreamExample();
        assertEquals(6,f.skipValues());
    }

    @Test
    public void testSum(){
        StreamExample g =new StreamExample();
        assertEquals(45,g.sumValues());
    }

}