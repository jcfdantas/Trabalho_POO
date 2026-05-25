package model;

public class Modalidade {
    private String nome;
    private String nivel;
    private int capacidade;

    public Modalidade(String nome, String nivel, int capacidade) {
        this.nome = nome;
        this.nivel = nivel;
        this.capacidade = capacidade;
    }

    public boolean temVagas(int qtd) {
        return qtd < capacidade;
    }

    public String getDescricao() {
        return nome + " - " + nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void listarReq() {
        System.out.println("Requisitos: água e roupas");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
