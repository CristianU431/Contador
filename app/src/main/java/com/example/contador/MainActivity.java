package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Creando variable de tipo int
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Iniciar el contador a 0
        contador = 0;
        mostrarResultado();

    }
    //crear metodo de incrementar
    public void incrementarContador(View view)
    {
        contador++;
        mostrarResultado();
    }
    public void decrementaContador(View view)
    {
        contador--;
        mostrarResultado();
    }
    public void resetearContador(View view)
    {
        contador = 0;
        mostrarResultado();
    }
    public void mostrarResultado()
    {
        TextView textoResultado = (TextView)findViewById(R.id.tvContador); //Acceder a la ruta del elemento
        textoResultado.setText("Contador: " + contador);
    }

}