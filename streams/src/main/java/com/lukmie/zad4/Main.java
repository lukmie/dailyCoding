package com.lukmie.zad4;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Managment managment = new Managment();
        Set<Employee> employees = managment.met1();
        employees.forEach(System.out::println);

        System.out.println(managment.met2a());
        managment.met3a().ifPresent(System.out::println);
        System.out.println(managment.met3b());
    }
}
