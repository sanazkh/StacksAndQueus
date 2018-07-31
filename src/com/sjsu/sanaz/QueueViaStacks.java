package com.sjsu.sanaz;

import java.util.Stack;

/**
 * Created by sanazk on 7/30/18.
 */

//Approach one
public class QueueViaStacks {

    Stack<Integer> values = new Stack<>();
    Stack<Integer> temps = new Stack<>();

    public void add(int item){
        if(!values.isEmpty()){
            while(!values.isEmpty()){
                temps.push(values.pop());
            }
            values.push(item);
            while (!temps.isEmpty()){
                values.push(temps.pop());
            }
        }else{
            values.push(item);
        }
    }

    public int remove(){
        if(!values.isEmpty()){
            return values.pop();
        }else{
            return -1;
        }
    }

    public int peek(){
        if(!values.isEmpty()){
            return values.peek();
        }else{
            return -1;
        }
    }

    public boolean empty(){
        return values.isEmpty();
    }

    //Approach two
    /*
    We define two stacks, stackOldest and StackNewest. In this way, we push to the newest stack and remove from the oldest stack.
    peek will also be the top element of oldest stack after making sure stack oldest has the latest elements.
     */

    public class MyQueue{
        Stack<Integer> newestStack;
        Stack<Integer> oldestStack;

        public MyQueue(){
            newestStack = new Stack<>();
            oldestStack = new Stack<>();
        }

        public int size(){
            return newestStack.size() + oldestStack.size();
        }
        public void add(int item){
            newestStack.push(item);
        }

        public void ShiftStack(){
            if(oldestStack.isEmpty()){
                while(!newestStack.isEmpty()){
                    oldestStack.push(newestStack.pop());
                }
            }
        }

        public int peek(){
            ShiftStack();
            return oldestStack.peek();
        }

        public int remove(){
            ShiftStack();
            return oldestStack.pop();
        }
    }

}


