package model;

public class Estatisticas {
    private int alunos;
    private int aulas;
    private double faturamento;

    public Estatisticas() {
        this.alunos = 0;
        this.aulas = 0;
        this.faturamento = 0;
    }

    public void addAluno() {
        this.alunos++;
    }

    public void addFaturamento(double valor) {
        this.faturamento += valor;
    }

    public double media() {
        return alunos > 0 ? faturamento / alunos : 0;
    }

    public void relatorio() {
        System.out.println("Alunos: " + alunos + ", R$: " + faturamento);
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
}
