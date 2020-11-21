package isi.damMarianoGarcia.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button btnIrAMapa;
    EditText editTextNombre;
    RadioGroup radioGroupGenero;
    RadioButton masculino,femenino,otro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIrAMapa = findViewById(R.id.btnIrAMapa);
        editTextNombre = findViewById(R.id.nombre);
        radioGroupGenero = findViewById(R.id.radiogroupgenero);

    }
}