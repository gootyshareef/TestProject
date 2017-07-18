package com.example.text.testproject.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.text.testproject.Model.viewPager;
import com.example.text.testproject.R;

import java.util.List;

/**
 * Created by btplws012 on 17/7/17.
 */

public class viewPagerAdapter extends PagerAdapter {
    Context context;
    List<viewPager> viewPagerList;
    LayoutInflater layoutInflater;


    public viewPagerAdapter(Context context,List<viewPager> viewPagerList){
        this.context = context;
        this.viewPagerList = viewPagerList;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return viewPagerList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = layoutInflater.inflate(R.layout.pager_layout, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        TextView name = (TextView)itemView.findViewById(R.id.textView6);
        TextView subname = (TextView)itemView.findViewById(R.id.textView7);
        viewPager viewPager = viewPagerList.get(position);
        imageView.setImageResource(viewPager.getImage());
        name.setText(viewPager.getName());
        subname.setText(viewPager.getSubname());

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
