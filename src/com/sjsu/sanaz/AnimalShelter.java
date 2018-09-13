package com.sjsu.sanaz;

import java.util.LinkedList;

/**
 * Created by sanazk on 9/12/18.
 */
public class AnimalShelter {

    abstract class Animal{
        protected String name;
        private int order;
        public Animal(String name){
            this.name = name;
        }

        public int getOrder(){
            return order;
        }
        public void setOrder(int order){
            this.order = order;
        }


        public boolean isOlder(Animal a){
            return this.order < a.order;
        }
    }

    class AnimalQueue{
        LinkedList<Dog> dog = new LinkedList<>();
        LinkedList<Cat> cat = new LinkedList<>();

        public void enqueue(Animal a){
            a.setOrder(a.order);
            a.order++;

            if(a instanceof Dog){
                dog.addLast((Dog) a);
            }else{
                cat.addLast((Cat) a);
            }
        }

        public Animal dequeueAny(){
            if(dog.size() == 0){
                return dequeueCat();
            }
            if(cat.size() == 0){
                return dequeueDog();
            }

            Dog dog1 = dog.peek();
            Cat cat1 = cat.peek();

            if(dog1.isOlder(cat1)){
                return dequeueDog();
            }else{
                return dequeueCat();
            }
        }

        public Dog dequeueDog(){
            return dog.poll();
        }

        public Cat dequeueCat(){
            return cat.poll();
            
        }
    }
    public class Dog extends Animal{
        public Dog(String name){
            super(name);
        }
    }

    public class Cat extends Animal{
        public Cat(String name){
            super(name);
        }
    }



}
