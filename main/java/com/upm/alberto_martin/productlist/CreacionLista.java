package com.upm.alberto_martin.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreacionLista extends AppCompatActivity {

    Button btnAceptarCreacionLista;
    Button btnCancelarCreacionLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_lista);

        btnAceptarCreacionLista = (Button)findViewById(R.id.btnAceptarCreandoLista);
        btnCancelarCreacionLista = (Button)findViewById(R.id.btnCancelarCreandoLista);


        //Aceptar creacion de la lista.-------------------------------------------------------------
        btnAceptarCreacionLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TablaCreadaAMostrar.class);
                startActivity(intent);
                finish();
            }
        });

        //Cancelar crear lista.---------------------------------------------------------------------
        btnCancelarCreacionLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GestionarListas.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
