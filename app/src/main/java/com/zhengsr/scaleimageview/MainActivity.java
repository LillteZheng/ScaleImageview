package com.zhengsr.scaleimageview;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhengsr.mylibrary.ScaleImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private int[] mRes = new int[]{
            R.mipmap.a1,R.mipmap.a2,R.mipmap.a3
    };
    private List<View> mViews = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);

        for (int i = 0; i < mRes.length; i++) {
            ScaleImageView view = (ScaleImageView) LayoutInflater.from(this).inflate(R.layout.item_scaleview,null);
            view.setImageResource(mRes[i]);
            mViews.add(view);
        }
        viewPager.setAdapter(new ImageAdapter());
    }


    class ImageAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return mViews.size();
        }
        @Override
        // 每次滑动时销毁当前组件
        public void destroyItem(ViewGroup container, int position, Object object) {
            //super.destroyItem(container, position, object);
            container.removeView(mViews.get(position));
        }
        // 每次滑动时，创建当前组件
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(mViews.get(position));
            return mViews.get(position);
        }


        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view==o;
        }
    }
}
