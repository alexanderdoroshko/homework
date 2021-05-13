package hw_14052021.xml.xmlparsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SAXParserEmployee {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        XMLHandler handler = new XMLHandler();
        parser.parse(new File("D:\\teachmeskills\\homework\\src\\hw_14052021\\xml\\hospitalstuff.xml"), handler);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static class XMLHandler extends DefaultHandler {
        private String name, post, hospital_ward, work_experience, lastElementName;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElementName.equals("full_name"))
                    name = information;
                if (lastElementName.equals("post"))
                    post = information;
                if (lastElementName.equals("hospital_ward"))
                    hospital_ward = information;
                if (lastElementName.equals("work_experience"))
                    work_experience = information;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ((name != null && !name.isEmpty()) && (post != null && !post.isEmpty()) &&
                    (hospital_ward != null && !hospital_ward.isEmpty()) && (work_experience != null && !work_experience.isEmpty())) {
                employees.add(new Employee(name, post, hospital_ward, work_experience));
                name = null;
                post = null;
                hospital_ward = null;
                work_experience = null;
            }
        }
    }
}



