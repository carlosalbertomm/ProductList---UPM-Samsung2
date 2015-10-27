package com.upm.alberto_martin.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TablaCreadaAMostrar extends AppCompatActivity {

    Button btnCancelarTablaCreada;
    Button btnAceptarTablaCreada;

    ListView listViewProductos;
    String[] miArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_creada_amostrar);

        btnAceptarTablaCreada = (Button)findViewById(R.id.btnAceptarTablaCreada);
        btnCancelarTablaCreada = (Button)findViewById(R.id.btnCancelarTablaCreada);

        //Llenar List View--------------------------------------------------------------------------
        // A. Seleccionamos la lista de nuestro layout
        listViewProductos = (ListView)findViewById(R.id.listViewProductos);

        // B. Creamos el arreglo de Strings para llenar la lista
        /*String[] cosasPorHacer = new String[] { "Aprender a programar en Android",
                "Hacer una aplicación famosa","Vender la aplicación",
                "Esperar a que llegue el dinero"};*/
        miArray = getResources().getStringArray(R.array.frutasyverduras);

        // C. Creamos un nuevo ArrayAdapter con nuestra lista de cosasPorHacer
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, miArray);

        // D. Asignamos el adaptador a nuestra lista
        listViewProductos.setAdapter(arrayAdapter);

        //Aceptar Tabla Creada----------------------------------------------
        btnAceptarTablaCreada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GestionarListas.class);
                startActivity(intent);
                finish();
            }
        });

        //Cancelar Tabla Creada---------------------------------------------
        btnCancelarTablaCreada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GestionarListas.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
