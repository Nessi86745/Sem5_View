import Controller.Controller;
import Data.Student;
import Data.Teacher;
import Service.DataService;
import View.StudentView;
import View.TeacherView;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов", 25, "Москва", 0, 5);
        Student student2 = new Student("Сидоров", 25, "Москва", 1, 4);
        Teacher teacher1 = new Teacher("Петров", 53, "Москва", 0, new ArrayList<>(List.of("Математика")));
        Teacher teacher2 = new Teacher("Cоколов", 60, "Москва", 1, new ArrayList<>(List.of("Информатика")));

        DataService dataService = new DataService();

//      dataService.Create(student1);
//      dataService.Create(student2);
//      dataService.Create(teacher1);
//      dataService.Create(teacher2);
//      System.out.println(dataService.Read("Student"));
//      System.out.println(dataService.Read("Teacher"));

        Controller controller = new Controller();
        controller.Create(student1);
        controller.Create(student2);
        controller.Create(teacher1);
        controller.Create(teacher2);
//      System.out.println(controller.Read("Student"));

        System.out.println("--------------------");
        StudentView studentView = new StudentView(controller);
        studentView.readStudent();
        TeacherView teacherView = new TeacherView(controller);
        teacherView.readTeacher();

    }
}