package com.lukmie.zad4;

import java.util.Set;
import java.util.stream.Collectors;

public class Managment {

    public Set<Employee> met1() {
        return Employees.employees.stream()
                .collect(Collectors.toSet());
    }

    public long met2() {
        return Employees.employees.stream()
                .count();
    }
}
