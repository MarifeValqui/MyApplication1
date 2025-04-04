package com.example.myapplication1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication1.adapter.BasicAdapter;
import com.example.myapplication1.adapter.Persona;

import java.util.ArrayList;
import java.util.List;

public class    SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


//        List<String> data = new ArrayList<>();
//        data.add("Dato 1");
//        data.add("Dato 2");
//        data.add("Dato 3");
//        data.add("Dato 4");
//        data.add("Dato 5");
//
//
//
//        RecyclerView rvBasic = findViewById(R.id.rvBasic);
//        rvBasic.setLayoutManager(new LinearLayoutManager(this));
//        BasicAdapter adapter = new BasicAdapter(data);
//        rvBasic.setAdapter(adapter);

        List<Persona> data = new ArrayList<>();
        data.add(new Persona("Juan Pérez", "936682268"));
        data.add(new Persona("María López", "936682268"));
        data.add(new Persona("Carlos Díaz", "936682268"));

        RecyclerView rvBasic = findViewById(R.id.rvBasic);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        BasicAdapter adapter = new BasicAdapter(data);
        rvBasic.setAdapter(adapter);
    }
}