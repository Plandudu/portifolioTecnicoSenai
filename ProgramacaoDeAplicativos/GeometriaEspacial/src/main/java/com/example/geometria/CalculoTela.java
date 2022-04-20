package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CalculoTela extends AppCompatActivity {

    static int formula;
    TextView titulo;
    TextView text_um;
    TextView text_dois;
    TextView text_tres;
    TextView result;
    Double resultNum;
    Double a;
    Double b;
    Double c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_tela);
        getSupportActionBar().hide();
        text_um = findViewById(R.id.text_um);
        text_dois = findViewById(R.id.text_sec);
        text_tres = findViewById(R.id.text_terc);
        text_um.setVisibility(View.INVISIBLE);
        text_dois.setVisibility(View.INVISIBLE);
        text_tres.setVisibility(View.INVISIBLE);
        result = findViewById(R.id.resultado);
        titulo = findViewById(R.id.titulo);
        organizaTela();
    }

    public void organizaTela(){
        if (formula == 1){
            //corrigir 2 * area base + numero de lados * numero de faces
            titulo.setText("Area total");
            text_um.setHint("Area da Base");
            text_dois.setHint("Numero de Faces");
            text_um.setVisibility(View.VISIBLE);
            text_dois.setVisibility(View.VISIBLE);
        }else if(formula == 2){
            titulo.setText("Area Base");
            text_um.setHint("Area total");
            text_dois.setHint("Numero de Faces");
            text_um.setVisibility(View.VISIBLE);
            text_dois.setVisibility(View.VISIBLE);
        }else if(formula == 3){
            titulo.setText("Area base");
            text_um.setHint("Volume");
            text_dois.setHint("Altura");
            text_um.setVisibility(View.VISIBLE);
            text_dois.setVisibility(View.VISIBLE);
        }else if(formula == 4){
            titulo.setText("Numero de lados");
            text_um.setHint("Area Total");
            text_dois.setHint("Area da Base");
            text_tres.setHint("Numero de Faces");
            text_um.setVisibility(View.VISIBLE);
            text_dois.setVisibility(View.VISIBLE);
            text_tres.setVisibility(View.VISIBLE);
        }else if(formula == 5){
            titulo.setText("Numero de faces");
            text_um.setHint("Area Total");
            text_dois.setHint("Area da base");
            text_tres.setHint("Numero de lados");
            text_um.setVisibility(View.VISIBLE);
            text_dois.setVisibility(View.VISIBLE);
            text_tres.setVisibility(View.VISIBLE);
        }else if(formula == 6){
            titulo.setText("Volume");
            text_um.setHint("Area da base");
            text_dois.setHint("Altura");
            text_um.setVisibility(View.VISIBLE);
            text_dois.setVisibility(View.VISIBLE);
        }else if (formula == 7){
            titulo.setText("Altura");
            text_um.setHint("Volume");
            text_dois.setHint("Area da base");
            text_um.setVisibility(View.VISIBLE);
            text_dois.setVisibility(View.VISIBLE);
        }else{
            Toast.makeText(this, "Houve algum erro", Toast.LENGTH_LONG);
        }

    }

    public void clickaBotao(View view){

        switch (formula){
            case 1:
                resultNum = 2 * Double.parseDouble(text_um.getText().toString()) + Double.parseDouble(text_dois.getText().toString());
                break;
            case 2:
                resultNum = (Double.parseDouble(text_um.getText().toString()) - Double.parseDouble(text_dois.getText().toString()))/2;
                break;
            case 3:
                resultNum = Double.parseDouble(text_um.getText().toString()) / Double.parseDouble(text_dois.getText().toString());
                break;
            case 4:
                resultNum = (Double.parseDouble(text_um.getText().toString()) - 2 * Double.parseDouble(text_dois.getText().toString())) / Double.parseDouble(text_tres.getText().toString());
                break;
            case 5:
                resultNum = (Double.parseDouble(text_um.getText().toString()) - 2 * Double.parseDouble(text_dois.getText().toString())) / Double.parseDouble(text_tres.getText().toString());
                break;
            case 6 :
                resultNum = Double.parseDouble(text_um.getText().toString()) * Double.parseDouble(text_dois.getText().toString());
                break;
            case 7:
                resultNum = Double.parseDouble(text_um.getText().toString()) / Double.parseDouble(text_dois.getText().toString());
                break;
        }
        result.setText(titulo.getText().toString() + ":" + resultNum.toString());
        result.setVisibility(view.VISIBLE);
    }
}