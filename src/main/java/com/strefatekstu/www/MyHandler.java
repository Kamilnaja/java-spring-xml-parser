package com.strefatekstu.www;

import com.strefatekstu.www.models.Employee;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

public class MyHandler extends DefaultHandler {
    private List<Employee> emplist = null;
    private Employee emp = null;

    public List<Employee> getEmplist(){
        return emplist;
    }

    boolean bAge = false;
    boolean bName = false;
    boolean bGender = false;
    boolean bRole = false;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("Employee")) {
            String id = attributes.getValue("id");
//            emp = new Employee();

        }
    }

    public void endElement() throws SAXException {

    }
}
