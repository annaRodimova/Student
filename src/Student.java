import java.util.*;
public class Student {
    // поля
    public String name;
    public String surname;
    public String target;
    public int age;
    public String faculty;
    public int group;
    public int tasks;
    public int module;
    public boolean experiens;

    public Student(String name, String surname, String target, int age, String faculty, int group) {
        this.name = name;
        this.surname = surname;
        this.target = target;
        this.age = age;
        this.faculty = faculty;
        this.group = group;
    }


    //методы
    public void question() {
        System.out.println("сколько тебе лет");
        Scanner a = new Scanner(System.in);

                System.out.println("мне " + a.nextLine() + " лет");
    }

    public void speak() {
        System.out.println("привет");
    }

    public void offset() {
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if (answer.equals("yes")) {
            System.out.println("зачет");
        }
        else{
            System.out.print("не зачет");
        }
    }
}