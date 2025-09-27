package com.example.holalayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText editNombre;
    Button btnSaludar;
    TextView txtSaludo;
    Button btnBorrar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNombre = findViewById(R.id.editNombre);
        btnSaludar = findViewById(R.id.btnSaludar);
        btnBorrar = findViewById(R.id.btnBorrar);
        txtSaludo = findViewById(R.id.txtSaludo);
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editNombre.getText().toString();
                txtSaludo.setText("Hola, " + nombre);
            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSaludo.setText("Hola");
            }
        });
    }

}