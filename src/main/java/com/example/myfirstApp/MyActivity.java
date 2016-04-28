package com.example.myfirstApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity
{
	public final static String EXTRA_MESSAGE = "com.example.myfirstApp.MESSAGE";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
		setSupportActionBar(myToolbar);
    }

	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {
			Intent intent = new Intent(this, DisplayMessageActivity.class);
			EditText editText = (EditText) findViewById(R.id.edit_message);
			String message = editText.getText().toString();

			intent.putExtra(EXTRA_MESSAGE, message);
			startActivity(intent);
	}
}
