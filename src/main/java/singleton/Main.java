package singleton;

public class Main {

    public static void main(String[] args){
        Student student = Student.getInstance("Paul");
        System.out.println(student);
        Student student_1 = Student.getInstance("Alain");
        System.out.println(student_1);
    }
}
