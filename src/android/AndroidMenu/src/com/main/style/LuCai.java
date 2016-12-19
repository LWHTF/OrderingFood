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
import com.main.menu.LuCaiMenu;

public class LuCai extends Activity {

	
	//View currentView = null;
	LinearLayout layout;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LayoutInflater inflater = LayoutInflater.from(LuCai.this);
		layout = (LinearLayout) inflater.inflate(R.layout.lucai, null);
		setContentView(layout);
       Gallery gallery = (Gallery) findViewById(R.id.galleryyuecai);
		gallery.setAdapter(new ImageAdapter());
		gallery.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> partent, View v,
					int position, long id) {
				Toast.makeText(LuCai.this, "" + position, Toast.LENGTH_SHORT)
						.show();// TODO Auto-generated method stub

			}
		});
		Gallery gallery2 = (Gallery) findViewById(R.id.galleryyuecai2);
		gallery2.setAdapter(new ImageAdapter2());
		gallery2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> partent, View v,
					int position, long id) {
				Toast.makeText(LuCai.this, "" + position, Toast.LENGTH_SHORT)
						.show();// TODO Auto-generated method stub

			}
		});
		Gallery gallery3 = (Gallery) findViewById(R.id.galleryyuecai3);
		gallery3.setAdapter(new ImageAdapter3());
		gallery3.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> partent, View v,
					int position, long id) {
				Toast.makeText(LuCai.this, "" + position, Toast.LENGTH_SHORT)
						.show();// TODO Auto-generated method stub

			}
		});
		Button lucaibutton=(Button)findViewById(R.id.lucaifanhui);
		lucaibutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(LuCai.this,InitMenuView.class);
				startActivity(i);// TODO Auto-generated method stub
				
			}
		});
		Button lucaixuancai=(Button)findViewById(R.id.lucaixuancai);
		lucaixuancai.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(LuCai.this,LuCaiMenu.class);
				startActivity(i);// TODO Auto-generated method stub
				
			}
		});
	}

	public class ImageAdapter extends BaseAdapter {
		int mGalleryItemBackground;
		private Integer[] yuecai1 = { R.drawable.lushibabaojiayu,
				R.drawable.lushihongshaojiyu, R.drawable.lushihongshaoshuikuyu,
				R.drawable.lushisuanshaonianyu, R.drawable.lushitangchuyu };
		String textyuecai[] = { "蒸鱼", "炸鱼", "鱼片", 
				"鱼生", "卤鱼" };
		
public ImageAdapter() { // mContext=c;
			TypedArray a = obtainStyledAttributes(R.styleable.YueCai);
			mGalleryItemBackground = a.getResourceId(
					R.styleable.YueCai_android_galleryItemBackground, 0);
			a.recycle();
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return yuecai1.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		LayoutInflater viewInflater;

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View galleryLayout;

			if (convertView != null) {
				galleryLayout = (LinearLayout) convertView;
			} else {
				viewInflater = LayoutInflater.from(LuCai.this);
				galleryLayout = (LinearLayout) viewInflater.inflate(
						R.layout.yuecai, null);
			}

			ImageView imageView = (ImageView) galleryLayout
					.findViewById(R.id.yuecai_imageview);
			imageView.setImageResource(yuecai1[position]);
			imageView.setLayoutParams(new LinearLayout.LayoutParams(200, 150));
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setBackgroundResource(mGalleryItemBackground);
			TextView textView = (TextView) galleryLayout
					.findViewById(R.id.yuecai_textview);
			textView.setText(textyuecai[position]);

			return galleryLayout;
		}
	}
	public class ImageAdapter2 extends BaseAdapter {
		int mGalleryItemBackground;
		private Integer[] yuecai2 = { R.drawable.lushixiaqiu,
				R.drawable.lushihuomoxiaochao, R.drawable.lushiluroupian,
				R.drawable.lushishenmianxiaochaorou, R.drawable.lushiyumichaoheimuer };
		String textyuecai2[] = { "鲁式小炒", "鲁式小炒", 
				"鲁式小炒", "鲁式小炒", "鲁式小炒" };
		

		public ImageAdapter2() { // mContext=c;
			TypedArray a = obtainStyledAttributes(R.styleable.YueCai);
			mGalleryItemBackground = a.getResourceId(
					R.styleable.YueCai_android_galleryItemBackground, 0);
			a.recycle();
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return yuecai2.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		LayoutInflater viewInflater;

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View galleryLayout;

			if (convertView != null) {
				galleryLayout = (LinearLayout) convertView;
			} else {
				viewInflater = LayoutInflater.from(LuCai.this);
				galleryLayout = (LinearLayout) viewInflater.inflate(
						R.layout.yuecai, null);
			}

			ImageView imageView = (ImageView) galleryLayout
					.findViewById(R.id.yuecai_imageview);
			imageView.setImageResource(yuecai2[position]);
			imageView.setLayoutParams(new LinearLayout.LayoutParams(200, 150));
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setBackgroundResource(mGalleryItemBackground);
			TextView textView = (TextView) galleryLayout
					.findViewById(R.id.yuecai_textview);
			textView.setText(textyuecai2[position]);

			return galleryLayout;
		}
	}
	public class ImageAdapter3 extends BaseAdapter {
		int mGalleryItemBackground;
		private Integer[] yuecai3 = { R.drawable.lushibasidigua,
				R.drawable.lushibasipingguo, R.drawable.lushichunzhentiandian,
				R.drawable.lushifanqiexiaqiu, R.drawable.lushiruyijuan };
		String textyuecai[] = { "鲁式甜品1" ,"鲁式甜品2", "鲁式甜品3", "鲁式甜品4", "鲁式甜品5" };
		

		public ImageAdapter3() { // mContext=c;
			TypedArray a = obtainStyledAttributes(R.styleable.YueCai);
			mGalleryItemBackground = a.getResourceId(
					R.styleable.YueCai_android_galleryItemBackground, 0);
			a.recycle();
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return yuecai3.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		LayoutInflater viewInflater;

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View galleryLayout;

			if (convertView != null) {
				galleryLayout = (LinearLayout) convertView;
			} else {
				viewInflater = LayoutInflater.from(LuCai.this);
				galleryLayout = (LinearLayout) viewInflater.inflate(
						R.layout.yuecai, null);
			}

			ImageView imageView = (ImageView) galleryLayout
					.findViewById(R.id.yuecai_imageview);
			imageView.setImageResource(yuecai3[position]);
			imageView.setLayoutParams(new LinearLayout.LayoutParams(200, 150));
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setBackgroundResource(mGalleryItemBackground);
			TextView textView = (TextView) galleryLayout
					.findViewById(R.id.yuecai_textview);
			textView.setText(textyuecai[position]);

			return galleryLayout;
		}

}
	}