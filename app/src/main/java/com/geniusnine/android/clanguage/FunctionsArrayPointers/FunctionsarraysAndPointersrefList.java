package com.geniusnine.android.clanguage.FunctionsArrayPointers;
//calling FunctionArray and pointer listview
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.clanguage.ControlStatements.CallControlStatementDetails;
import com.geniusnine.android.clanguage.ControlStatements.ControStateList;
import com.geniusnine.android.clanguage.R;

public class FunctionsarraysAndPointersrefList extends AppCompatActivity {

    ListView FunctionsList;
    ArrayAdapter<String> adapter;
    String[] FunctionArraylist={"What is Function","Call:Value and Reference","Recursion in 'C'","Storage Classes","1-d Array","2-d Array","DynamicMemoryAllocation in 'C'"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functionsarrays_and_pointersref_list);
        FunctionsList = (ListView) findViewById(R.id.CallFunctionListEngg);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_functionsarrays_and_pointersref_list, R.id.ListOfFunctionTextView, FunctionArraylist);
        FunctionsList.setAdapter(adapter);
        FunctionsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent csRef=new Intent(FunctionsarraysAndPointersrefList.this,CallFunctionDetails.class);
                csRef.putExtra("key",position);
                startActivity(csRef);

            }
        });
    }


}
