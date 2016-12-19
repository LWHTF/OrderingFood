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


public class YueCaiMenu extends Activity {
    /**
     * Called when the activity is first created.
     */
    TextView t1, t2, t3, t4, t5, t6, t7, t8, a1, a2, a3, a4, a5, a6, a7, a8;
    EditText e1, e2, e3, e4, e5, e6, e7, e8;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    int py = 0, py1 = 0, py3 = 0, py4 = 0, py5 = 0, py6 = 0, py7 = 0, py8 = 0, py2 = 0;
    EditText txyue;
    boolean ax0 = true, ax1 = true, ax2 = true, ax3 = true, ax4 = true, ax5 = true, ax6 = true, ax7 = true;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yuecaimenu);
        Button button1 = (Button) findViewById(R.id.yuecaidiancanfanhui);
        txyue = (EditText) findViewById(R.id.yuecaixiaofeijine);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(YueCaiMenu.this, InitMenuView.class);
                startActivity(i);// TODO Auto-generated method stub
            }
        });


        Button yuecaidiancan = (Button) findViewById(R.id.yuecaidiancan);
        yuecaidiancan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                py = py1 + py2 + py3 + py4 + py5 + py6 + py7 + py8;
                String h0 = py + "";

                txyue.setText(h0 + "Ԫ");

            }
        });
        t1 = (TextView) findViewById(R.id.textzhengluyu);
        t2 = (TextView) findViewById(R.id.textjuluyu);
        t3 = (TextView) findViewById(R.id.texthsjy);
        t4 = (TextView) findViewById(R.id.texthuadanniurou);
        t5 = (TextView) findViewById(R.id.textganchaoniuhe);
        t6 = (TextView) findViewById(R.id.textbingpiyuebing);
        t7 = (TextView) findViewById(R.id.textfenghuangqiu);
        t8 = (TextView) findViewById(R.id.textcongyoubing);
        a1 = (TextView) findViewById(R.id.text36);
        a2 = (TextView) findViewById(R.id.text48);
        a3 = (TextView) findViewById(R.id.text88);
        a4 = (TextView) findViewById(R.id.text58);
        a5 = (TextView) findViewById(R.id.text33);
        a6 = (TextView) findViewById(R.id.text15);
        a7 = (TextView) findViewById(R.id.text20);
        a8 = (TextView) findViewById(R.id.text8);
        e1 = (EditText) findViewById(R.id.editzhenluyu);
        e2 = (EditText) findViewById(R.id.editjuluyu);
        e3 = (EditText) findViewById(R.id.edithsjy);
        e4 = (EditText) findViewById(R.id.edithuadanniurou);
        e5 = (EditText) findViewById(R.id.editganchaoniuhe);
        e6 = (EditText) findViewById(R.id.editbipiyuebing);
        e7 = (EditText) findViewById(R.id.editfenghuangqiu);
        e8 = (EditText) findViewById(R.id.editcongyoubing);
        c1 = (CheckBox) findViewById(R.id.checkzhengluyu);
        c2 = (CheckBox) findViewById(R.id.checkjuluyu);
        c3 = (CheckBox) findViewById(R.id.checkhsjy);
        c4 = (CheckBox) findViewById(R.id.checkhuadanniurou);
        c5 = (CheckBox) findViewById(R.id.checkganchaoniuhe);
        c6 = (CheckBox) findViewById(R.id.checkbingpiyuebing);
        c7 = (CheckBox) findViewById(R.id.checkfenghuangqiu);
        c8 = (CheckBox) findViewById(R.id.checkcongyoubing);
        c1.setOnCheckedChangeListener(listener);
        c2.setOnCheckedChangeListener(listener);
        c3.setOnCheckedChangeListener(listener);
        c4.setOnCheckedChangeListener(listener);
        c5.setOnCheckedChangeListener(listener);
        c6.setOnCheckedChangeListener(listener);
        c7.setOnCheckedChangeListener(listener);
        c8.setOnCheckedChangeListener(listener);
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
            if (c6.isChecked() == true && ax5 == true) {
                ax5 = false;
                String s6 = t6.getText().toString();
                String ss6 = a6.getText().toString();
                String sss6 = e6.getText().toString();
                int yh1 = Integer.valueOf(ss6);
                int yh2 = Integer.valueOf(sss6);
                int yh3 = yh1 * yh2;
                py6 = yh3;

                ContentValues values = new ContentValues();
                values.put("name", s6);
                values.put("url", ss6 + "Ԫ" + "             ");
                values.put("desc", sss6 + "��");
                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();


            }
            if (c6.isChecked() != true && ax5 != true) {
                ax5 = true;
            }
            if (c7.isChecked() == true && ax6 == true) {
                ax6 = false;
                String s7 = t7.getText().toString();
                String ss7 = a7.getText().toString();
                String sss7 = e7.getText().toString();
                int yh1 = Integer.valueOf(ss7);
                int yh2 = Integer.valueOf(sss7);
                int yh3 = yh1 * yh2;
                py7 = yh3;

                ContentValues values = new ContentValues();
                values.put("name", s7);
                values.put("url", ss7 + "Ԫ" + "             ");
                values.put("desc", sss7 + "��");
                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();


            }
            if (c7.isChecked() != true && ax6 != true) {
                ax6 = true;
            }
            if (c8.isChecked() == true && ax7 == true) {
                ax7 = false;
                String s8 = t8.getText().toString();
                String ss8 = a8.getText().toString();
                String sss8 = e8.getText().toString();
                int yh1 = Integer.valueOf(ss8);
                int yh2 = Integer.valueOf(sss8);
                int yh3 = yh1 * yh2;
                py8 = yh3;

                ContentValues values = new ContentValues();
                values.put("name", s8);
                values.put("url", ss8 + "Ԫ" + "             ");
                values.put("desc", sss8 + "��");
                DBHelper helper = new DBHelper(getApplicationContext());
                helper.insert(values);
                helper.close();


            }
            if (c8.isChecked() != true && ax7 != true) {
                ax7 = true;
            }

        }
    };
}