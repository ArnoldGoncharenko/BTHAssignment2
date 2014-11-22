package com.example.arnold.bthassignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class CinemaSummary2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema_summary2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cinema_summary2, menu);
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

    public void movieTime1(View view)
    {
        Intent intent = new Intent(this, MovieFinalSummary2.class);
        intent.putExtra("time", "12:30");
        startActivity(intent);
    }

    public void movieTime2(View view)
    {
        Intent intent = new Intent(this, MovieFinalSummary2.class);
        intent.putExtra("time", "3:40");
        startActivity(intent);
    }

    public void movieTime3(View view)
    {
        Intent intent = new Intent(this, MovieFinalSummary2.class);
        intent.putExtra("time", "7:10");
        startActivity(intent);
    }
}
