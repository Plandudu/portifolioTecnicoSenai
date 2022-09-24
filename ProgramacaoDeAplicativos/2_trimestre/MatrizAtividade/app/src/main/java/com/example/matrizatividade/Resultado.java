package com.example.matrizatividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    static int n1, n2, n3, n4, n5, n6, n7, n8, n9;
    int[][] numeros = {{n1, n2, n3}, {n4, n5, n6}, {n7, n8, n9}};  //criamos uma lista de vetores
    TextView mat, result;
    Button somaBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        mat = findViewById(R.id.matriz);
        somaBt = findViewById(R.id.soma_btn);
        result = findViewById(R.id.result);
        result.setVisibility(View.INVISIBLE);
        criaMatriz();


    }

    public void criaMatriz(){
        String matriz = "Matriz\n";

        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                matriz += numeros[linha][coluna] + "";
            }
            matriz += "\n";
        }
        mat.setText(matriz);
    }

    public void somaMatriz(View v){
        int right = (numeros[0][0] * numeros[1][1] * numeros[2][2]
                + numeros[0][1] * numeros[1][2] * numeros[2][0]
                + numeros[0][2] * numeros[1][0] * numeros[2][1]);

        int left = (numeros[0][2] * numeros[1][1] * numeros[2][0]
                + numeros[0][0] * numeros[1][2] * numeros[2][1]
                + numeros[0][1] * numeros[1][0] * numeros[2][2]);

        int result = right - left;
        System.out.println(right);
        System.out.println(left);
        System.out.println("Resultado = " + result);
        this.result.setText(String.valueOf(result));
        this.result.setVisibility(View.VISIBLE);


    }
}