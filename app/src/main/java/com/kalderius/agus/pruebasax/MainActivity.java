package com.kalderius.agus.pruebasax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnprobar);
        System.setProperty("org.xml.sax.driver","org.xmlpull.v1.sax2.Driver");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new internete().execute();

            }
        });
    }
}
