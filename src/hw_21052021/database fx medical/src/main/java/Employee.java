public class Employee {
    private String fullName;
    private int age;
    private String post;
    private String specialization;

    public Employee(String fullName, int age, String post, String specialization) {
        this.fullName = fullName;
        this.age = age;
        this.post = post;
        this.specialization = specialization;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
