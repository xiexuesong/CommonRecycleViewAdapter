package com.wangzhen.admin.commonrecycleviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.MyAdapter;
import bean.Adult;

public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter ;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Adult> list = initList();
        myAdapter = new MyAdapter(list,this,R.layout.item_myadapter);
        recyclerView.setAdapter(myAdapter);

    }

    private List<Adult> initList() {
        List<Adult> list = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            Adult adult = new Adult();
            adult.setName("世界你好:" + i);
            adult.setAge("20");
            list.add(adult);
        }
        return list;
    }
}
