package com.example.aulamobiletuliocafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText Login, Senha, texto1, texto2;
Button Logar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = findViewById(R.id.edt_Usuario);
        Senha = findViewById(R.id.edt_Senha);
        Logar = findViewById(R.id.btn_Button);
        texto1 = findViewById(R.id.t1);
        texto2 = findViewById(R.id.t2);
        Logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logando();
            }
        });
    }
    public void logando(){
       String t1 = Login.getText().toString().trim();
       String t2 = Senha.getText().toString().trim();
       texto1.setText(t1);
       texto2.setText(t2);
    }
}
