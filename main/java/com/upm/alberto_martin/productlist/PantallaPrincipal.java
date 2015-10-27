package com.upm.alberto_martin.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipal extends AppCompatActivity {

    //Botones
    Button btnIrGestionar;
    Button btnIrPreferencias;
    Button btnIrInformacion;
    Button btnSalirApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        btnIrGestionar = (Button)findViewById(R.id.btnIrGestionar);
        btnIrPreferencias = (Button)findViewById(R.id.btnIrConfiguracion);
        btnIrInformacion = (Button)findViewById(R.id.btnIrInformacion);
        btnSalirApp = (Button)findViewById(R.id.btnSalirApp);




        //Creacion de eventos onClickListener-------------------------------------------------------
        //Ir a Gestionar Listas
        btnIrGestionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GestionarListas.class);
                startActivity(intent);
                finish();
            }
        });

        //------------------------------------------------------------------------------------------
        btnIrInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Informacion.class);
                startActivity(intent);
                finish();
            }
        });

        //------------------------------------------------------------------------------------------
        btnIrPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Preferencias.class);
                startActivity(intent);
                finish();
            }
        });

        //Salir App
        btnSalirApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //FIN onCreate -----------------------------------------------------------------------------
    }
}
