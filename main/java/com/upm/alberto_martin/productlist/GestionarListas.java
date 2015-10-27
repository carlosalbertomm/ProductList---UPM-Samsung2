package com.upm.alberto_martin.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GestionarListas extends AppCompatActivity {

    Button btnIrCrearNuevaLista;
    Button btnVolverGestionarListas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestionar_listas);

        btnIrCrearNuevaLista = (Button)findViewById(R.id.btnIrCrearNuevaLista);
        btnVolverGestionarListas = (Button)findViewById(R.id.btnVolverGestionarListas);

        //Ir a actividad crear nueva lista.---------------------------------------------------------
        btnIrCrearNuevaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),CreacionLista.class);
                startActivity(intent);
                finish();
            }
        });

        //Volver atras.-----------------------------------------------------------------------------
        btnVolverGestionarListas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),PantallaPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
