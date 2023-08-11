package com.pppp0722.designpattern.builder;

public class Student {

    private final String id;
    private final String name;
    private final int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {

        private String id;
        private String name;
        private int age;

        public Student build() {
            return new Student(id, name, age);
        }

        public StudentBuilder id(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}
