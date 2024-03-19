package Controller;

import Data.Student;
import Data.Teacher;
import Data.User;
import Service.DataService;
import View.TeacherView;

import java.util.ArrayList;

public class Controller {
    private DataService dataService = new DataService();

    public void Create (Student student){
        dataService.Create(student);
    }
    public void Create(Teacher teacher){
        dataService.Create(teacher);
    }

    public ArrayList<User> Read (String type){
        return dataService.Read(type);
    }

}
