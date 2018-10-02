package com.strefatekstu.www;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Driver {
    public static void main(String[] args) throws Exception {
//
        XMLReader p = XMLReaderFactory.createXMLReader();
        p.setContentHandler(new Handler());
//        gdy zaczynamy parse, wykonują się metody z handlera
        p.parse("Employee.xml");
    }
}
