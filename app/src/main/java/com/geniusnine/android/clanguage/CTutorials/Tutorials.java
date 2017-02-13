package com.geniusnine.android.clanguage.CTutorials;
//calling tutoriallist
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

public class Tutorials extends AppCompatActivity {

    ListView TutorialList;
    ArrayAdapter<String> adapter;
    String[] TutoriallList={"How to install 'C'","First 'C' Program","Flow of 'C' Program","printf,scanf,Keywords in 'C'","Variables in 'C'","Data Types and Operators in 'C'",
                       "'C' Comments","'C' Escape Sequence and Constants in 'C'","About Fundamental Questions","Control Statements","Functions","Arrays","Pointers","Strings","Structure"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
        TutorialList = (ListView) findViewById(R.id.TutorialListEngg);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_tutorials, R.id.ListOfTutorialTextView, TutoriallList);
        TutorialList.setAdapter(adapter);
        TutorialList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef=new Intent(Tutorials.this,CallTutorialsDetails.class);
                EnglishBegRef.putExtra("key",position);
                startActivity(EnglishBegRef);

            }
        });
    }
}


