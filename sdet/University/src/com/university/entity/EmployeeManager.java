package com.university.entity;

import com.university.impl.IEmployeeManager;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager implements IEmployeeManager {
    Scanner input = new Scanner(System.in);

    //Instructor i;
    ArrayList<Instructor> l1 = new ArrayList<>();
    @Override
    public void add() {
        /*Instructor instructor = new Instructor(1, "111111111111", "Ulvi", "Gözali", "Çanakkale", "555 555 55 55", 1, "IT");
        System.out.println(instructor.toString());*/

        Instructor instructor1 = new Instructor();
        System.out.println("Bir isim giriniz...");
        instructor1.setName(input.nextLine());


        System.out.println("Bir soyisim giriniz...");
        instructor1.setSurname(input.nextLine());

        System.out.println("Adresinizi giriniz..");
        instructor1.setAddress(input.nextLine());

        System.out.println("Departman adi giriniz..");
        instructor1.setDeparmantName(input.nextLine());

        this.l1.add(instructor1);
    }

    @Override
    public void remove() {

    }

    public void read(){
        //System.out.println(i.getName() +" "+ i.getSurname() +" " + i.getAddress() +" " +i.getDeparmantName());
        for(int i = 0;i<l1.size();i++){
            Instructor k = l1.get(i);
            System.out.println(k.getName()+" "+ k.getSurname() +" " + k.getAddress() +" " +k.getDeparmantName());;
        }

    }
}
