package com.strefatekstu.www;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxBook {
    public static void main(String[] args) throws Exception {
        String url;
        if (args.length == 0) {
            url = "http://www.w3c.org";
            System.out.println("Using " + url);
        } else url = args[0];
//        File file = new File("employee.xml");
//todo - odczytać dane z pliku

        DefaultHandler handler = new DefaultHandler() {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

                if (localName.equalsIgnoreCase("name")) {
                    for (int i = 0; i < attributes.getLength(); i++) {
                        String aname = attributes.getLocalName(i);
                        System.out.println(aname);
                    }
                }
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance(); // zwraca instancję klasy SAXParseFactory
        factory.setNamespaceAware(true);  // spr
        SAXParser saxParser = factory.newSAXParser(); // zwraca instancję klasy SAXParser
        File fileToParse = new File("Employee.xml");

        saxParser.parse(fileToParse, handler);
        // todo - jak otworzyć plik na dysku
    }
}
