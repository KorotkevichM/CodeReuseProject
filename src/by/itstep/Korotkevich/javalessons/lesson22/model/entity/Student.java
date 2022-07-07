package by.itstep.Korotkevich.javalessons.lesson22.model.entity;

public class Student extends Human{

    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 65;


    private MarkNote note;


    public Student() {
        super();

//        System.out.println("student default constr");

        name = "no name";
        age = 16;
        note = new MarkNote();
        alive = true;
    }

    public Student(String name, int age, double mark, boolean alive) {
        super(name, age, alive);
//        System.out.println("student full constructor");

//        setName(name);
//        setAge(age);
//        setAlive(alive);

//        this.name = name;
//        this.age = age;
        note = new MarkNote(mark);
//        this.alive = alive;
    }

// copy-constructor
    public Student(Student student) {
        super();

        name = student.name;
        age = student.age;
        note = new MarkNote(student.note.getMark());
        alive = student.alive;
    }


//    public void setAge(int age) {
//        if(age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE){
//        this.age = age;
//        }
//    }

    public double getMark() {
        return note.getMark();
    }

        public void setMark(double mark){
        note.setMark(mark);
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
                + ", mark = " + note.getMark();

    }
}






