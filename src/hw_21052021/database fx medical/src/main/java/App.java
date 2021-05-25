import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.List;
import java.util.Scanner;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        ObservableList<Employee> employees = FXCollections.observableArrayList();
        List<Employee> employeeData = CRUDUtils.getEmployeeData();
        employees.addAll(employeeData);


        TableView<Employee> table = new TableView<>(employees);
        table.setPrefWidth(400);
        table.setPrefHeight(200);

        TableColumn<Employee, String> fullNameColumn = new TableColumn<>("Full name");
        fullNameColumn.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        table.getColumns().add(fullNameColumn);

        TableColumn<Employee, Integer> ageColumn = new TableColumn<>("age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        table.getColumns().add(ageColumn);

        TableColumn<Employee, String> postColumn = new TableColumn<>("post");
        postColumn.setCellValueFactory(new PropertyValueFactory<>("post"));
        table.getColumns().add(postColumn);

        TableColumn<Employee, String> specializationColumn = new TableColumn<>("specialization");
        specializationColumn.setCellValueFactory(new PropertyValueFactory<>("specialization"));
        table.getColumns().add(specializationColumn);

        Button addEmployeeButton = new Button("Добавить");
        addEmployeeButton.setOnAction(actionEvent -> {
            System.out.println("Введите данные нового сотрудника");
            createNewEmployee(employees);
        });

        Button removeEmployeeButton = new Button("Удалить");
        removeEmployeeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите ФИО сотрудника для удаления");
                String fullNameRemove = sc.nextLine();
                Employee p1 = null;
                for (Employee employee : employees) {
                    if (employee.getFullName().equals(fullNameRemove)) {
                        p1 = employee;
                    }
                }
                employees.remove(p1);

            }
        });


        Button redactEmployeeButton = new Button("Редактировать");
        redactEmployeeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите ФИО сотрудника для редактирования");
                String fullNameRedact = sc.nextLine();
                Employee p1 = null;
                for (Employee employee : employees) {
                    if (employee.getFullName().equals(fullNameRedact)) {
                        p1 = employee;
                    }
                }
                employees.remove(p1);
                System.out.println("Введите новые данные сотрудника");
                createNewEmployee(employees);
            }
        });

        FlowPane root = new FlowPane(30, 30, table, addEmployeeButton, removeEmployeeButton, redactEmployeeButton);

        Scene scene = new Scene(root, 500, 450);

        stage.setScene(scene);
        stage.setTitle("Medical stuff");
        stage.show();
    }

    private void createNewEmployee(ObservableList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ф.И.О.");
        String fullName = scanner.nextLine();
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Введите должность");
        String bug = scanner.nextLine();      //Это костыль? После ввода числа следующей строке присваивается пустая строка
        String post = scanner.nextLine();
        System.out.println("Введите специальность");
        String specialization = scanner.nextLine();
        employees.add(new Employee(fullName, age, post, specialization));
    }
}


