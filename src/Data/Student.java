package Data;

public class Student extends User{
    private Integer id;
    private Integer averageMark;

    public Student(String name, Integer age, String address, Integer id, Integer averageMark) {
        super(name, age, address);
        this.id = id;
        this.averageMark = averageMark;
    }

    public Student(Integer id, Integer averageMark) {
        this.id = id;
        this.averageMark = averageMark;
    }

    public Student(String name, Integer age, String address, Integer id) {
        super(name, age, address);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", averageMark=" + averageMark +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
