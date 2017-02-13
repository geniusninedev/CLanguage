package com.geniusnine.android.clanguage.ControlStatements;
//calling controlstatement listview
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

public class ControStateList extends AppCompatActivity {

    ListView ControlList;
    ArrayAdapter<String> adapter;
    String[] controlstatementlist={"'C' if-else","'C' switch","'C' Loops","'C' do-while loop","'C' while loop",
                                   "'C' for loop","'C' break","'C' continue","'C' goto and Type Casting"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contro_state_list);
        ControlList = (ListView) findViewById(R.id.CallControlstatementListEngg);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_contro_state_list, R.id.ListOfControlstatementTextView, controlstatementlist);
        ControlList.setAdapter(adapter);
        ControlList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent csRef=new Intent(ControStateList.this,CallControlStatementDetails.class);
                csRef.putExtra("key",position);
                startActivity(csRef);

            }
        });
    }


}
