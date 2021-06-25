import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTests {
    private static Student student1;
    private static Student student2;
    private static Student student3;
    private static List<Student> actual;
    private static List<Student> actualBySex;
    private static int actualStudentCount;
    private static int actualSumOfAllStudentsAge;
    private static int actualAverageAgeOfAllStudents;
    private static int actualAverageAgeOfAllStudentsByFemale;


    @BeforeAll
    public static void setUp() {
        student1 = new Student("Ivan", 17, Sex.MALE);
        student2 = new Student("Anna", 19, Sex.FEMALE);
        student3 = new Student("Polina", 18, Sex.FEMALE);

        actual = new ArrayList<>();
        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        actualBySex = new ArrayList<>();
        actualBySex.add(student1);

        actualStudentCount = 3;
        actualSumOfAllStudentsAge = 17 + 19 + 18;
        actualAverageAgeOfAllStudents = (17 + 19 + 18) / 3;
        actualAverageAgeOfAllStudentsByFemale = (19 + 18) / 2;
    }

    @Test
    public void checkAllStudentsReturned() {
        List<Student> expected = Student.getAllStudents();
        Assertions.assertEquals(expected, actual, "Some error message");

    }

    @Test
    public void checkAllStudentsReturned_NotNull() {
        List<Student> expected = Student.getAllStudents();
        Assertions.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_MALE() {
        List<Student> expected = Student.getAllStudentsBySex(Sex.MALE);
        Assertions.assertEquals(actualBySex, expected);
    }

    @Test
    public void checkStudentCount() {
        int studentCount = Student.getStudentsCount();
        Assertions.assertEquals(studentCount, actualStudentCount, "method getStudentCount are not corrected");
    }

    @Test
    public void checkStudentsCountWitSex_MALE() {
        int studentsCountWitSex = Student.getStudentsCountWitSex(Sex.MALE);
        Assertions.assertEquals(studentsCountWitSex, 1, "method getStudentsCountWitSex are not corrected");
    }

    @Test
    public void checkSumOfAllStudentsAge() {
        int sumOfAllStudentsAge = Student.getSumOfAllStudentsAge();
        Assertions.assertEquals(sumOfAllStudentsAge, actualSumOfAllStudentsAge, "method getSumOfAllStudentsAge are not corrected");
    }

    @Test
    public void checkSumOfAllStudentsAgeBySex_MALE() {
        int sumOfAllStudentsAgeMale = Student.getSumOfAllStudentsAgeBySex(Sex.MALE);
        Assertions.assertEquals(sumOfAllStudentsAgeMale, 17, "method getSumOfAllStudentsAgeBySex are not corrected");
    }

    @Test
    public void checkAverageAgeOfAllStudents() {
        int averageAgeOfAllStudents = Student.getAverageAgeOfAllStudents();
        Assertions.assertEquals(averageAgeOfAllStudents, actualAverageAgeOfAllStudents, "method getAverageAgeOfAllStudents are not corrected");
    }

    @Test
    public void checkAverageAgeOfAllStudentsBySex_FEMALE() {
        int averageAgeOfAllStudentsByFemale = Student.getAverageAgeOfAllStudentsBySex(Sex.FEMALE);
        Assertions.assertEquals(averageAgeOfAllStudentsByFemale, actualAverageAgeOfAllStudentsByFemale, "method getAverageAgeOfAllStudentsBySex are not corrected");
    }


    @AfterAll
    public static void tearDown() {
        System.out.println("All tests are finished!");
    }
}
