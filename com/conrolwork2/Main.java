package com.conrolwork2;

import java.util.Random;

public class Main {


    
//    Особенность очереди: первый зашел, перый вешел



    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(5);
        Random random = new Random();
        for(int i = 0; i < queue.getSIZE(); i++){
            queue.add(random.nextInt(10));

        }

        queue.print();

        queue.delete();
        queue.print();
        queue.delete();
        queue.print();
        queue.delete();
        queue.print();
        queue.delete();
        queue.print();
        queue.delete();
        queue.print();
    }
}
