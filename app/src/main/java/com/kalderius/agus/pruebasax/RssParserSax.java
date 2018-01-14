package com.kalderius.agus.pruebasax;

import android.net.ParseException;

import org.xml.sax.InputSource;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by Agus on 14/01/2018.
 */

public class RssParserSax {
    private InputSource rssUrl;

    public RssParserSax(String url)
    {
            InputSource is = new InputSource(url);
            is.setEncoding("ISO-8859-1");
            this.rssUrl = is;


    }

    public void parse()
    {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try
        {
            SAXParser parser = factory.newSAXParser();
            RssHandler handler = new RssHandler();


            parser.parse(this.rssUrl, handler);
        } catch(ParseException ex){

        } catch (Exception e)
        {

        }
    }


}
