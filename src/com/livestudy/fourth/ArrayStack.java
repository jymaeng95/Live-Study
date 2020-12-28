package com.livestudy.fourth;

public class ArrayStack implements Stack {
    public int[] stack;
    int top;

    public ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }

    @Override
    public void push(int data) {
        stack[++top] = data;
    }

    @Override
    public int pop() {
        if(top == -1){
            System.out.println("Empty");
            return top;
        }
        return stack[top--];
    }
}
