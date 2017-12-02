package danilo.com.trabalho02_2017_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private EditText nome = findViewById(R.id.txt_nome);
    private EditText data = findViewById(R.id.txt_data);
    private EditText local = findViewById(R.id.txt_local);
    private EditText capacidade = findViewById(R.id.txt_capacidade);
    private EditText promotor = findViewById(R.id.txt_promotor);
    private EditText patrocinio = findViewById(R.id.txt_patrocinio);
    private EditText valor = findViewById(R.id.txt_valor);
    private Button btn_salvar = findViewById(R.id.btn_salvar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("nome",nome.getText().toString());
                intent.putExtra("data",data.getText().toString());
                intent.putExtra("local",local.getText().toString());
                intent.putExtra("capacidade",capacidade.getText().toString());
                intent.putExtra("promotor",promotor.getText().toString());
                intent.putExtra("patrocinio",patrocinio.getText().toString());
                intent.putExtra("valor",valor.getText().toString());
                startActivity(intent);


            }
        });

    }



}
