package main;



public abstract class Obra {

    private int id;
    private String nome;
    private String responsavel;
    private String contratante;
    private String dataInicio;
    private String dataTermino;
    private int numContrato;
    private String endereco;
    private String status;

    public Obra(int id, String nome, String responsavel, String contratante, String dataInicio, String dataTermino,
            int numContrato, String endereco, String status) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavel;
        this.contratante = contratante;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.numContrato = numContrato;
        this.endereco = endereco;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nNome: " + nome + "\nResponsável: " + responsavel
                + "\nContratante: " + contratante + "\nData Início: " + dataInicio + "\nData Prevista: "
                + dataTermino + "\nNº do Contrato: " + numContrato + "\nEndereço: " + endereco + "\nStatus: " + status;
    }
}