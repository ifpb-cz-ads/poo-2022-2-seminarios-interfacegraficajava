 

public class ObraPrivada extends Obra {

    private String tipoDeObra;
    private String fonteDeRecurso;
    private String obraPrivada;

    public ObraPrivada(int id, String nome, String responsavel, String contratante, String dataInicio,
            String dataTermino, int numContrato, String endereco, String status, String tipoDeObra,
            String fonteDeRecurso) {
        super(id, nome, responsavel, contratante, dataInicio, dataTermino, numContrato, endereco, status);
        this.tipoDeObra = tipoDeObra;
        this.fonteDeRecurso = fonteDeRecurso;
        this.obraPrivada = "Obra Privada";
    }

    public String getTipoDeObra() {
        return tipoDeObra;
    }

    public void setTipoDeObra(String tipoDeObra) {
        this.tipoDeObra = tipoDeObra;
    }

    public String getFonteDeRecurso() {
        return fonteDeRecurso;
    }

    public void setFonteDeRecurso(String fonteDeRecurso) {
        this.fonteDeRecurso = fonteDeRecurso;
    }

    @Override
    public String toString() {
        return "\nTipo de Obra: " + obraPrivada + super.toString() + "\nTipo de obra: " + tipoDeObra + " \nFonte de recurso: " + fonteDeRecurso;
    }

}
