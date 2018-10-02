package com.strefatekstu.www;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class HandlerBook {
    DefaultHandler handler = new DefaultHandler() {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (localName.equalsIgnoreCase("a") && attributes != null) {
                for (int i = 0; i < attributes.getLength(); i++) {
                    String aname = attributes.getLocalName(i);
                    if (aname.equalsIgnoreCase("href")){
                        System.out.println(attributes.getValue(i));
                    }
                }
            }
        }
    };
}
