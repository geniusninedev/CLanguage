package com.geniusnine.android.clanguage.StringMathUnion;
//calling String,Math,union List
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.clanguage.FunctionsArrayPointers.CallFunctionDetails;
import com.geniusnine.android.clanguage.FunctionsArrayPointers.FunctionsarraysAndPointersrefList;
import com.geniusnine.android.clanguage.R;

public class StringMathrefList extends AppCompatActivity {

    ListView StringList;
    ArrayAdapter<String> adapter;
    String[] STRINGGlist={"String","String Methods","Math Function","Structure And Arrary Of Structure","Nested Structure And 'C' Union"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_mathref_list);
        StringList = (ListView) findViewById(R.id.CallListString);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_string_mathref_list, R.id.ListOfStringTextView, STRINGGlist);
        StringList.setAdapter(adapter);
        StringList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent csRef=new Intent(StringMathrefList.this,CallStringDetails.class);
                csRef.putExtra("key",position);
                startActivity(csRef);

            }
        });
    }


}
