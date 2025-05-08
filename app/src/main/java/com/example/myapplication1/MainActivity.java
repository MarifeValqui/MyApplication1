package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> contactList;
    Button btnCrearContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);
        btnCrearContacto = findViewById(R.id.btnCrearContacto);

        // Lista de contactos de ejemplo
        contactList = new ArrayList<>();
        contactList.add("Juan Pérez");
        contactList.add("Ana García");
        contactList.add("Carlos López");
        contactList.add("Alexis Larios");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contactList);
        listView.setAdapter(adapter);

        // Filtro de búsqueda
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false; // no es necesario
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        // Acción del botón para ir a la actividad de creación
        btnCrearContacto.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FormContactActivity.class);
            startActivity(intent);
        });
    }
}
