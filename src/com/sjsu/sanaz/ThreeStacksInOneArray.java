package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/9/18.
 */
public class ThreeStacksInOneArray {

    int arraySize;
    int[] myArray;
    int stackCapacity;

    public ThreeStacksInOneArray(int size){
        arraySize = size;
        myArray = new int[arraySize];
        stackCapacity = size;
    }



    void push(int stackNumber){
        if(!isFull(stackNumber)){

        }
    }

    int pop(){
        return -1;
    }

    boolean isEmpty(int stackNumber){
        return true;
    }

    boolean isFull(int stackNumber){
        return true;
    }

    int indexOfTop(int stackNumber){
        if (stackNumber == 1){

        }else if(stackNumber == 2){

        }else if(stackNumber == 3){

        }

        return -1;
    }

    int peek(){
    return  -1;
    }
}
