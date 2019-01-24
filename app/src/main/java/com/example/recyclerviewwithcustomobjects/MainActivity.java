package com.example.recyclerviewwithcustomobjects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //These are the items which will be displayed in the recycler view
        people.add(new Person("Leyton", "Good", 20, "Red"));
        people.add(new Person("Lillian", "Bowman", 21, "Yellow"));
        people.add(new Person("Phillipa", "Ho", 22, "Pink"));
        people.add(new Person("Lillie-Mai", "Haney", 23, "Green"));
        people.add(new Person("Suman", "Vance", 24, "Purple"));
        people.add(new Person("Marni", "Lindsey", 25, "Orange"));

        //get the recycler view
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        //get an adapter
        RecyclerAdapter adapter = new RecyclerAdapter(people, this);
        //set the adapter to the recycler view
        recyclerView.setAdapter(adapter);
        //from developer.android.com
        //In contrast to other adapter-backed views such as ListView or GridView,
        // RecyclerView allows client code to provide custom layout arrangements for
        // child views. These arrangements are controlled by the RecyclerView.LayoutManager.
        // A LayoutManager must be provided for RecyclerView to function.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}