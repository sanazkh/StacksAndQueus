package com.sjsu.sanaz;

import java.util.Stack;

/**
 * Created by sanazk on 7/31/18.
 */
public class SortStack {

    //Small elements on top
    public Stack<Integer> sortSmallOnTop(Stack<Integer> myStack){
        Stack<Integer> finalStack = new Stack<>();
        while(!myStack.isEmpty()){
            int temp = myStack.pop();
            while (!finalStack.isEmpty() && temp > finalStack.peek()){

                myStack.push(finalStack.pop());
            }
            finalStack.push(temp);
        }

        return finalStack;
    }



    //Large elements on top

    public Stack<Integer> sortLargeOnTop(Stack<Integer> myStack){
        Stack<Integer> finalStack = new Stack<>();
        while(!myStack.isEmpty()){
            int temp = myStack.pop();
            while (!finalStack.isEmpty() && temp < finalStack.peek()){
                myStack.push(finalStack.pop());
            }
            finalStack.push(temp);
        }

        return finalStack;
    }
}
