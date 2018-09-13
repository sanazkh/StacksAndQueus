package com.sjsu.sanaz;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by sanazk on 9/12/18.
 */
public class StackOfPlates {
    int capacity;
    int threshold;
    ArrayList<ArrayList<Integer>> parrentStack;

    public StackOfPlates(){
        parrentStack = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        capacity = s1.size();
        parrentStack.add(s1);
        threshold = 10;
    }

    ArrayList<Integer> createNewStack(int capacity){
        if(capacity == threshold){
            ArrayList<Integer> newStack = new ArrayList<>();
            return newStack;
        }
        return null;
    }


    void push(int value){
        ArrayList<Integer> currentStack = parrentStack.get(parrentStack.size()-1);
        if(currentStack.size() != threshold){
            currentStack.add(value);
        }else{
            ArrayList<Integer> newStack = createNewStack(currentStack.size());
            newStack.add(value);
        }
    }

    int pop(){
        if(parrentStack.isEmpty()){
            return Integer.MAX_VALUE;
        }
        ArrayList<Integer> currentStack = parrentStack.get(parrentStack.size()-1);
        return currentStack.remove(currentStack.size()-1);
    }

    boolean isEmpty(){
        return parrentStack.size() == 0;
    }

    int popAtIndex(int index){
        if(index > parrentStack.size()){
            return Integer.MAX_VALUE;
        }else{
            ArrayList<Integer> cStack = parrentStack.get(index);
            if(!cStack.isEmpty()) {
                int returnValue = cStack.get(cStack.size() - 1);
                cStack.remove(cStack.size() - 1);
                return returnValue;
            }
        }
        return Integer.MAX_VALUE;
    }

}
