package Service;

import Data.Student;
import Data.Teacher;
import Data.User;

import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;

public class DataService {
    private ArrayList<User> StudentList = new ArrayList<>();
    private ArrayList<User> TeacherList = new ArrayList<>();

    public void Create(User user) {
        if (user instanceof Student) {
            Student student = new Student(user.getName(), user.getAge(), user.getAddress(), StudentList.size() + 1);
            StudentList.add(student);
        } else {
            Teacher teacher = new Teacher(user.getName(), user.getAge(), user.getAddress(), TeacherList.size() + 1);
            TeacherList.add(teacher);
        }
    }

    public ArrayList<User> Read(String type) {
        if (type.equals("student")) {
            return StudentList;
        } else if (type.equals("teacher")) {
            return TeacherList;
        }else {
            return null;
        }
    }
}


