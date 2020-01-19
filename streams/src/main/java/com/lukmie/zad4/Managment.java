package com.lukmie.zad4;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Managment {

    public Set<Employee> met1() {
        return Employees.employees.stream()
                .collect(Collectors.toSet());
    }

    public long met2a() {
        return Employees.employees.stream()
                .count();
    }

    public long met2b() {
        return Employees.employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.counting());
    }

    public Optional<Integer> met3a() {
        return Employees.employees.stream()
                .map(Employee::getSalary)
                .reduce(Integer::sum);
    }

    public Optional<Integer> met3b() {
        return Employees.employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.reducing(Integer::sum));
    }
}
