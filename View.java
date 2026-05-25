package model;

public class Treino {
    private String tipo;
    private int duracao;
    private double intensidade;

    public Treino(String tipo, int duracao, double intensidade) {
        this.tipo = tipo;
        this.duracao = duracao;
        this.intensidade = intensidade;
    }

    public void iniciar() {
        System.out.println("Iniciando " + tipo);
    }

    public void terminar() {
        System.out.println("Terminou - " + calcCal() + " cal");
    }

    public double calcCal() {
        return duracao * intensidade * 3.5;
    }

    public void pausar() {
        System.out.println("Pausado");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }
}
