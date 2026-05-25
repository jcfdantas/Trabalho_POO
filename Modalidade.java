package model;

public class Equipamento {
    private String nome;
    private String serie;
    private boolean manutencao;

    public Equipamento(String nome, String serie, boolean manutencao) {
        this.nome = nome;
        this.serie = serie;
        this.manutencao = manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }

    public boolean isDisponivel() {
        return !manutencao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public boolean isManutencao() {
        return manutencao;
    }

    public void usar() {
        System.out.println(nome + " usado");
    }

    public void limpar() {
        System.out.println(nome + " limpo");
    }
}
