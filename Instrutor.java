package model;

public class AvaliacaoFisica {
    private double peso;
    private double altura;
    private double imc;

    public AvaliacaoFisica(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        this.imc = calcularImc(peso, altura);
    }

    private double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public double getImc() {
        return imc;
    }

    public String diag() {
        if (imc < 18.5) {
            return "Baixo";
        } else if (imc < 25) {
            return "Normal";
        } else {
            return "Alto";
        }
    }

    public void relatorio() {
        System.out.println("P: " + peso + "kg, A: " + altura + "m, IMC: " + imc);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.imc = calcularImc(peso, this.altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.imc = calcularImc(this.peso, altura);
    }

    public void dieta() {
        System.out.println("Dieta recomendada");
    }
}
