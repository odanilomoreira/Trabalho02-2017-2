package danilo.com.trabalho02_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.lvEventos);
        ArrayList<Evento> eventos = adicionarEvento();
        ArrayAdapter adapter = new EventoAdapter(this, eventos);
        lista.setAdapter(adapter);

       /* lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("nome", eventos.get(i).getNome());
                startActivity(intent);
            }
        });
        */
        }

    private ArrayList<Evento> adicionarEvento() {
        ArrayList<Evento> eventos = new ArrayList<Evento>();
        Evento e = new Evento("String nome1", "String Data1", "String local1");
        eventos.add(e);

        e = new Evento("String nome2", "String Data2", "String local2");
        eventos.add(e);

        e = new Evento("String nome3", "String Data3", "String local3");
        eventos.add(e);

        e = new Evento("String nome4", "String Data4", "String local4");
        eventos.add(e);

        e = new Evento("String nome5", "String Data5", "String local5");
        eventos.add(e);

        return eventos;
    }

}




