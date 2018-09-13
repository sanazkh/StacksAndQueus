package com.sjsu.sanaz;

import java.util.ArrayList;

/**
 * Created by sanazk on 9/12/18.
 */
public class StackImplementation {
    int size;
    ArrayList<Integer> myStack;
    int top;

    public StackImplementation(){
        myStack = new ArrayList<>();
        this.size = myStack.size();
        top = Integer.MAX_VALUE;
    }

    boolean isEmpty(){
        return myStack.size() == 0;
    }

    void push(int value){
        myStack.add(value);
        size++;
        top = value;
    }

    int pop(){
        if(myStack.isEmpty()){
            return Integer.MAX_VALUE;
        }

        int returnValue = myStack.get(myStack.size()-1);
        myStack.remove(myStack.size()-1);
        size = myStack.size();
        if(size != 0){
            top = myStack.get(myStack.size()-1);
        }else{
            top = Integer.MAX_VALUE;
        }

        return returnValue;
    }

    int peek(){
        if(myStack.isEmpty()){
            return Integer.MAX_VALUE;
        }
        int returnValue = myStack.get(myStack.size()-1);
        return returnValue;
    }

}
