package com.yagofellipe.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override //sobreescvendo
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        verificarGanhador("pedra");
    }
    public void selecionarPapel(View view){
        verificarGanhador("papel");
    }
    public void selecionarTesoura(View view){
        verificarGanhador("tesoura");
    }
    private String gerarEscolhaAleatoriaApp() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numeroAleatorio = new Random().nextInt(3);
        ImageView imageApp = findViewById(R.id.image_app);
        String escolhaApp = opcoes[numeroAleatorio];
        switch (escolhaApp){
            case "pedra":
                imageApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageApp.setImageResource(R.drawable.tesoura);
                break;

        }
        return escolhaApp;
    }
    private void verificarGanhador(String escolhaUsuario) {

        String escolhaApp = gerarEscolhaAleatoriaApp();
        TextView textoResultado = findViewById(R.id.text_resultado);

        if (
                (escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
                (escolhaApp == "tesoura" && escolhaUsuario == "papel")

        ){
            textoResultado.setText("você perdeu");
        } else if (
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                (escolhaUsuario == "tesoura" && escolhaApp == "papel")
        ){
            textoResultado.setText("VOCÊ HANGZHOU");
        }else
            textoResultado.setText("Empate");
    }
}
