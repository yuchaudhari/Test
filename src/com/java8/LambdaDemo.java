package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
       // arrL.forEach(n -> System.out.println(n)); 
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
       List<Integer> d = stream.filter(i -> i%2 != 0).collect(Collectors.toList());
       System.out.println(d.toString());
       Stream<String> s = Stream.of("ram","pam","qsa","ved","rahul");
       List<String> q = s.filter(i -> i.startsWith("r")).collect(Collectors.toList());
       System.out.println(q.toString());
       Stream<Integer> g = list.stream();
       long count = g.filter(i -> i%2 != 0).count();
       System.out.println(count);
        System.out.println("-----------------------------");
        		Object o = new Object();
        // Using lambda expression to print even elements 
        // of arrL 
      //  arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
        
        ArrayList<Employee> empList = new ArrayList<Employee>(); 
        empList.add(new Employee(1, "one"));
        empList.add(new Employee(2, "two"));
        empList.add(new Employee(3, "three"));
        empList.add(new Employee(4, "four"));
        empList.forEach(n -> System.out.println(n));
        empList.forEach(n -> System.out.println(n.getId()));
        empList.forEach(n -> { if (n.getId()%2 == 0) System.out.println(n); }); 

	}

}
