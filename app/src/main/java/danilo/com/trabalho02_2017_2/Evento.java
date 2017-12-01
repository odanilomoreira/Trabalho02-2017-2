package danilo.com.trabalho02_2017_2;

public class Evento {

    private String nome;
    private String data;
    private String local;

    public Evento (String nome, String data, String local){
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

    public String getData(){
        return data;
    }

    public String setData(String data){
        this.data = data;
    }

    public String getLocal(){
        return local;
    }

    public String setLocal(String local){
        this.local = local;
    }

}
