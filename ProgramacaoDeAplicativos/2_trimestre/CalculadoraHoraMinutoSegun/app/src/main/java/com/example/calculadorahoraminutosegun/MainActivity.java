package com.example.calculadorahoraminutosegun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText inputHora;
    EditText inputHora1;
    EditText inputMin;
    EditText inputMin1;
    TextView sh;
    TextView sm;
    ConstraintLayout fundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        inputHora = findViewById(R.id.inputHora);
        inputHora1 = findViewById(R.id.inputHora1);
        inputMin = findViewById(R.id.inputMin);
        inputMin1 = findViewById(R.id.inputMin1);
        sh = findViewById(R.id.shText);
        sm = findViewById(R.id.smText);
        fundo = findViewById(R.id.fundo);
        fundo.setBackgroundColor(Color.CYAN);
    }

    public void somar(View view){
        int hora = Integer.valueOf(inputHora.getText().toString()) + Integer.valueOf(inputHora1.getText().toString());
        int min = Integer.valueOf(inputMin.getText().toString()) + Integer.valueOf(inputMin1.getText().toString());

        while (min > 59){
            hora++;
            min -= 60;
        }

        sh.setText(String.valueOf(hora));
        sm.setText(String.valueOf(min));
    }

    public void subtracao(View view){
        int hora;
        int min;
        int horaInicial = Integer.valueOf(inputHora.getText().toString());
        int horaFinal = Integer.valueOf(inputHora1.getText().toString());
        int minInicial = Integer.valueOf(inputMin.getText().toString());
        int minFinal = Integer.valueOf(inputMin1.getText().toString());

        //corrigir horarios para nao gerarmos valores negativos
        while (minInicial > 59){
            horaInicial++;
            minInicial -= 60;
        }
        while (minFinal > 59){
            horaFinal ++;
            minFinal -= 60;
        }

        //validaçoes
        if (horaFinal > horaInicial){
            hora = horaFinal - horaInicial;
            min = minFinal - minInicial;
        }else{
            hora = horaInicial - horaFinal ;
            if (minFinal > minInicial){
                min = minFinal - minInicial;
            }else{
                min = minInicial - minFinal;
            }
        }

        //ultima validacao
        while (min < 0){
            hora++;
            min += 60;
        }



        sh.setText(String.valueOf(hora));
        sm.setText(String.valueOf(min));
    }

    public void reset(View view){
        sh.setText("SH");
        sm.setText("SM");
        inputHora.setText("");
        inputHora1.setText("");
        inputMin.setText("");
        inputMin1.setText("");
    }
}