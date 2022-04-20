package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton areaTotal, areaBase, areaBaseVolume, numLados, areaFace, volume, altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        areaTotal = findViewById(R.id.bt_areaTotal);
        areaBase = findViewById(R.id.bt_areaBase);
        areaBaseVolume = findViewById(R.id.bt_areaVolume);
        numLados = findViewById(R.id.bt_numLado);
        areaFace = findViewById(R.id.bt_areaFace);
        volume = findViewById(R.id.bt_volume);
        altura = findViewById(R.id.bt_altura);
    }

    public void click(View view){
        Intent i = new Intent(this, CalculoTela.class);
        if (areaTotal.isChecked()){
            CalculoTela.formula = 1;
            startActivity(i);
        }else if(areaBase.isChecked()){
            CalculoTela.formula = 2;
            startActivity(i);
        }else if(areaBaseVolume.isChecked()){
            CalculoTela.formula = 3;
            startActivity(i);
        }else if(numLados.isChecked()){
            CalculoTela.formula = 4;
            startActivity(i);
        }else if(areaFace.isChecked()){
            CalculoTela.formula = 5;
            startActivity(i);
        }else if(volume.isChecked()){
            CalculoTela.formula = 6;
            startActivity(i);
        }else if (altura.isChecked()){
            CalculoTela.formula = 7;
            startActivity(i);
        }else{
            CalculoTela.formula = 0;
            startActivity(i);
            Toast.makeText(this, "Voce precisa selecionar uma opção", Toast.LENGTH_LONG).show();
        }
    }
}