package com.example.ginz.listhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mRecyclerViewAdapter;
    private List<String> mDataTitle;
    private List<Integer> mDataAvatar;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mDataTitle = new ArrayList<>();
        mDataAvatar = new ArrayList<>();
        mDataTitle.add("Black Panther");
        mDataTitle.add("Iron Man");
        mDataTitle.add("Spider Man");
        mDataAvatar.add(R.drawable.panther);
        mDataAvatar.add(R.drawable.ironman);
        mDataAvatar.add(R.drawable.spiderman);

        mRecyclerViewAdapter = new RecyclerViewAdapter(mDataTitle, mDataAvatar);

        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }
}
