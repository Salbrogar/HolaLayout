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
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNombre = findViewById(R.id.editNombre);
        btnSaludar = findViewById(R.id.btnSaludar);
        txtSaludo = findViewById(R.id.txtSaludo);
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editNombre.getText().toString();
                txtSaludo.setText("Hola, " + nombre);
            }
        });
    }

}