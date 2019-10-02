package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapterLV extends AppCompatActivity {

    private ListView ba_main;
    private List<ShopInfo> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);

        ba_main=findViewById(R.id.ba_main);

        //准备集合数据
        data=new ArrayList<ShopInfo>();
        for(int i=0;i<4;i++) {
            data.add(new ShopInfo(R.mipmap.v1, "name--1", "content--1"));
            data.add(new ShopInfo(R.mipmap.v12, "name--12", "content--12"));
            data.add(new ShopInfo(R.mipmap.v15, "name--15", "content--15"));
            data.add(new ShopInfo(R.mipmap.v4, "name--4", "content--4"));
        }
        //准备BaseAdapter对象
        MyAdapter adapter = new MyAdapter();
        //设置Adapter显示列表
        ba_main.setAdapter(adapter);

    }
    class MyAdapter extends BaseAdapter{//BaseAdapter是抽象类

        //返回集合数据的数量
        @Override
        public int getCount() {
            return data.size();
        }

        //返回指定下标对应的数据对象
        @Override
        public Object getItem(int i) {
            return data.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }


        //返回指定下表所对应的item的View对象
        //i:下标,前n+1个可能为空,可能复用，需要缓存
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
           //如果没有复用
            if(view==null) {
                //加载item的布局
                view = View.inflate(BaseAdapterLV.this, R.layout.item_simple_adapter, null);
            }
            //根据position设置对应的数据
                //得到当前行的数据对象
            ShopInfo shopInfo=data.get(i);
                //得到子View对象
            ImageView imageView=view.findViewById(R.id.iv_icon);
            TextView nameTv=view.findViewById(R.id.tv_name);
            TextView contentTv=view.findViewById(R.id.tv_content);
                //设置数据
            imageView.setImageResource(shopInfo.getIcon());
            nameTv.setText(shopInfo.getName());
            contentTv.setText(shopInfo.getContent());
            return view;
        }
    }
}
