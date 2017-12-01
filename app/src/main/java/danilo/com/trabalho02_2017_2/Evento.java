package danilo.com.trabalho02_2017_2;

import java.util.Date;

/**
 * Created by Isabela on 01/12/2017.
 */

public class Evento {

    private String nome;
    private Date data;
    private String local;

    public Evento (String nome, Date data, String local){
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
        this.nome = nome;
    }

    public Date getData(){
        return data;
    }

    public Date setData(Date data){
        this.data = data;
    }

    public String getLocal(){
        return local;
    }

    public String setLocal(String local){
        this.local = local;
    }

}
