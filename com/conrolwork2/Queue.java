package com.conrolwork2;


public class Queue<T> {

    private Object[] queue;
    private int SIZE, first, last;


    Queue(int size) {
        this.SIZE = size;
        queue = new Object[SIZE];
        first = -1;
        last = -1;

    }

    private boolean isFull() {
        if (first == 0 && last == SIZE) {
            return true;
        }
        return false;

    }

    private boolean isEmpty() {
        if (first == -1) {
            return true;
        }else {
            return false;
        }
    }

    public void add(T elem) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (first == -1) {
                first = 0;
            }
            last = (last + 1) % SIZE;
            queue[last] = elem;
            System.out.println(elem + " is added");
        }
    }

    public T get() {
        return (T) queue[first];
    }

    public int getSIZE(){
        return this.SIZE;
    }


    public void delete() {
        Object elem;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            elem  = queue[first];
            if (first == last) {
                first = -1;
                last = -1;
            } else {
                first = (first + 1) % SIZE;
            }
            System.out.println("Elem " + elem + " is deleted");
            System.out.println();
        }

    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println();
            System.out.println("First elem " + queue[first]);
            System.out.println("Last elem " + queue[last]);
            System.out.println();
            System.out.println("Elements: ");
            for (Object o : queue){
                System.out.print(o + " ");
            }
            System.out.println();


        }
    }



}