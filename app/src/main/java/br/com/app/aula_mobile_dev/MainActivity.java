package br.com.app.aula_mobile_dev;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnSaudacao;
    TextView tvMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.editNome);
        btnSaudacao = findViewById(R.id.btnBotao);
        tvMensagem = findViewById(R.id.tvNome);

        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Correctly retrieve the text from the EditText
                String nome = edtNome.getText().toString();
                String mensagem = "Olá " + nome;
                tvMensagem.setText(mensagem);
            }
        });
    }
}