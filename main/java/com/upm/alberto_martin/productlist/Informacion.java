package com.upm.alberto_martin.productlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Informacion extends AppCompatActivity {

    Button btnSalirInformacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        btnSalirInformacion = (Button)findViewById(R.id.btnSalirInformacion);

        //Salir Informacion-------------------------------------------------------------------------
        btnSalirInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
