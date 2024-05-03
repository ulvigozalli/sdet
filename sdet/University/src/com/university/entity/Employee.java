package com.university.entity;

public class Employee {
    private int id;
    private String notionalId;
    private String name;
    private String surname;
    private String address;
    private String phone;

    public Employee() {

    }

    public Employee(int id, String notionalId, String name, String surname, String address, String phone) {
        this.id = id;
        this.notionalId = notionalId;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", notionalId='" + notionalId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotionalId() {
        return notionalId;
    }

    public void setNotionalId(String notionalId) {
        this.notionalId = notionalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
