package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rakshith on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        Teacher anuradha = new Teacher(1,"Anuradha",500);
        Teacher kalavani = new Teacher(2,"Kalavani",700);
        Teacher ramachandra = new Teacher(3,"Ramachandra",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(anuradha);
        teacherList.add(kalavani);
        teacherList.add(ramachandra);


        Student chhavi = new Student(1,"Chhavi",4);
        Student jernigan = new Student(2,"Jernigan",12);
        Student mahesh = new Student(3,"Mahesh",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(chhavi);
        studentList.add(jernigan);
        studentList.add(mahesh);




        School ghs = new School(teacherList,studentList);

        Teacher arthi = new Teacher(6,"Arthi", 900);

        ghs.addTeacher(arthi);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(jernigan);

        mellisa.receiveSalary(kalavani.getSalary());

        System.out.println(kalavani);


    }
}
