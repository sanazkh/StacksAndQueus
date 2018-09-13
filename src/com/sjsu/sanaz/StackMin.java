package com.sjsu.sanaz;

import java.util.Stack;

/**
 * Created by sanazk on 9/12/18.
 */
public class StackMin extends Stack<Integer> {

    Stack<Integer> minStack;

    public StackMin(){
        minStack = new Stack<>();
    }

    public Integer pop(){
        int returnValue = super.pop();
        if(returnValue == min()){
            minStack.pop();
        }
        return returnValue;
    }

    void push(int value){
        super.push(value);
        if(value <= min()){
            minStack.push(value);
        }
    }

    int min(){
        if(minStack.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return minStack.peek();
        }
    }
}
