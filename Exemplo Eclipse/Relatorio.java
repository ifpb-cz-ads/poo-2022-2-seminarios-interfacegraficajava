 

public class Relatorio {

    private int id;
    private String data;
    private String tempo;
    private String condicao;


    public Relatorio(int id, String data, String condicao, String tempo) {
        this.id = id;
        this.data = data;
        this.condicao = condicao;
        this.tempo = tempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nData: " + data + "\nTempo: " + tempo
                + "\nCondição: " + condicao;
    }

}
