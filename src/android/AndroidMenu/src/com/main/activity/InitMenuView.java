package com.main.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.main.style.ChCai;
import com.main.style.GuoZai;
import com.main.style.JiuShui;
import com.main.style.LuCai;
import com.main.style.Tangtang;
import com.main.style.YueCai;

public class InitMenuView extends Activity {
    /** Called when the activity is first created. */
    @Override
    //¼àÌý
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waiter);
        Button back=(Button) findViewById(R.id.back);
        Button yuecai=(Button) findViewById(R.id.yucai);
        Button lucai=(Button)findViewById(R.id.lucai);
        Button chuancai=(Button)findViewById(R.id.chuancai);
        Button guozai=(Button)findViewById(R.id.guozai);
        Button tang=(Button)findViewById(R.id.tang);
        Button jiushui=(Button)findViewById(R.id.jiushui);
        Button returnfirst=(Button)findViewById(R.id.returnfirst);
        returnfirst.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,WelcomeActivity.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
guozai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,GuoZai.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
tang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,Tangtang.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
jiushui.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,JiuShui.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
       
   chuancai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,ChCai.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
        lucai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,LuCai.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
yuecai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,YueCai.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
        back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		Intent intent=new Intent(InitMenuView.this,Recevier.class);		// TODO Auto-generated method stub
				startActivity(intent);
			}
		});
    }
}