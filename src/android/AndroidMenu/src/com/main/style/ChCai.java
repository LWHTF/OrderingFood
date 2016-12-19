package com.main.style;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.main.activity.InitMenuView;
import com.main.activity.R;
import com.main.menu.ChuanCaiMenu;
public class ChCai extends Activity {
LinearLayout layout1;
View currentView1;
public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LayoutInflater inflater = LayoutInflater.from(ChCai.this);
		layout1 = (LinearLayout) inflater.inflate(R.layout.chcai, null);
		currentView1=inflater.inflate(R.layout.welcome, null);
		currentView1.setLayoutParams(
				new LayoutParams(LayoutParams.FILL_PARENT,
						LayoutParams.FILL_PARENT)
				);
		layout1.addView(currentView1);
		setContentView(layout1);
       Gallery gallery = (Gallery) findViewById(R.id.galleryyuecai);
		gallery.setAdapter(new ImageAdapter());
		gallery.setOnItemClickListener(new OnItemClickListener()
		{
      public void onItemClick(AdapterView<?> partent, View v,
					int position, long id) {
    	  Toast.makeText(ChCai.this, ""+id, Toast.LENGTH_SHORT).show();
    	  switch ((int)id) {
			case 0:
			{
				layout1.removeView(currentView1);
				LayoutInflater inflater=
						LayoutInflater.from(ChCai.this);
				
				currentView1=inflater
						.inflate(R.layout.chcai2, null);
				currentView1.setLayoutParams(
						new LayoutParams(LayoutParams.FILL_PARENT,
								LayoutParams.FILL_PARENT)
						);
				currentView1.setPadding(2, 100, 50, 0);
				layout1.addView(currentView1);
				ImageButton afangfa=(ImageButton)currentView1.findViewById(R.id.afangda);
				ImageButton axuanzhuan=(ImageButton)currentView1.findViewById(R.id.asuoxiao);
				Button chuancaixuancaibutton=(Button)findViewById(R.id.chuancaixuancai);
				chuancaixuancaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,ChuanCaiMenu.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				Button chuancaicaibutton=(Button)findViewById(R.id.chuancaiexit1);
				chuancaicaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,InitMenuView.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				final ImageView aimage=(ImageView)currentView1.findViewById(R.id.aimage);
				afangfa.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation scale=new ScaleAnimation(2f,2f,2f,2f, Animation.ABSOLUTE,10f,Animation.ABSOLUTE,10f);
						scale.setDuration(5000);
						aimage.startAnimation(scale);
						// TODO Auto-generated method stub
						
					}
				});
				axuanzhuan.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation roatscale=new RotateAnimation(0f, +360f,  Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
						roatscale.setDuration(5000);
						aimage.startAnimation(roatscale);
						// TODO Auto-generated method stub
						
					}
				});
				
