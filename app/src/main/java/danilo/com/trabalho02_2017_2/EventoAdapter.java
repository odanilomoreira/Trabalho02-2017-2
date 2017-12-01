package danilo.com.trabalho02_2017_2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class EventoAdapter extends ArrayAdapter<Evento> {
    private final Context context;
    private final ArrayList<Evento> eventos;

    public EventoAdapter(Context context, ArrayList<Evento> eventos){
        super(context, R.layout.linha, eventos);
        this.context = context;
        this.eventos = eventos;
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View linhaView = inflater.inflate(R.layout.linha, parent, false);

        TextView nome = linhaView.findViewById(R.id.txt_nome);
        TextView data = linhaView.findViewById(R.id.txt_data);
        TextView local = linhaView.findViewById(R.id.txt_local);

        nome.setText(eventos.get(posicao).getNome());
        data.setText(eventos.get(posicao).getData());
        local.setText(eventos.get(posicao).getLocal());

        return linhaView;

    }
}
