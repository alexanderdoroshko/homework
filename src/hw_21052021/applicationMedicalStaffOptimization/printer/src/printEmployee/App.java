package printEmployee;

import utils.CRUDUtils;
import utils.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = CRUDUtils.getEmployeeData();
        System.out.println(employees);

        System.out.println(CRUDUtils.updateEmployee("Хаус Грегори Иванович", 87));
        System.out.println(CRUDUtils.saveEmployee(new Employee("Крупская Наталья Николаевна", 40, "врач", "окулист")));
        System.out.println(CRUDUtils.deleteEmployee("Хаус Грегори Иванович"));
    }
}
