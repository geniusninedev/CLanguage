package com.geniusnine.android.clanguage.TopCPrograms;
//calling top programs list
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

public class programsrefList extends AppCompatActivity {

    ListView programList;
    ArrayAdapter<String> adapter;
    String[] topprogramslist={"Fibonacci series","Prime Number","Palindrome Number","Factorial","Armstrong Number","Sum of digits",
            "Reverse Number","Swap Number","Print 'Hello' without ;","Assembly code in 'C'","'C' program without main",
            "Matrix Multiplication","Decimal to Binary","Number in Characters","Alphabet Triangle","Number Triangle","Fibonacci Triangle",
            "Displaying Numbers Using 'dowhile'","Displaying Numbers Using 'For' Loop","Program By Using Switch",
            "Factorial Using goto statement","Program By Using Recursion in 'C'","Program By using Array",
            "Program By Using Nested Structure in 'C'","Program By Using Cintinue"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programsref_list);
        programList = (ListView) findViewById(R.id.CallListprog);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_programsref_list, R.id.ListOfprogTextView, topprogramslist);
        programList.setAdapter(adapter);
        programList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent progBegRef=new Intent(programsrefList.this,CallProgDetails.class);
                progBegRef.putExtra("key",position);
                startActivity(progBegRef);

            }
        });
    }


}
