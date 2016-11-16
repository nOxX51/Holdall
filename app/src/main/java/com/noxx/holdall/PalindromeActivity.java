package com.noxx.holdall;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by HB on 16/11/2016.
 */

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final EditText textField = (EditText) findViewById(R.id.text_field);
        final TextView textView = (TextView) findViewById(R.id.text_view);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PalindromeManager p = new PalindromeManager();
                textView.setText(p.inverse(textField.getText().toString()));
                if(p.palindrome(textField.getText().toString())) {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(android.R.color.holo_green_dark)));
                } else {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(android.R.color.holo_red_dark)));
                }
            }
        });

    }
}
