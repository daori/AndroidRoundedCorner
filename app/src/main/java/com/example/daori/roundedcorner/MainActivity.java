package com.example.daori.roundedcorner;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private static final String RADIUS_TEXT = " Radius = ";
    private TextView textSpinner;
    private EditText input;
    private ImageView box;
    private EditText input2;
    private ImageView box2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = (ImageView) findViewById(R.id.rectangle_box);
        input = (EditText) findViewById(R.id.edit_radius);

        setBoxRounded(box, input.getText().toString());
        input.addTextChangedListener(new TextChangeWatcher(box));


        box2 = (ImageView) findViewById(R.id.rectangle_box2);
        input2 = (EditText) findViewById(R.id.edit_radius2);

        setBoxRounded(box2, input2.getText().toString());
        input2.addTextChangedListener(new TextChangeWatcher(box2));


    }

    private class TextChangeWatcher implements TextWatcher {

        ImageView viewBox;
        public TextChangeWatcher(ImageView imageView){
            this.viewBox = imageView;
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (!s.toString().isEmpty()) {
                setBoxRounded(this.viewBox, s.toString());
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    void setBoxRounded(ImageView view, String radius){
        view.setImageDrawable(new RadiusDrawable(getApplicationContext(), Float.parseFloat(radius)));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
