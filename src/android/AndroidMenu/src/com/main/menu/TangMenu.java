package com.main.menu;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.main.activity.InitMenuView;
import com.main.activity.R;
import com.main.db.DBHelper;

public class TangMenu extends Activity {
    TextView t1, t2, t3, t4, t5, a1, a2, a3, a4, a5;
    EditText e1, e2, e3, e4, e5;
    CheckBox c1, c2, c3, c4, c5;
    int py = 0, py1 = 0, py3 = 0, py4 = 0, py5 = 0, py6 = 0, py7 = 0, py8 = 0, py2 = 0;
    EditText txtang;
    boolean ax0 = true, ax1 = true, ax2 = true, ax3 = true, ax4 = true, ax5 = true, ax6 = true, ax7 = true;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tangmenu);
        Button tangexit = (Button) findViewById(R.id.tangexitx1);
        Button tangxiaofei = (Button) findViewById(R.id.tangdiancanx0);
        txtang = (EditText) findViewById(R.id.tangxiaofeijine);
        tangexit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TangMenu.this, InitMenuView.class);
                startActivity(intent);// TODO Auto-generated method stub
            }
        });
        tangxiaofei.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                py = py1 + py2 + py3 + py4 + py5 + py6 + py7 + py8;
                String h0 = py + "";
                txtang.setText(h0 + "Ԫ");
            }
        });
        t1 = (TextView) findViewById(R.id.textbocaifensi);
        t2 = (TextView) findViewById(R.id.textdongguapaigu);
        t3 = (TextView) findViewById(R.id.textdongguawanzi);
        t4 = (TextView) findViewById(R.id.textpaigudoufu);
        t5 = (TextView) findViewById(R.id.textqingdungezi);
        a1 = (TextView) findViewById(R.id.texttbocaifensi33);
        a2 = (TextView) findViewById(R.id.textdongguapaigu50);
        a3 = (TextView) findViewById(R.id.textdongguawanzi40);
        a4 = (TextView) findViewById(R.id.textpaigudoufu56);
        a5 = (TextView) findViewById(R.id.textqingdungezi66);
        e1 = (EditText) findViewById(R.id.editbocaifensi);
        e2 = (EditText) findViewById(R.id.editdongguapaigu);
        e3 = (EditText) findViewById(R.id.editdongguawanzi);
        e4 = (EditText) findViewById(R.id.editpaigudoufu);
        e5 = (EditText) findViewById(R.id.editqingdungezi);
        c1 = (CheckBox) findViewById(R.id.checkbocaifensi);
        c2 = (CheckBox) findViewById(R.id.checkdongguapaigu);
        c3 = (CheckBox) findViewById(R.id.checkdongguawanzi);
        c4 = (CheckBox) findViewById(R.id.checkpaigudoufu);
        c5 = (CheckBox) findViewById(R.id.checkqingdungezi);
        c1.setOnCheckedChangeListener(listener);
        c2.setOnCheckedChangeListener(listener);
        c3.setOnCheckedChangeListener(listener);
        c4.setOnCheckedChangeListener(listener);
        c5.setOnCheckedChangeListener(listener);
    }

    private CheckBox.OnCheckedChangeListener listener = new CheckBox.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (c1.isChecked() == true && ax0 == true) {
                ax0 = false;
                String s1 = t1.getText().toString();
                String s2 = a1.getText().toString();
                String s3 = e1.getText().toString();
                int yh1 = Integer.valueOf(s2);
                int yh2 = Integer.valueOf(s3);
                int yh3 = yh1 * yh2;
                py1 = yh3;
                ContentValues values = new ContentValues();
                values.put("name", s1);
                values.put("url", s2 + "Ԫ" + "             ");
                values.put("desc", s3 + "��");

                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();
            }
            if (c1.isChecked() != true && ax0 != true) {
                ax0 = true;
            }
            if (c2.isChecked() == true && ax1 == true) {
                ax1 = false;
                String ss1 = t2.getText().toString();
                String ss2 = a2.getText().toString();
                String ss3 = e2.getText().toString();
                int yh1 = Integer.valueOf(ss2);
                int yh2 = Integer.valueOf(ss3);
                int yh3 = yh1 * yh2;
                py2 = yh3;
                ContentValues values = new ContentValues();
                values.put("name", ss1);
                values.put("url", ss2 + "Ԫ" + "             ");
                values.put("desc", ss3 + "��");
                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();
            }
            if (c2.isChecked() != true && ax1 != true) {
                ax1 = true;
            }
            if (c3.isChecked() == true && ax2 == true) {
                ax2 = false;
                String sss1 = t3.getText().toString();
                String sss2 = a3.getText().toString();
                String sss3 = e3.getText().toString();
                int yh1 = Integer.valueOf(sss2);
                int yh2 = Integer.valueOf(sss3);
                int yh3 = yh1 * yh2;
                py3 = yh3;
                ContentValues values = new ContentValues();
                values.put("name", sss1);
                values.put("url", sss2 + "Ԫ" + "             ");
                values.put("desc", sss3 + "��");
                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();
            }
            if (c3.isChecked() != true && ax2 != true) {
                ax2 = true;
            }
            if (c4.isChecked() == true && ax3 == true) {
                ax3 = false;
                String ssss1 = t4.getText().toString();
                String ssss2 = a4.getText().toString();
                String ssss3 = e4.getText().toString();
                int yh1 = Integer.valueOf(ssss2);
                int yh2 = Integer.valueOf(ssss3);
                int yh3 = yh1 * yh2;
                py4 = yh3;
                ContentValues values = new ContentValues();
                values.put("name", ssss1);
                values.put("url", ssss2 + "Ԫ" + "             ");
                values.put("desc", ssss3 + "��");
                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();
            }
            if (c4.isChecked() != true && ax3 != true) {
                ax3 = true;
            }
            if (c5.isChecked() == true && ax4 == true) {
                ax4 = false;
                String sssss1 = t5.getText().toString();
                String sssss2 = a5.getText().toString();
                String sssss3 = e5.getText().toString();
                int yh1 = Integer.valueOf(sssss2);
                int yh2 = Integer.valueOf(sssss3);
                int yh3 = yh1 * yh2;
                py5 = yh3;
                ContentValues values = new ContentValues();
                values.put("name", sssss1);
                values.put("url", sssss2 + "Ԫ" + "             ");
                values.put("desc", sssss3 + "��");
                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();
            }
            if (c5.isChecked() != true && ax4 != true) {
                ax4 = true;
            }
        }
    };
}


