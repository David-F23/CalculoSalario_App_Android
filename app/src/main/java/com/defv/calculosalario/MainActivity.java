package com.defv.calculosalario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt1, txt2, nombre;
    private TextView total, totalD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        nombre = findViewById(R.id.nombre);

        total = findViewById(R.id.total);
        totalD = findViewById(R.id.totalD);
    }

    public void calcular(View view) {
        if(nombre.length() == 0){
            nombre.setError("Campo obligatorio");

        }else if(txt1.length() == 0){
            nombre.setError("Campo obligatorio");

        }else if(txt2.length() == 0){
            nombre.setError("Campo obligatorio");

        }else{
            String name = nombre.getText().toString();
            double horasT = Double.parseDouble(txt1.getText().toString());
            double pagoH = Double.parseDouble(txt2.getText().toString());

            double pago = horasT * pagoH;
            double desc = pago - pago * 0.1;

            total.setText(String.valueOf(pago));
            totalD.setText(String.valueOf(desc));
        }
    }

    public void nuevo(View view) {
        txt1.setText(null);
        txt2.setText(null);
        nombre.setText(null);
    }

    public void salir(View view) {
        finish();
    }
}