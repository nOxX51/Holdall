package com.noxx.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class PalindromeManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);
    }

    public String inverse(String word) {
        int length = word.length();
        StringBuffer newString = new StringBuffer("");

        for (int indiceChar = 0; indiceChar < length; indiceChar++) {
            newString.insert(0,word.charAt(indiceChar));
        }
        String s = newString.toString();

        return s;
    }

    public boolean palindrome(String word) {
        int sentenceLength = word.length();
        int indexD = sentenceLength-1;

        for (int indexA = 0; indexA < sentenceLength/2; indexA++) {   // (/2) car on test plus que la moitié du mot;
            indexD = sentenceLength-1-indexA;
            if (word.charAt(indexA)==word.charAt(indexD)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
