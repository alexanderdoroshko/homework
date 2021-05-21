package hw_14052021.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbWorker {
    public static void main(String[] args) {
        String filePath = "D:/students.xml";

        Student student =new Student(1,"Andrew",21,"Java");
        student.setPassword("simplepassword");

        // сохраняем объект в XML файл
        convertObjectToXml(student, filePath);

        // восстанавливаем объект из XML файла
        Student unmarshStudent = fromXmlToObject(filePath);
        if (unmarshStudent != null) {
            System.out.println(unmarshStudent.toString());
        }
    }

    // восстанавливаем объект из XML файла
    private static Student fromXmlToObject(String filePath) {
        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Student) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    // сохраняем объект в XML файл
    private static void convertObjectToXml(Student student, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(student, new File(filePath));
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }
}

