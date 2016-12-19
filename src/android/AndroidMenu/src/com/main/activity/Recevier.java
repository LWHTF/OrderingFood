package com.main.activity;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.main.db.DBHelper;

public class Recevier extends Activity {
    
	/** Called when the activity is first created. */
	 Cursor c;
  public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
      //  li=(ListView)findViewById(R.id.list1);
        
      //类似CheckBox的AlertDialog
      //用setMultiChoiceItems(CharSequence[] items, boolean[] checkedItems, final OnMultiChoiceClickListener listener)
      //方法来实现类似CheckBox的AlertDialog
      //第一个参数是要显示的数据的数组，第二个参数是选中状态的数组，第三个参数是点击某个item的触发事件
       final DBHelper helpter = new DBHelper(this);
               c = helpter.query();  
               String[] from = { "_id", "name", "url","desc" };  
              int[] to = { R.id.TextView1, R.id.TextView2, R.id.TextView3, R.id.TextView4};  
                SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,  
                     R.layout.list, c, from, to);  
               ListView listView = (ListView) findViewById(R.id.list1);  
             listView.setAdapter(adapter); 
             ImageButton delete=(ImageButton)findViewById(R.id.x0delete);
            delete.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					c.close();// TODO Auto-generated method stub
					helpter.clean();
					
				}
			});
            ImageButton resset=(ImageButton)findViewById(R.id.x0reset);
            resset.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent intent=new Intent(Recevier.this,InitMenuView.class);		// TODO Auto-generated method stub
					startActivity(intent);
					// TODO Auto-generated method stub
					
					
				}
			});
             final AlertDialog.Builder builder = new AlertDialog.Builder(this);  
                     listView.setOnItemClickListener(new OnItemClickListener() {  
                        @Override  
                         public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,  
                                 long arg3) {  
                             final long temp = arg3;  
                            builder.setMessage("��Ҫ�����������").setPositiveButton("��",  
                                    new DialogInterface.OnClickListener() {  
                                        public void onClick(DialogInterface dialog,  
                                                int which) {  
                                           helpter.del((int)temp);  
                                           c = helpter.query();  
                                          String[] from = { "_id", "name", "url", "desc" };  
                                           int[] to = { R.id.TextView1, R.id.TextView2, R.id.TextView3, R.id.TextView4 };  
                                           SimpleCursorAdapter adapter = new SimpleCursorAdapter(getApplicationContext(),  
                                                   R.layout.list, c, from, to);  
                                           ListView listView = (ListView) findViewById(R.id.list1);   
                                           listView.setAdapter(adapter);  
                                        }  
                                   }).setNegativeButton("��",  
                                    new DialogInterface.OnClickListener() {  
                                       public void onClick(DialogInterface dialog,  
                                               int which) {  
                                             
                                      }  
                                    });  
                            AlertDialog ad = builder.create();  
                           ad.show();  
                        }  
                    });  

             
               helpter.close();  
               
              }
    }
