package by.itstep.Korotkevich.javalessons.lesson22.controller;

import by.itstep.Korotkevich.javalessons.lesson22.model.entity.Loafer;
import by.itstep.Korotkevich.javalessons.lesson22.model.entity.Student;
import by.itstep.Korotkevich.javalessons.lesson22.model.entity.Worker;

public class Task03 {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.getAge(20);
//        human.isAlive(true);
//        human.getName("Alex");

        Student student = new Student("Alex", 20, 10, true);
        Worker worker = new Worker("Peter", 25, 3000, true);
        Loafer loafer = new Loafer("Nikolay", 40, 2, true);

//        System.out.println(student.getInfo());
//        System.out.println(worker.getInfo());
//        System.out.println(loafer.getInfo());

    }
}
