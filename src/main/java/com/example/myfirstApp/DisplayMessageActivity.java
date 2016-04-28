package com.example.myfirstApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.display_message);

			Intent intent = getIntent();
			String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

			TextView textView = (TextView) findViewById(R.id.message);
			textView.setTextSize(40);
			textView.setText(message);

			Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
			setSupportActionBar(myToolbar);

			//Enable the Up Button
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
