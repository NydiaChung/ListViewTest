package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button aalv;
    private Button salv;
    private Button balv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aalv=findViewById(R.id.aalv);
        salv=findViewById(R.id.salv);
        balv=findViewById(R.id.balv);

        aalv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ArrayAdapterLV.class);
                startActivity(intent);
            }
        });
        salv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SimpleAdapterLV.class);
                startActivity(intent);
            }
        });

        balv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, BaseAdapterLV.class);
                startActivity(intent);
            }
        });


    }

}
