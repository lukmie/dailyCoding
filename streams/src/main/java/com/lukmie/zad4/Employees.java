package com.lukmie.zad4;

import java.util.Arrays;
import java.util.List;

import static com.lukmie.zad4.Gender.F;
import static com.lukmie.zad4.Gender.M;

public class Employees {

    public final static Employee TOMEK = new Employee("TOMEK", M, Departments.ACCOUNTANCY, 3000);
    public final static Employee ZOSIA = new Employee("ZOSIA", F, Departments.ACCOUNTANCY, 3500);
    public final static Employee JANEK = new Employee("JANEK", M, Departments.IT, 8000);
    public final static Employee ANNA = new Employee("ANNA", F, Departments.IT, 12000);
    public final static Employee KUBA = new Employee("KUBA", M, Departments.IT, 4000);
    public final static Employee MONIKA = new Employee("MONIKA", F, Departments.HR, 5000);

    public final static List<Employee> employees = Arrays.asList(TOMEK, ZOSIA, JANEK, ANNA, KUBA, MONIKA);

}
