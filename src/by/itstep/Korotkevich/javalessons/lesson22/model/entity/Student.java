package by.itstep.Korotkevich.javalessons.lesson22.model.entity;

public class Student extends Human{
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;
    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 65;


    private double mark = 4;


    public Student() {
        super();

        System.out.println("student default constr");

        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    public Student(String name, int age, double mark, boolean alive) {
        super(name, age, alive);
        System.out.println("student full constructor");

//        setName(name);
//        setAge(age);
//        setAlive(alive);

//        this.name = name;
//        this.age = age;
        this.mark = mark;
//        this.alive = alive;
    }


    public Student(Student student) {
        super();

        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }


//    public void setAge(int age) {
//        if(age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE){
//        this.age = age;
//        }
//    }

    public double getMark() {
        return mark;
    }

        public void setMark(double mark){
        if (mark >= MIN_MARK && mark <= MAX_MARK){
            this.mark = mark;
        }
    }



    public String getInfo() {

//        return getName() + ": age " + getAge()
//                + ", mark = " + mark
//                + ", is alive = " + (isAlive() ? "yes" : "no");

//        return "Student - "
//                + name + ": age " + age
//                + ", is alive = " + (alive ? "yes" : "no")
//
//                + ", mark = " + mark;

        return "Student - " + super.getInfo()
                + ", mark = " + mark;

    }
}






