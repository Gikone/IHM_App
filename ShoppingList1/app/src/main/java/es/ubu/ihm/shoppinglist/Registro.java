package es.ubu.ihm.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void pasoAtras(View v) {
        Intent intent = new Intent (v.getContext(), login.class);
        startActivityForResult(intent, 0);
    }
}
