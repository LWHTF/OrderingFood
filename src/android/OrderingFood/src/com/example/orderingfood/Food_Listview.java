package com.example.orderingfood;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Food_Listview extends Activity{
	ListView lvListView;
	String string;
	String[] strs = new String[] { "中国菜", "泰国菜", "韩国菜", "法国菜", "日本寿司" };// 定义一个String数组用来显示ListView的内容
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food_listview);
		
		lvListView = (ListView) findViewById(R.id.listView1);
		lvListView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, strs));
		lvListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				string = lvListView.getItemAtPosition(position).toString();
				if (string == "中国菜") {
					LayoutInflater inflater = getLayoutInflater();
					View layout = inflater.inflate(R.layout.chinafood,
							(ViewGroup) findViewById(R.id.china));
					TextView text = (TextView) layout
							.findViewById(R.id.chinafood1);
					text.setText("中国菜样");
					Toast toast = new Toast(getApplicationContext());
					toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
					toast.setDuration(Toast.LENGTH_LONG);
					toast.setView(layout);

					toast.show();
				}
				
				  else if(string=="泰国菜"){ LayoutInflater
				  inflater=getLayoutInflater(); View
				  layout=inflater.inflate(R.layout.taiguofood,
				  (ViewGroup)findViewById(R.id.taiguo)); TextView
				  text=(TextView)layout.findViewById(R.id.taiguofood1);
				  text.setText("泰国菜样"); Toast toast=new
				  Toast(getApplicationContext());
				  toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
				  toast.setDuration(Toast.LENGTH_LONG); toast.setView(layout);
				  
				  toast.show();
				  
				  }
				  else if(string=="韩国菜"){ LayoutInflater
				  inflater=getLayoutInflater(); View
				  layout=inflater.inflate(R.layout.hanguofood,
				  (ViewGroup)findViewById(R.id.hanguo)); TextView
				  text=(TextView)layout.findViewById(R.id.hanguofood1);
				  text.setText("韩国菜样"); Toast toast=new
				  Toast(getApplicationContext());
				  toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
				  toast.setDuration(Toast.LENGTH_LONG); toast.setView(layout);
				  
				  toast.show();
				  
				  } else if(string=="法国菜"){ LayoutInflater
				  inflater=getLayoutInflater(); View
				  layout=inflater.inflate(R.layout.faguofood,
				  (ViewGroup)findViewById(R.id.faguo)); TextView
				  text=(TextView)layout.findViewById(R.id.faguofood1);
				  text.setText("法国西餐"); Toast toast=new
				  Toast(getApplicationContext());
				  toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
				  toast.setDuration(Toast.LENGTH_LONG); toast.setView(layout);
				  
				  toast.show();
				  
				  } else if(string=="日本寿司"){ LayoutInflater
				  inflater=getLayoutInflater(); View
				  layout=inflater.inflate(R.layout.ribenfood,
				  (ViewGroup)findViewById(R.id.riben)); TextView
				  text=(TextView)layout.findViewById(R.id.ribenfood1);
				  text.setText("日本寿司"); Toast toast=new
				  Toast(getApplicationContext());
				  toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
				  toast.setDuration(Toast.LENGTH_LONG); toast.setView(layout);
				  
				  toast.show();
				  
				  }			
			}
		});

}
	 public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }

}
