package by.itstep.Korotkevich.javalessons.lesson22.controller;

import by.itstep.Korotkevich.javalessons.lesson22.model.entity.Student;

public class Task05 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 10, true);
        System.out.println(student.getInfo());

        student.setMark(9);
        System.out.println(student.getInfo());
    }
}
