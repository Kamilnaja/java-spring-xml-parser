package com.strefatekstu.www;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        // when the parser start parsing the document
        System.out.println("Start parsing document");
    }

    @Override
    public void endDocument() throws SAXException {
        // when parser end parsing the element
        System.out.println("end parsing");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("<"+qName+">");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("<"+qName+">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
//        when you want print out something from element
        for (int i = start; i < (start + length); i++) {
            System.out.println(ch[i]);
        }
    }
}