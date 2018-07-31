package com.sjsu.sanaz;

import java.util.Stack;

public class Main {



    public static void main(String[] args) {

        QueueViaStacks qvs = new QueueViaStacks();

        SortStack ss = new SortStack();

        Stack<Integer> res = new Stack<>();

        Stack<Integer> tobeSorted = new Stack<>();
        tobeSorted.push(3);
        tobeSorted.push(7);
        tobeSorted.push(1);
        tobeSorted.push(9);
        tobeSorted.push(2);

        res = ss.sortLargeOnTop(tobeSorted);
        System.out.println("Large on top");
        while(!res.isEmpty()){
            System.out.print(res.pop());
            System.out.print("**");
        }

        Stack<Integer> res1 = new Stack<>();

        Stack<Integer> tobeSorted1 = new Stack<>();
        tobeSorted1.push(3);
        tobeSorted1.push(7);
        tobeSorted1.push(1);
        tobeSorted1.push(9);
        tobeSorted1.push(2);
        res = ss.sortSmallOnTop(tobeSorted1);
        System.out.println();
       System.out.println("Small on top");
        while(!res.isEmpty()){
            System.out.print(res.pop());
            System.out.print("**");
        }

    }
}
