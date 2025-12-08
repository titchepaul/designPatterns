package singleton;

public class Student {

    private  String name;
    private static Student student = null;

    private  Student(String name){
        this.name = name;
    }

    public static Student getInstance(String name) {
        if(student == null){
            student = new Student(name);
        }
        return student;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
