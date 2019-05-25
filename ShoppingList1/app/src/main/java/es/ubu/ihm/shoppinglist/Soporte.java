package es.ubu.ihm.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Soporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soporte);
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

    public void pasoVolver(View v) {
        Intent intent = new Intent (v.getContext(), Inicio.class);
        startActivityForResult(intent, 0);
    }



    public void pasoFaq(View v) {
        Intent intent = new Intent (v.getContext(), Faq.class);
        startActivityForResult(intent, 0);
    }

    public void pasoAcerca(View v) {
        Intent intent = new Intent (v.getContext(), Acercade.class);
        startActivityForResult(intent, 0);
    }

    public void pasoTerminos(View v) {
        Intent intent = new Intent (v.getContext(), terminosdeservicio.class);
        startActivityForResult(intent, 0);
    }

    public void pasoResolucion(View v) {
        Intent intent = new Intent (v.getContext(), Resolucion.class);
        startActivityForResult(intent, 0);
    }
    public void pasoLicencia(View v) {
        Intent intent = new Intent (v.getContext(), Licencias.class);
        startActivityForResult(intent, 0);
    }

    public void pasoVersiones(View v) {
        Intent intent = new Intent (v.getContext(), versiones.class);
        startActivityForResult(intent, 0);
    }

    public void pasoFeedback(View v) {
        Intent intent = new Intent (v.getContext(), Contacto.class);
        startActivityForResult(intent, 0);
    }


}
