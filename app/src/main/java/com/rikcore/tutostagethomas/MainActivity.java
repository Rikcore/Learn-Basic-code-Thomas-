package com.rikcore.tutostagethomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int bonneReponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editTextReponse = findViewById(R.id.editTextReponse);
        editTextReponse.setInputType(InputType.TYPE_CLASS_NUMBER);
        final TextView textViewTest = findViewById(R.id.textViewTest);
        Button buttonOk = findViewById(R.id.buttonOk);

        bonneReponse = 48;



        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int reponseUtilisateur = Integer.valueOf(editTextReponse.getText().toString());
                if (reponseUtilisateur == bonneReponse){
                    Toast.makeText(MainActivity.this, "Bonne réponse", Toast.LENGTH_SHORT).show();
                    textViewTest.setText("La bonne réponse est bien 48");
                } else {
                    Toast.makeText(MainActivity.this, "Faux enculé", Toast.LENGTH_SHORT).show();
                    textViewTest.setText("Mauvaise réponse, essaye encore");
                }
            }
        });
    }
}
