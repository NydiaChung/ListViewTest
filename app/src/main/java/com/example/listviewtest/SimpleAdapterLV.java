package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterLV extends AppCompatActivity {

    private ListView sp_main;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);

        sp_main = findViewById(R.id.sp_main);
        //准备数据集合
        List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
        for (int i=0;i<3;i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("icon", R.mipmap.v1);
            map.put("name", "name--1");
            map.put("Content", "content--1");
            data.add(map);
            map = new HashMap<String, Object>();
            map.put("icon", R.mipmap.v2);
            map.put("name", "name--2");
            map.put("Content", "content--2");
            data.add(map);

            map = new HashMap<String, Object>();
            map.put("icon", R.mipmap.v4);
            map.put("name", "name--4");
            map.put("Content", "content--4");
            data.add(map);
            map = new HashMap<String, Object>();
            map.put("icon", R.mipmap.v5);
            map.put("name", "name--5");
            map.put("Content", "content--5");
            data.add(map);

            map = new HashMap<String, Object>();
            map.put("icon", R.mipmap.v7);
            map.put("name", "name--7");
            map.put("Content", "content--7");
            data.add(map);


            map = new HashMap<String, Object>();
            map.put("icon", R.mipmap.v12);
            map.put("name", "name--12");
            map.put("Content", "content--12");
            data.add(map);
        }
        //from:map对象中key的数组，用于得到相应的value
        String[] from={"icon","name","Content"};
        //Item布局文件中的子view的id的数组
        int[] to={R.id.iv_icon,R.id.tv_name,R.id.tv_content};
        //准备SimpleAdapterd对象
        SimpleAdapter adapter=new SimpleAdapter(this,data,R.layout.item_simple_adapter,from,to);
        //设置Adapter显示列表
        sp_main.setAdapter((ListAdapter) adapter);
    }
}
