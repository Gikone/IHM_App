package es.ubu.ihm.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Carga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga);
    }

    public void pasoInicio(View v){
        Intent intent = new Intent (v.getContext(), Inicio.class);
        startActivityForResult(intent, 0);
    }
}
