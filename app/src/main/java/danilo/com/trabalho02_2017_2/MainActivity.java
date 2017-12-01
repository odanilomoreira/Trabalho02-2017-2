package danilo.com.trabalho02_2017_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list_eventos = findViewById(R.id.list_eventos);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.atributos, android.R.layout.simple_list_item_1);
        list_eventos.setAdapter(adapter);









    }
}
