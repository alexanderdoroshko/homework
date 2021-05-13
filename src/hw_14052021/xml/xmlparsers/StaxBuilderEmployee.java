package hw_14052021.xml.xmlparsers;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StaxBuilderEmployee {
    private Set<Employee> employees;
    private XMLInputFactory inputFactory;

    public StaxBuilderEmployee() {
        inputFactory = XMLInputFactory.newInstance();
        employees = new HashSet<Employee>();
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void buildSetEmployees(String filename) throws XMLStreamException {
        XMLStreamReader reader;
        String name;
        try (FileInputStream inputStream = new FileInputStream(filename)) {
            reader = inputFactory.createXMLStreamReader(inputStream);
// StAX parsing
            while (reader.hasNext()) {                int type = reader.next();
                if (type == XMLStreamConstants.START_ELEMENT) {
                    name = reader.getLocalName();
                    if (name.equals(EmployeeXmlTag.EMPLOYEE.getValue())) {
                        Employee employee = buildEmployee(reader);
                        employees.add(employee);
                    }
                }
            }
        } catch (XMLStreamException | IOException e) {
            e.printStackTrace();
        }
    }


    Employee buildEmployee(XMLStreamReader reader) throws XMLStreamException {
        Employee employee = new Employee();
        String name;
        while (reader.hasNext()) {
            int type = reader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    name = reader.getLocalName();
                    switch (EmployeeXmlTag.valueOf(name.toUpperCase())) {
                        case FULL_NAME -> employee.setName(getXMLText(reader));
                        case POST -> employee.setPost(getXMLText(reader));
                        case HOSPITAL_WARD -> employee.setHospital_ward(getXMLText(reader));
                        case WORK_EXPERIENCE -> employee.setWork_experience(getXMLText(reader));
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    name = reader.getLocalName();
                    if (EmployeeXmlTag.valueOf(name.toUpperCase()) == EmployeeXmlTag.EMPLOYEE) {
                        return employee;
                    }
            }
        }
        throw new XMLStreamException("Unknown element in tag <employee>");
    }

    private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
        String text = null;
        if (reader.hasNext()) {
            reader.next();
            text = reader.getText();
        }
        return text;
    }





}








