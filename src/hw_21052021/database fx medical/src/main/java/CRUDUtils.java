import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    private static final String GET_ALL_EMPLOYEES = "SELECT * FROM employees";
    private static final String INSERT_EMPLOYEES = "INSERT INTO employees(fullName, age, post,specialization) VALUES (?,?,?,?);";
    private static final String UPDATE_EMPLOYEES = "UPDATE employees SET age = ? WHERE fullName = ?";
    private static final String DELETE_EMPLOYEES = "DELETE FROM employees WHERE fullName = ?";


    public static List<Employee> getEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_EMPLOYEES)) {

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String fullName = rs.getString("fullName");
                int age = rs.getInt("age");
                String post = rs.getString("post");
                String specialization = rs.getString("specialization");

                employees.add(new Employee(fullName, age, post, specialization));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return employees;
    }

    public static List<Employee> saveEmployee(Employee employee) {
        List<Employee> updatedEmployees = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEES)) {
            preparedStatement.setString(1, employee.getFullName());
            preparedStatement.setInt(2, employee.getAge());
            preparedStatement.setString(3, employee.getPost());
            preparedStatement.setString(4, employee.getSpecialization());
            preparedStatement.executeUpdate();

            PreparedStatement allEmployeesStatement = connection.prepareStatement(GET_ALL_EMPLOYEES);
            ResultSet rs = allEmployeesStatement.executeQuery();

            while (rs.next()) {
                String fullName = rs.getString("fullName");
                int age = rs.getInt("age");
                String post = rs.getString("post");
                String specialization = rs.getString("specialization");

                updatedEmployees.add(new Employee(fullName, age, post, specialization));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedEmployees;
    }

    public static List<Employee> updateEmployee(String fullNameFind, int newAge) {
        List<Employee> updatedStudents = new ArrayList<>();
        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEES)) {
            preparedStatement.setInt(1, newAge);
            preparedStatement.setString(2, fullNameFind);

            preparedStatement.executeUpdate();

            PreparedStatement allEmployeesStatement = connection.prepareStatement(GET_ALL_EMPLOYEES);
            ResultSet rs = allEmployeesStatement.executeQuery();

            while (rs.next()) {
                String fullName = rs.getString("fullName");
                int age = rs.getInt("age");
                String post = rs.getString("post");
                String specialization = rs.getString("specialization");

                updatedStudents.add(new Employee(fullName, age, post, specialization));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedStudents;
    }


    public static List<Employee> deleteEmployee(String fullName) {
        List<Employee> updatedEmployee = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEES)) {

            preparedStatement.setString(1, fullName);
            preparedStatement.execute();

            PreparedStatement allStudentsStatement = connection.prepareStatement(GET_ALL_EMPLOYEES);
            ResultSet rs = allStudentsStatement.executeQuery();

            while (rs.next()) {
                String fullName1 = rs.getString("fullName");
                int age = rs.getInt("age");
                String post = rs.getString("post");
                String specialization = rs.getString("specialization");

                updatedEmployee.add(new Employee(fullName1, age, post, specialization));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedEmployee;
    }
}