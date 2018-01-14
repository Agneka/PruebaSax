package com.kalderius.agus.pruebasax;

import android.os.AsyncTask;
import android.sax.StartElementListener;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agus on 14/01/2018.
 */

public class RssHandler extends DefaultHandler {
    private List lista;
    private String linea;


    public RssHandler() {
        this.lista = new ArrayList();
        this.linea = new String();
    }

    @Override
    public void endElement(String uri, String localName, String name)
            throws SAXException {
        //super.endElement(uri, localName, name);
        if(localName.equalsIgnoreCase("maxima"))
        System.out.println("TEMPERATURA: "+linea);

    }

    @Override
    public void startDocument() throws SAXException {

        super.startDocument();
        lista = new ArrayList();
        System.out.println("EMPEZANDO.....");


    }

    @Override
    public void startElement(String uri, String localName,
                             String name, Attributes attributes) throws SAXException {

        super.startElement(uri, localName, name, attributes);

        System.out.println("NUEVO ELEMENTO: "+name);
        linea = "";


    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("TERMINANDO");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //super.characters(ch, start, length);
        linea = "";
        for (char c :
                ch) {
            linea = linea+c;
        };

    }
}
