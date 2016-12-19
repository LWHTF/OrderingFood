package com.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WelcomeActivity extends Activity {
    /** Called when the activity is first created. */
   
    AutoScrollTextView  autoScrollTextView;
    public void onCreate(Bundle savedInstanceState) {
    	this.setTitle("My Work");
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);
        Button button=(Button)this.findViewById(R.id.exit);
        autoScrollTextView = (AutoScrollTextView)this.findViewById(R.id.TextViewNotice);
        autoScrollTextView.init(getWindowManager());
        autoScrollTextView.startScroll();
        button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
		Intent  intent=new Intent(WelcomeActivity.this,InitMenuView.class);
		startActivity(intent);// TODO Auto-generated method stub
			}
		});
    }
}