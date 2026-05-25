package model;

public class Instrutor {
    private String nome;
    private String especialidade;
    private int cargaHoraria;

    public Instrutor(String nome, String especialidade, int cargaHoraria) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.cargaHoraria = cargaHoraria;
    }

    public void darAula() {
        System.out.println(nome + " dando aula de " + especialidade);
    }

    public double calcSalario() {
        return cargaHoraria * 50;
    }

    public void criarTreino() {
        System.out.println("Treino criado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
