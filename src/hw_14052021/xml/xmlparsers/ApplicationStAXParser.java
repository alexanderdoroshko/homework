package hw_14052021.xml.xmlparsers;

import javax.xml.stream.XMLStreamException;

public class ApplicationStAXParser {
    public static void main(String[] args) throws XMLStreamException {
        StaxBuilderEmployee staxBuilder = new StaxBuilderEmployee();
        staxBuilder.buildSetEmployees("D:\\teachmeskills\\homework\\src\\hw_14052021\\xml\\hospitalstuff.xml");
        System.out.println(staxBuilder.getEmployees());


    }
}
