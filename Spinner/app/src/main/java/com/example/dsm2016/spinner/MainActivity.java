package com.example.dsm2016.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("red");
        adapter.add("green");
        adapter.add("blue");

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(MainActivity.this, item + "이(가) 선택되었습니다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
        Spinner myspinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> myadapter = ArrayAdapter.createFromResource(this, R.array.list_entries, R.layout.spinner_item);
        myadapter.setDropDownViewResource(R.layout.dropdown_item);
        myspinner.setAdapter(myadapter);
    }
}
