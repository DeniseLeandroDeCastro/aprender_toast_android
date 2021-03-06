package br.edu.ifrn.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirToast(View view) {
        //Toast customizado
        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.ic_dialog_email);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(imagem);
        toast.show();

        /*
        //Toast tradicional
        Toast.makeText(
                getApplicationContext(),
                "Ação realizada com sucesso!",
                Toast.LENGTH_SHORT
        ).show();
         */
    }
}