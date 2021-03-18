package hw_19032021;

public class Student_run {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", 2000, 1);
        Student student2 = new Student("Петр", "Петров", 2001, 1);
        Student student3 = new Student("Сид", "Сидоров", 2002, 3);
        Student student4 = new Student("Алексей", "Алекперов", 2004, 2);
        Student student5 = new Student("Саид", "Абдурахман", 2000, 4);
        Student student6 = new Student("Арнольд", "Шварцнеггер", 2002, 2);

        Student[] arrayStudent = {student1, student2, student3, student4, student5, student6};

        System.out.println("Список студентов 2 курса:");
        printStudent(arrayStudent, 2);
        System.out.println();
        System.out.println("Список студентов 4 курса:");
        printStudent(arrayStudent, 4);
    }

    public static void printStudent(Student[] arrayStudent, int course) {
        for (Student st : arrayStudent) {
            if (st.getCourse() == course) {
                System.out.println(st.getSurname() + " " + st.getName() + " " + st.getDateofBirthday());
            }
        }
    }
}
