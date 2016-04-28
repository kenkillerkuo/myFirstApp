package com.example.myfirstApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

		Intent intent = getIntent();
		String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);

		setContentView(textView);
    }

}
