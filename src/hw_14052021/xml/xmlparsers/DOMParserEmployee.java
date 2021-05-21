package hw_14052021.xml.xmlparsers;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOMParserEmployee {
    private static ArrayList<Employee> employees = new ArrayList<>();

    //Метод для поиска сотрудника

    public static void findEmployee(String name) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("D:\\teachmeskills\\homework\\src\\hw_14052021\\xml\\hospitalstuff.xml"));

        NodeList employeeElement = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < employeeElement.getLength(); i++) {
            NodeList childNode = employeeElement.item(i).getChildNodes();
            if (childNode.item(1).getTextContent().equals(name)) {
                String full_name = childNode.item(1).getTextContent();   //Теги считаются на открытие/закрытие поэтому такая нумерация
                String post = childNode.item(3).getTextContent();
                String hospital_ward = childNode.item(5).getTextContent();
                String work_experience = childNode.item(7).getTextContent();

                System.out.println("Имя: " + full_name + "\n" + "Фамилия:" + post + "\n" + "Отделение:" +
                        hospital_ward + "\n" + "Стаж работы " + work_experience + " лет");

            }
        }
    }


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("D:\\teachmeskills\\homework\\src\\hw_14052021\\xml\\hospitalstuff.xml"));

        //Парсинг XML и вывод информации о сотрудниках

        NodeList employeeElement = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < employeeElement.getLength(); i++) {
            NodeList childNode = employeeElement.item(i).getChildNodes();
            String full_name = childNode.item(1).getTextContent();   //Теги считаются на открытие/закрытие поэтому такая нумерация
            String post = childNode.item(3).getTextContent();
            String hospital_ward = childNode.item(5).getTextContent();
            String work_experience = childNode.item(7).getTextContent();

            employees.add(new Employee(full_name, post, hospital_ward, work_experience));
        }

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }


        System.out.println("-------------------------------------------------------------");
        findEmployee("Морлок Мария Александровна");
    }
}
