package com.oop9;

public class Dog {

    private  String name;
    private int age;
    private  double weight;

//    getter 만들기

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    //setter만들기

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("1이상에 숫자를 입력해주세요");
            return;
        }
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