				break;
			}
			case 1:
				{layout1.removeView(currentView1);
				LayoutInflater inflater=
						LayoutInflater.from(ChCai.this);
				
				currentView1=inflater
						.inflate(R.layout.chcai3, null);
				currentView1.setLayoutParams(
						new LayoutParams(LayoutParams.FILL_PARENT,
								LayoutParams.FILL_PARENT)
						);
				currentView1.setPadding(2, 100, 50, 0);
				layout1.addView(currentView1);
				ImageButton bfangfa=(ImageButton)currentView1.findViewById(R.id.bfangda);
				ImageButton bxuanzhuan=(ImageButton)currentView1.findViewById(R.id.bsuoxiao);
				Button chuancaixuancaibutton=(Button)findViewById(R.id.chuancaixuancai);
				chuancaixuancaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,ChuanCaiMenu.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				Button chuancaicaibutton=(Button)findViewById(R.id.chuancaiexit1);
				chuancaicaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,InitMenuView.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				final ImageView bimage=(ImageView)currentView1.findViewById(R.id.bimage);
				bfangfa.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation scale=new ScaleAnimation(2f,2f,2f,2f, Animation.ABSOLUTE,10f,Animation.ABSOLUTE,10f);
						scale.setDuration(5000);
						bimage.startAnimation(scale);
						// TODO Auto-generated method stub
						
					}
				});
				bxuanzhuan.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation roatscale=new RotateAnimation(0f, +360f,  Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
						roatscale.setDuration(5000);
						bimage.startAnimation(roatscale);
						// TODO Auto-generated method stub
						
					}
				});
				break;
				}case 2:
				{layout1.removeView(currentView1);
				LayoutInflater inflater=
						LayoutInflater.from(ChCai.this);
				
				currentView1=inflater
						.inflate(R.layout.chcai4, null);
				currentView1.setLayoutParams(
						new LayoutParams(LayoutParams.FILL_PARENT,
								LayoutParams.FILL_PARENT)
						);
				currentView1.setPadding(2, 100, 50, 0);
				layout1.addView(currentView1);
				ImageButton cfangfa=(ImageButton)currentView1.findViewById(R.id.cfangda);
				ImageButton cxuanzhuan=(ImageButton)currentView1.findViewById(R.id.csuoxiao);
				Button chuancaixuancaibutton=(Button)findViewById(R.id.chuancaixuancai);
				chuancaixuancaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,ChuanCaiMenu.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				Button chuancaicaibutton=(Button)findViewById(R.id.chuancaiexit1);
				chuancaicaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,InitMenuView.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				final ImageView cimage=(ImageView)currentView1.findViewById(R.id.cimage);
				cfangfa.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation scale=new ScaleAnimation(2f,2f,2f,2f, Animation.ABSOLUTE,10f,Animation.ABSOLUTE,10f);
						scale.setDuration(5000);
						cimage.startAnimation(scale);
						// TODO Auto-generated method stub
						
					}
				});
				cxuanzhuan.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation roatscale=new RotateAnimation(0f, +360f,  Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
						roatscale.setDuration(5000);
						cimage.startAnimation(roatscale);
						// TODO Auto-generated method stub
						
					}
				});
				break;
				}
				case 3:
				{layout1.removeView(currentView1);
				LayoutInflater inflater=
						LayoutInflater.from(ChCai.this);
				
				currentView1=inflater
						.inflate(R.layout.chcai5, null);
				currentView1.setLayoutParams(
						new LayoutParams(LayoutParams.FILL_PARENT,
								LayoutParams.FILL_PARENT)
						);
				currentView1.setPadding(2, 100, 50, 0);
				layout1.addView(currentView1);
				ImageButton dfangfa=(ImageButton)currentView1.findViewById(R.id.dfangda);
				ImageButton dxuanzhuan=(ImageButton)currentView1.findViewById(R.id.dsuoxiao);
				Button chuancaixuancaibutton=(Button)findViewById(R.id.chuancaixuancai);
				chuancaixuancaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,ChuanCaiMenu.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				Button chuancaicaibutton=(Button)findViewById(R.id.chuancaiexit1);
				chuancaicaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,InitMenuView.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				final ImageView dimage=(ImageView)currentView1.findViewById(R.id.dimage);
				dfangfa.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation scale=new ScaleAnimation(2f,2f,2f,2f, Animation.ABSOLUTE,10f,Animation.ABSOLUTE,10f);
						scale.setDuration(5000);
						dimage.startAnimation(scale);
						// TODO Auto-generated method stub
						
					}
				});
				dxuanzhuan.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation roatscale=new RotateAnimation(0f, +360f,  Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
						roatscale.setDuration(5000);
						dimage.startAnimation(roatscale);
						// TODO Auto-generated method stub
						
					}
				});
				break;
				}
				case 4:
				{layout1.removeView(currentView1);
				LayoutInflater inflater=
						LayoutInflater.from(ChCai.this);
				
				currentView1=inflater
						.inflate(R.layout.chcai6, null);
				currentView1.setLayoutParams(
						new LayoutParams(LayoutParams.FILL_PARENT,
								LayoutParams.FILL_PARENT)
						);
				currentView1.setPadding(2, 100, 50, 0);
				layout1.addView(currentView1);
				ImageButton efangfa=(ImageButton)currentView1.findViewById(R.id.efangda);
				ImageButton exuanzhuan=(ImageButton)currentView1.findViewById(R.id.esuoxiao);
				Button chuancaixuancaibutton=(Button)findViewById(R.id.chuancaixuancai);
				chuancaixuancaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,ChuanCaiMenu.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				Button chuancaicaibutton=(Button)findViewById(R.id.chuancaiexit1);
				chuancaicaibutton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent i=new Intent(ChCai.this,InitMenuView.class);
						startActivity(i);// TODO Auto-generated method stub
						
					}
				});
				final ImageView eimage=(ImageView)currentView1.findViewById(R.id.eimage);
				efangfa.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation scale=new ScaleAnimation(2f,2f,2f,2f, Animation.ABSOLUTE,10f,Animation.ABSOLUTE,10f);
						scale.setDuration(5000);
						eimage.startAnimation(scale);
						// TODO Auto-generated method stub
						
					}
				});
				exuanzhuan.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Animation roatscale=new RotateAnimation(0f, +360f,  Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
						roatscale.setDuration(5000);
						eimage.startAnimation(roatscale);
						// TODO Auto-generated method stub
						}
				});
				break;
				}

			default:
				break;
			}
      }
      });
		}

	public class ImageAdapter extends BaseAdapter {
		int mGalleryItemBackground;
		private Integer[] yuecai1 = { R.drawable.cxiandanhuangguoba,
				R.drawable.csuirouwandou, R.drawable.cmapodoufuxie,
				R.drawable.cmaoxuewang, R.drawable.clongchaoshou };
		String textyuecai[] = { "川菜小炒", "辣椒炒豆", "蟹肉", 
				"川式辣椒煲", "水饺" };
		
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
		LayoutInflater inflater;

		public View getView(int position, View convertView, ViewGroup parent) {
			LinearLayout view=null;
			if(convertView!=null){
				view=(LinearLayout)convertView;
			}else{
			inflater = LayoutInflater.from(ChCai.this);
			view = (LinearLayout) inflater.inflate(
					R.layout.yuecai, null);
			}
			ImageView imageView = (ImageView) view
					.findViewById(R.id.yuecai_imageview);
			Resources res = getResources();
			Drawable drawable = res.getDrawable(yuecai1[position%yuecai1.length]);
			imageView.setLayoutParams(new LinearLayout.LayoutParams(200, 150));
			imageView.setScaleType(ScaleType.FIT_XY);
			imageView.setImageDrawable(drawable);
			imageView.setBackgroundResource(mGalleryItemBackground);
			TextView textView=(TextView)view.findViewById(R.id.yuecai_textview);
			textView.setText(textyuecai[position%yuecai1.length]);
			
			return view;

            }
		}
	}
	