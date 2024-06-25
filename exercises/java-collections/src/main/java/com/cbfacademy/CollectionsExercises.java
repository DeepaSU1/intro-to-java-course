package com.cbfacademy;

import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashMap;


public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(2);
        list.add(2, 4);
        System.out.println(list.element());
        return list;

        
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        System.out.print(stack.firstElement());
        System.out.print(stack.peek());
        System.out.print(stack.pop());
        stack.push(4);
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);

        System.out.print(arrayDeque.getFirst());
        System.out.print(arrayDeque.getLast());
        System.out.print(arrayDeque.poll());
        System.out.print(arrayDeque.element());
        return arrayDeque;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");
        
        Set<Integer> keys = map.keySet();
        System.out.print(keys);

       
        System.out.print(map.values());

        boolean containsEnglish = map.containsValue("English");
        System.out.print(containsEnglish);

        return map;

    }

    public String getName() {
        return "Collections Exercises";
    }
}
