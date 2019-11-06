package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import java.util.Random;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int scored = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }







    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
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


    public void on_button_click(View view) {

        TextView dupdated = this.findViewById(R.id.Icebreaker_textview);

        EditText userin = this.findViewById(R.id.chosennumber);

        TextView change = this.findViewById(R.id.textView2);

        TextView updated = this.findViewById(R.id.textView5score);

        TextView tv = this.findViewById(R.id.textView);

        int max = 6;
        int min = 1;


        Random r = new Random();
        int number = r.nextInt(max - min + 1) + min;


        tv.setText(Integer.toString(number));

        String user = userin.getText().toString();
        int finalValue = Integer.parseInt(user);


        if (finalValue > 0 || finalValue < 7) {

            if (finalValue == number) {

                change.setText(("Congrats"));
                userin.setText("");

                scored = scored + 1;


            } else {
                change.setText("Incorrect");
                userin.setText("");


            }
        } else {

        }
        updated.setText(String.valueOf(scored));


    }

//        public void d_icebreaker (View view)
//        {
//            TextView tv5 = this.findViewById(R.id.Icebreaker_textview);
//
//            ArrayList<String> list = new ArrayList<String>(); //create new array
//            list.add("If you could go anywhere in the world, where would you go?");
//            list.add("If you were stranded on a desert island, what three things would you want to take with you?");
//            list.add("If you could eat only one food for the rest of your life, what would that be?");
//            list.add("If you won a million dollars, what is the first thing you would buy?");
//            list.add("If you could spaned the day with one fictional character, who would it be?");
//            list.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
//
//
    // }

    public void  d_icebreakerr( View view) {

        TextView dupdated = this.findViewById(R.id.Icebreaker_textview);


        int max = 6;
        int min = 1;


        Random r = new Random();
        int dnumber = r.nextInt(max - min + 1) + min;


        if (dnumber == 1) {

            dupdated.setText("If you could go anywhere in the world, where would you go?");
        }

        else if (dnumber == 2) {

            dupdated.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        }

        else if (dnumber == 3) {

            dupdated.setText("If you could eat only one food for the rest of your life, what would that be?");
        }

        else if (dnumber == 4) {

            dupdated.setText("if you won a million dollars, what is the first thing you would buy?");

        }
        else if (dnumber == 5) {

            dupdated.setText("If you could spaned the day with one fictional character, who would it be?");
        }

        else if (dnumber == 6) {

            dupdated.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
        } else {
            dupdated.setText("Questions");

        }
    }
}




































