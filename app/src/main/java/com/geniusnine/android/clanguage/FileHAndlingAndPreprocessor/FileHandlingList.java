package com.geniusnine.android.clanguage.FileHAndlingAndPreprocessor;
//calling filehandling and preprocessor list
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.clanguage.R;

public class FileHandlingList extends AppCompatActivity {

    ListView fileList;
    ArrayAdapter<String> adapter;
    String[] fileelist={"FileHandling","FileHandling Methods","Preprocessor And Macros","PreProcessor Methods","More Methods","CommandLine Arguments"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_handling_list);
        fileList = (ListView) findViewById(R.id.CallListfile);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_file_handling_list, R.id.ListOfFileTextView, fileelist);
        fileList.setAdapter(adapter);
        fileList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef=new Intent(FileHandlingList.this,CallFileDetails.class);
                EnglishBegRef.putExtra("key",position);
                startActivity(EnglishBegRef);

            }
        });
    }


}

