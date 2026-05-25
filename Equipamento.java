package model;

public class Agenda {
    private String dia;
    private String horaIni;
    private String horaFim;

    public Agenda(String dia, String horaIni, String horaFim) {
        this.dia = dia;
        this.horaIni = horaIni;
        this.horaFim = horaFim;
    }

    public void agendar(Aluno aluno, String hora) {
        System.out.println(aluno.getNome() + " - " + hora);
    }

    public boolean disponivel(String hora) {
        return true;
    }

    public void cancelar() {
        System.out.println("Cancelado");
    }

    public void listar() {
        System.out.println("Aulas: " + dia);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
}
