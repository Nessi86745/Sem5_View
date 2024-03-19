package Data;

import java.util.ArrayList;

public class Teacher extends User{
    private Integer id;
    private ArrayList<String> disciplines;

    public Teacher(String name, Integer age, String address, Integer id) {
        super(name, age, address);
        this.id = id;
    }

    public Teacher(String name, Integer age, String address, Integer id, ArrayList<String> disciplines) {
        super(name, age, address);
        this.id = id;
        this.disciplines = disciplines;
    }

    public Teacher(Integer id, ArrayList<String> disciplines) {
        this.id = id;
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", disciplines=" + disciplines +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
