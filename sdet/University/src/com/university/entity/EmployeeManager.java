package com.university.entity;

import com.university.impl.IEmployeeManager;

import java.util.Scanner;

public class EmployeeManager implements IEmployeeManager {
    Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        /*Instructor instructor = new Instructor(1, "111111111111", "Ulvi", "Gözali", "Çanakkale", "555 555 55 55", 1, "IT");
        System.out.println(instructor.toString());*/

        System.out.println("Bir isim giriniz...");
        Instructor instructor1 = new Instructor();
        instructor1.setName(input.nextLine());


    }

    @Override
    public void remove() {

    }

}
