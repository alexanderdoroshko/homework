import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_STUDENTS = "SELECT * FROM students";
    private static final String INSERT_STUDENTS = "INSERT INTO students(name, surname, course_name) VALUES (?,?,?);";
    private static final String UPDATE_STUDENTS = "UPDATE students SET course_name = ? WHERE id = ?";
    private static final String DELETE_STUDENTS = "DELETE FROM students WHERE id = ?";


    public static List<Student> getStudentData() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS)) {

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String course_name = rs.getString("course_name");

                students.add(new Student(id, name, surname, course_name));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static List<Student> saveStudent(Student student) {
        List<Student> updatedStudents = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENTS)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getCourse_name());
            preparedStatement.executeUpdate();

            PreparedStatement allStudentsStatement = connection.prepareStatement(GET_ALL_STUDENTS);
            ResultSet rs = allStudentsStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String course_name = rs.getString("course_name");

                updatedStudents.add(new Student(id, name, surname, course_name));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }

    public static List<Student> updateStudent(int studentID, String courseName) {
        List<Student> updatedStudents = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENTS)) {
            preparedStatement.setString(1, courseName);
            preparedStatement.setInt(2, studentID);
            preparedStatement.executeUpdate();

            PreparedStatement allStudentsStatement = connection.prepareStatement(GET_ALL_STUDENTS);
            ResultSet rs = allStudentsStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String course_name = rs.getString("course_name");

                updatedStudents.add(new Student(id, name, surname, course_name));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }


    public static List<Student> deleteStudent(int studentID) {
        List<Student> updatedStudents = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENTS)) {

            preparedStatement.setInt(1, studentID);
            preparedStatement.execute();

            PreparedStatement allStudentsStatement = connection.prepareStatement(GET_ALL_STUDENTS);
            ResultSet rs = allStudentsStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String course_name = rs.getString("course_name");

                updatedStudents.add(new Student(id, name, surname, course_name));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }


}
