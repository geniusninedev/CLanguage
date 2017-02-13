package com.geniusnine.android.clanguage;
//calling Activities
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.geniusnine.android.clanguage.CTutorials.Tutorials;
import com.geniusnine.android.clanguage.CIntroduction.Introduction;
import  com.geniusnine.android.clanguage.ControlStatements.ControStateList;
import  com.geniusnine.android.clanguage.FunctionsArrayPointers.FunctionsarraysAndPointersrefList;
import  com.geniusnine.android.clanguage.StringMathUnion.StringMathrefList;
import  com.geniusnine.android.clanguage.FileHAndlingAndPreprocessor.FileHandlingList;
import  com.geniusnine.android.clanguage.TopCPrograms.programsrefList;
import  com.geniusnine.android.clanguage.RatingApp.Rating;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void controstatements(View view){
    Intent Controlstatref=new Intent(MainActivity.this,ControStateList.class);
    startActivity(Controlstatref);
}
    public void Introduction(View view){
        Intent Introductionref=new Intent(MainActivity.this,Introduction.class);
        startActivity(Introductionref);
    }
    public void Tutorials(View view){
        Intent Tutorialsref=new Intent(MainActivity.this,Tutorials.class);
        startActivity(Tutorialsref);
    }
    public void FunctionsarraysAndPointers(View view){
        Intent FunctionsarraysAndPointersref=new Intent(MainActivity.this,FunctionsarraysAndPointersrefList.class);
        startActivity(FunctionsarraysAndPointersref);
    }
    public void stringMath(View view){
        Intent stringMathref=new Intent(MainActivity.this,StringMathrefList.class);
        startActivity(stringMathref);
    }
    public void file(View view){
        Intent stringfileref=new Intent(MainActivity.this,FileHandlingList.class);
        startActivity(stringfileref);
    }
    public void Programs(View view){
        Intent Programsref=new Intent(MainActivity.this,programsrefList.class);
        startActivity(Programsref);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();

                            }
                        });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                    }
                });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_share1) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "message to share");
            startActivity(Intent.createChooser(i, "Share via"));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent IntroIntentRef=new Intent(MainActivity.this,Introduction.class);
            startActivity(IntroIntentRef);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            Intent TutorialIntentRef=new Intent(MainActivity.this,Tutorials.class);
            startActivity(TutorialIntentRef);

        } else if (id == R.id.nav_slideshow) {
            Intent BooksRef=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.in/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=c+books"));
            startActivity(BooksRef);
        } else if (id == R.id.nav_videos) {
            Intent videosRef = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=c+programming"));
            startActivity(videosRef);
        } else if (id == R.id.nav_rating) {
                Intent ratingRef=new Intent(MainActivity.this,Rating.class);
                startActivity(ratingRef);
            }
        else if (id == R.id.nav_manage) {


        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
