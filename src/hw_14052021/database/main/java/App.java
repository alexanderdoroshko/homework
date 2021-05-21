import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = CRUDUtils.getStudentData();
        System.out.println(students);

        System.out.println(CRUDUtils.updateStudent(2,"C# course"));
        System.out.println(CRUDUtils.saveStudent(new Student(6,"Bill","Gates","Python course")));
        System.out.println(CRUDUtils.deleteStudent(1));
    }
}
