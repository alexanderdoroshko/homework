package hw_14052021.xml.xmlparsers;

public enum EmployeeXmlTag {
    EMPLOYEE("employee"),
    FULL_NAME("full_name"),
    POST("post"),
    HOSPITAL_WARD("hospital_ward"),
    WORK_EXPERIENCE("work_experience"),
    STUFF_HOSPITAL("stuff_hospital");

    private String value;
    EmployeeXmlTag(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

