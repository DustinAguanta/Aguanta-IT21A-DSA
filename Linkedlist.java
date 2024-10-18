
package com.mycompany.linkedlist;

import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
      
        LinkedList<Integer> numbers = new LinkedList<>();
                                                                                                                                                                                                                                                                 
        numbers.addFirst(4);
          numbers.addLast(5);
        numbers.add(6);
          numbers.add(1, 2);
        System.out.println("Linked List Original: " + numbers);
        System.out.println(numbers.size());
        boolean containslion = numbers.contains(2);
        System.out.println(containslion);
    }
    
}
