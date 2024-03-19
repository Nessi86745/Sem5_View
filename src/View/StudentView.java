package View;

import Controller.Controller;

public class StudentView {
    protected Controller controller;
    public StudentView(Controller controller){
        this.controller = controller;
    }
    public void readStudent(){
        System.out.println(controller.Read("student"));
    }

    @Override
    public String toString() {
        return "StudentView{" +
                "controller=" + controller +
                '}';
    }

}
