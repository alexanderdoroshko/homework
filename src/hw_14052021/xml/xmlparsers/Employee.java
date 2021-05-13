package hw_14052021.xml.xmlparsers;

public class Employee {
    private String name;
    private String post;
    private String hospital_ward;
    private String work_experience;

    public Employee(String name, String post, String hospital_ward, String work_experience) {
        this.name = name;
        this.post = post;
        this.hospital_ward = hospital_ward;
        this.work_experience = work_experience;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getHospital_ward() {
        return hospital_ward;
    }

    public String getWork_experience() {
        return work_experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setHospital_ward(String hospital_ward) {
        this.hospital_ward = hospital_ward;
    }

    public void setWork_experience(String work_experience) {
        this.work_experience = work_experience;
    }

        @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", hospital ward='" + hospital_ward + '\'' +
                ", work experience='" + work_experience + '\'' +
                '}';
    }
}
