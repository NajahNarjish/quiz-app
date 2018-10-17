package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Get result button is clicked.
     */
    public void result(View view) {
        int sum = 0;

        /**
         * This happens for question no.1.
         */
        RadioButton greekBox1 = (RadioButton) findViewById(R.id.greek_radiobutton);
        if (greekBox1.isChecked()) {
            sum = sum +1;
        }

        /**
         * This happens for question no.2.
         */
        RadioButton light2Box = (RadioButton) findViewById(R.id.light_radiobutton);
        if (light2Box.isChecked()) {
            sum = sum +1;
        }

        /**
         * This happens for question no.3.
         */
        RadioButton sugar3Box = (RadioButton) findViewById(R.id.sugar_radiobutton);
        if (sugar3Box.isChecked()) {
            sum = sum +1;
        }

        /**
         * This happens for question no.4.
         */
        CheckBox salt = (CheckBox) findViewById(R.id.salt);
        CheckBox oxygen = (CheckBox) findViewById(R.id.oxygen);
        CheckBox glucose = (CheckBox) findViewById(R.id.glucose);
        boolean saltChecked = salt.isChecked();
        boolean oxygenChecked = oxygen.isChecked();
        boolean glucoseChecked = glucose.isChecked();

        boolean correct = checkCorrectOrIncorrect(saltChecked,
                oxygenChecked, glucoseChecked);

        if (correct) {
            sum = sum + 1;
        }

        /**
         * This happens for question no.5.
         */

        EditText answer5 = (EditText)findViewById(R.id.ans5);
        String answer = answer5.getText().toString().toLowerCase();
        if (answer.contains ("carbondioxide")){
            sum = sum +1;
        }

        /**
         * This happens for question no.6.
         */
        RadioButton ph6Box = (RadioButton) findViewById(R.id.photo_radiobutton);
        if (ph6Box.isChecked()) {
            sum = sum +1;
        }

        /**
         * Displays the quiz result in the Toast message
         */
        Toast.makeText(this, "Thanks for participating! Your score is " + sum + " out of 6.", Toast.LENGTH_LONG).show();

    }

    /**
     * This method checks the values of the checkboxes of question 4 and returns true if they are all correct.
     */
    private boolean checkCorrectOrIncorrect(boolean saltChecked,
                                            boolean oxygenChecked,
                                            boolean glucoseChecked) {

        if (!saltChecked && oxygenChecked && glucoseChecked) {
            return true;
        } else {
            return false;
        }
    }

}
