 

public class ObraPublica extends Obra {

    private String dataOrdemDeServico;
    private String processoLicitatorio;
    private String obraPublica;

    public ObraPublica(int id, String nome, String responsavel, String contratante, String dataInicio,
            String dataTermino, int numContrato, String endereco, String status, String dataOrdemDeServico,
            String processoLicitatorio) {
        super(id, nome, responsavel, contratante, dataInicio, dataTermino, numContrato, endereco, status);
        this.dataOrdemDeServico = dataOrdemDeServico;
        this.processoLicitatorio = processoLicitatorio;
        this.obraPublica = "Obra Pública";
    }

    public String getDataOrdemDeServico() {
        return dataOrdemDeServico;
    }

    public void setDataOrdemDeServico(String dataOrdemDeServico) {
        this.dataOrdemDeServico = dataOrdemDeServico;
    }

    public String getProcessoLicitatorio() {
        return processoLicitatorio;
    }

    public void setProcessoLicitatorio(String processoLicitatorio) {
        this.processoLicitatorio = processoLicitatorio;
    }

    @Override
    public String toString() {
        return "\nTipo de Obra: " + obraPublica + super.toString() + "\nData da ordem de servico: " + dataOrdemDeServico + "\nProcesso licitatório: "
                + processoLicitatorio;

    }
}