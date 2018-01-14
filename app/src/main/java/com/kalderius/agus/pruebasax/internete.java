package com.kalderius.agus.pruebasax;

import android.os.AsyncTask;

/**
 * Created by Agus on 14/01/2018.
 */

public class internete extends AsyncTask {
    @Override
    protected Object doInBackground(Object[] objects) {
        RssParserSax saxparser =
                new RssParserSax("http://www.aemet.es/xml/municipios/localidad_13082.xml");

        saxparser.parse();
        return null;
    }
}
