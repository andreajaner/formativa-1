package com.example.app_01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boton1 (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿ Desea llamar a alguien ?").setTitle("TELEFONO")
                .setCancelable(true).setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void boton2 (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿ Desea bloquear el celular ?").setTitle("BLOQUEO")
                .setCancelable(true).setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void boton3 (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Desea tomar una fotografía").setTitle("CAMARA")
                .setCancelable(true).setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                 dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void boton4 (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿ Desea ver las imagenes de la galeria ?").setTitle("GALERIA")
                .setCancelable(true).setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
