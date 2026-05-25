package model;

public class Aluno {
    private String nome;
    private String cpf;
    private double mensalidade;

    public Aluno(String nome, String cpf, double mensalidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.mensalidade = mensalidade;
    }

    public void pagar() {
        System.out.println(nome + " pagou R$" + mensalidade);
    }

    public boolean acessar() {
        return true;
    }

    public void pedirTreino() {
        System.out.println("Treino solicitado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
