package com.main.style;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.main.activity.InitMenuView;
import com.main.activity.R;
import com.main.menu.TangMenu;

public class Tangtang extends Activity {

	
	//View currentView = null;
	LinearLayout layout;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LayoutInflater inflater = LayoutInflater.from(Tangtang.this);
		layout = (LinearLayout) inflater.inflate(R.layout.tangs, null);
		setContentView(layout);
       Gallery gallery = (Gallery) findViewById(R.id.gallerytang);
		gallery.setAdapter(new ImageAdapter());
		gallery.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> partent, View v,
					int position, long id) {
				Toast.makeText(Tangtang.this, "" + position, Toast.LENGTH_SHORT)
						.show();// TODO Auto-generated method stub

			}
		});
		
		
		Button tangx1=(Button)findViewById(R.id.tangexitx001);
		tangx1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(Tangtang.this,InitMenuView.class);
				startActivity(i);// TODO Auto-generated method stub
				
			}
		});
		Button tangx2=(Button)findViewById(R.id.tangxuancaix0);
		tangx2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(Tangtang.this,TangMenu.class);
				startActivity(i);// TODO Auto-generated method stub
				
			}
		});
	}

	public class ImageAdapter extends BaseAdapter {
		int mGalleryItemBackground;
		private Integer[] yuecai1 = { R.drawable.tbocaifensi,
				R.drawable.tdongguapaigu, R.drawable.tdongguawanzi,
				 R.drawable.tpaigudoufu
				,R.drawable.tqingdungezi};
		String textyuecai[] = { "青菜汤1", "肉汤1", "青菜汤2",  "肉汤2"
				, "青菜汤3"};
		
public ImageAdapter() { // mContext=c;
			TypedArray a = obtainStyledAttributes(R.styleable.YueCai);
			mGalleryItemBackground = a.getResourceId(
					R.styleable.YueCai_android_galleryItemBackground, 0);
			a.recycle();
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return Integer.MAX_VALUE;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return yuecai1[position%yuecai1.length];
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position%yuecai1.length;
		}

		LayoutInflater viewInflater;

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View galleryLayout;

			if (convertView != null) {
				galleryLayout = (LinearLayout) convertView;
			} else {
				viewInflater = LayoutInflater.from(Tangtang.this);
				galleryLayout = (LinearLayout) viewInflater.inflate(
						R.layout.yuecai, null);
			}

			ImageView imageView = (ImageView) galleryLayout
					.findViewById(R.id.yuecai_imageview);
			imageView.setImageResource(yuecai1[position%yuecai1.length]);
			imageView.setLayoutParams(new LinearLayout.LayoutParams(200, 150));
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setBackgroundResource(mGalleryItemBackground);
			TextView textView = (TextView) galleryLayout
					.findViewById(R.id.yuecai_textview);
			textView.setText(textyuecai[position%yuecai1.length]);

			return galleryLayout;
		}
	}
	

}
