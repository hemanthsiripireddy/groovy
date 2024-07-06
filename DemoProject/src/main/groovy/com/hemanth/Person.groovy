package com.hemanth

class Person {

    private String name;
    private Age age;

    Person(String name) {
        this.name = name
        age=new Age(25);
    }

    String getName() {
        return name
    }

    Age getAge() {
        return age
    }
}
