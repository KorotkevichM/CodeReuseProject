package by.itstep.Korotkevich.javalessons.lesson22.model.entity;

public class Human {
    private String name;
    private int age;

    private boolean alive;

    public Human() {
    }

    public Human(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getInfo(){
        return name + ": age = " + age
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
