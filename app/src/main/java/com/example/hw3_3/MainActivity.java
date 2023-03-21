package com.example.hw3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hw3_3.recycler.ContactsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayList;
    ContactsAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }
    private void initList() {
        arrayList = new ArrayList<>();
        arrayList.add("Islam");
        arrayList.add("Damir");
        arrayList.add("Aliya");
        arrayList.add("Malik");
        arrayList.add("Kanat");
        arrayList.add("Isa");
        arrayList.add("Islam");
        arrayList.add("Damir");
        arrayList.add("Aliya");
        arrayList.add("Malik");
        arrayList.add("Kanat");
        arrayList.add("Isa");

        adapter = new ContactsAdapter(arrayList);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }
}