package com.endava.task.first;

import java.time.LocalDateTime;

public class Elephant {

    private String name;
    private int kgOfFood;
    private float height;
    private double weight;
    private char gender;
    private LocalDateTime birthDate;
    private boolean vipLevel;

    public Elephant(String name, int kgOfFood, float height, double weight, char gender, LocalDateTime birthDate, boolean vipLevel) {
        this.name = name;
        this.kgOfFood = kgOfFood;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.birthDate = birthDate;
        this.vipLevel = vipLevel;
    }

    public Elephant(String name, boolean vipLevel) {
        this.name = name;
        this.vipLevel = vipLevel;
    }

    public Elephant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKgOfFood() {
        return kgOfFood;
    }

    public void setKgOfFood(int kgOfFood) {
        this.kgOfFood = kgOfFood;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(boolean vipLevel) {
        this.vipLevel = vipLevel;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", kgOfFood=" + kgOfFood +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", vipLevel=" + vipLevel +
                '}';
    }
}