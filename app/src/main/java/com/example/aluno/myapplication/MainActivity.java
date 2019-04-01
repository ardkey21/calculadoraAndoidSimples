package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText campo1;
    private EditText campo2;
    private TextView resultado;
    private Button mais;
    private Button menos;
    private Button dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //relacionamento de varialvel

        campo1 = (EditText) findViewById(R.id.editText3);
        campo2 = (EditText) findViewById(R.id.editText4);
        resultado = (TextView) findViewById(R.id.textView2);
        mais = (Button) findViewById(R.id.button);
        menos = (Button) findViewById(R.id.button2);
        dividir = (Button) findViewById(R.id.button3);


        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double result = (Double.parseDouble(campo1.getText().toString()) - Double.parseDouble(campo2.getText().toString())) ;

                    resultado.setText("Resultado: "+result);
                    Toast.makeText(MainActivity.this, "."+result, Toast.LENGTH_LONG).show();
                } catch (Exception E) {
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double result = (Double.parseDouble(campo1.getText().toString()) + Double.parseDouble(campo2.getText().toString())) ;

                    resultado.setText("Resultado: "+result);
                    Toast.makeText(MainActivity.this, "."+result, Toast.LENGTH_LONG).show();
                } catch (Exception E) {
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double result = (Double.parseDouble(campo1.getText().toString()) / Double.parseDouble(campo2.getText().toString())) ;

                    resultado.setText("Resultado: "+result);
                    Toast.makeText(MainActivity.this, "."+result, Toast.LENGTH_LONG).show();
                } catch (Exception E) {
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente! ", Toast.LENGTH_SHORT).show();
                }
            }
        });









    }
}