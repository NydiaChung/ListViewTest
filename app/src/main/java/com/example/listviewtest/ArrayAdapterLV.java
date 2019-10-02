package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ArrayAdapterLV extends AppCompatActivity {

    private ListView lv_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter_lv);

        lv_main=findViewById(R.id.lv_main);
        //准备集合数据
        String[] data={"a","b","c","d","e","f","a","b","c","d","e","f","a","b","c","d","e","f"};
        //准备ArrayAdapter对象
        android.widget.ArrayAdapter<String> adapter=new android.widget.ArrayAdapter<String>(this,R.layout.item_array_adapter,data);
        //设置Adapter显示列表
        lv_main.setAdapter(adapter);
    }

}
