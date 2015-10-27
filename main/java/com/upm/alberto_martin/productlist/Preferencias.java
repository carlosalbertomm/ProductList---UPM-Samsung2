package com.upm.alberto_martin.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Preferencias extends AppCompatActivity {

    Button btnVolverPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        btnVolverPreferencias = (Button)findViewById(R.id.btnVolverPreferencias);

        //Volver Preferencias-----------------------------------------------------------------------
        btnVolverPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),PantallaPrincipal.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
