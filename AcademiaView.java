package model;

public class Pagamento {
    private double valor;
    private String data;
    private String status;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
        this.status = "Pendente";
    }

    public void pagar() {
        this.status = "Pago";
        System.out.println("Pago: R$" + valor);
    }

    public boolean atrasado() {
        return status.equals("Pendente");
    }

    public String boleto() {
        return "Boleto: R$" + valor + " - " + data;
    }

    public void estornar() {
        this.status = "Pendente";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
