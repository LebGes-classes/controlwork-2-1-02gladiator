package com.conrolwork2;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class QueueTest {


    @Test
    public void get(){
        Queue<Integer> queue = new Queue<>(5);
        queue.add(5);
        queue.add(6);
        Assertions.assertEquals(5, queue.get());
    }


}
