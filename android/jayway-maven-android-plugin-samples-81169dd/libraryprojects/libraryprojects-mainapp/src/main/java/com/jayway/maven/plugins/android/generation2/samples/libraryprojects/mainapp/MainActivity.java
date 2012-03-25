package com.jayway.maven.plugins.android.generation2.samples.libraryprojects.mainapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.lib1.Lib1Class;
import com.jayway.maven.plugins.android.generation2.samples.libraryprojects.lib2.Lib2Class;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final TextView lib1javaclass = (TextView) findViewById(R.id.lib1javaclass);
        final TextView lib2javaclass = (TextView) findViewById(R.id.lib2javaclass);
        lib1javaclass.setText(Lib1Class.getString());
        lib2javaclass.setText(Lib2Class.getString());

        final TextView lib1asset = (TextView) findViewById(R.id.lib1asset);
        final TextView lib2asset = (TextView) findViewById(R.id.lib2asset);
        try {
            final InputStream inputStream = getAssets().open("lib1asset.txt");
            lib1asset.setText(IOUtils.toString(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            final InputStream inputStream = getAssets().open("lib2asset.txt");
            lib2asset.setText(IOUtils.toString(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }

        final TextView lib1javaresource = (TextView) findViewById(R.id.lib1javaresource);
        final TextView lib2javaresource = (TextView) findViewById(R.id.lib2javaresource);
        try {
            final InputStream inputStream = this.getClass().getResourceAsStream("/lib1javaresource.txt");
            lib1javaresource.setText(IOUtils.toString(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            final InputStream inputStream = this.getClass().getResourceAsStream("/lib2javaresource.txt");
            lib2javaresource.setText(IOUtils.toString(inputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
