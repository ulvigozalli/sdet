package com.university.entity;

public class Instructor extends Employee{
    private int deparmantId;
    private String deparmantName;

    public Instructor() {
        super();
    }

    public Instructor(int id, String notionalId, String name, String surname, String address, String phone,int deparmantId, String deparmantName) {
        super(id, notionalId, name, surname, address, phone);
        this.deparmantId = deparmantId;
        this.deparmantName = deparmantName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Instructor{" +
                "deparmantId=" + deparmantId +
                ", deparmantName='" + deparmantName + '\'' +
                '}';
    }

    public int getDeparmantId() {
        return deparmantId;
    }

    public void setDeparmantId(int deparmantId) {
        this.deparmantId = deparmantId;
    }

    public String getDeparmantName() {
        return deparmantName;
    }

    public void setDeparmantName(String deparmantName) {
        this.deparmantName = deparmantName;
    }
}
