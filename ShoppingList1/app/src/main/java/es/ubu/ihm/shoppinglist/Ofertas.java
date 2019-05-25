package es.ubu.ihm.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Ofertas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas);
    }
    public void pasoLista(View v) {
        Intent intent = new Intent (v.getContext(), Lista_vacia.class);
        startActivityForResult(intent, 0);
    }

    public void pasoHome(View v) {
        Intent intent = new Intent (v.getContext(), Inicio.class);
        startActivityForResult(intent, 0);
    }

    public void pasoConfig(View v) {
        Intent intent = new Intent (v.getContext(), Configuracion.class);
        startActivityForResult(intent, 0);
    }

    public void pasoSoporte(View v) {
        Intent intent = new Intent (v.getContext(), Soporte.class);
        startActivityForResult(intent, 0);
    }

    public void pasoVOlver(View v) {
        Intent intent = new Intent (v.getContext(), Inicio.class);
        startActivityForResult(intent, 0);
    }

}
