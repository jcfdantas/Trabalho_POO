// Importações
import model.*;
import controller.*;
import view.View;

public class Main {
    public static void main(String[] args) {
        AcademiaController ctrl = new AcademiaController();
        ctrl.getView().menu();

        // Teste com Aluno
        Aluno aluno = new Aluno("João", "123", 150);
        aluno.pagar();
        aluno.acessar();
        aluno.pedirTreino();

        // Teste com Instrutor
        Instrutor instrutor = new Instrutor("Maria", "Musculação", 40);
        instrutor.darAula();
        instrutor.criarTreino();

        // Teste com Modalidade
        Modalidade modalidade = new Modalidade("Yoga", "Iniciante", 20);
        System.out.println(modalidade.getDescricao());

        // Teste com Equipamento
        Equipamento equipamento = new Equipamento("Esteira", "E001", false);
        equipamento.usar();
        equipamento.limpar();

        // Teste com Treino
        Treino treino = new Treino("Cardio", 30, 7.0);
        treino.iniciar();
        treino.terminar();

        // Teste com AvaliacaoFisica
        AvaliacaoFisica avaliacao = new AvaliacaoFisica(75, 1.75);
        avaliacao.relatorio();
        System.out.println("Diagnóstico: " + avaliacao.diag());

        // Teste com Pagamento
        Pagamento pagamento = new Pagamento(150, "10/05");
        pagamento.pagar();

        // Teste com Agenda
        Agenda agenda = new Agenda("Segunda", "06:00", "22:00");
        agenda.agendar(aluno, "19:00");

        // Teste com Unidade
        Unidade unidade = new Unidade("Rua X, 100", 200, 50);
        unidade.abrir();

        // Teste com Estatisticas
        Estatisticas estatisticas = new Estatisticas();
        estatisticas.addAluno();
        estatisticas.addFaturamento(150);
        estatisticas.relatorio();

        // Teste com Controller
        ctrl.matricular("Pedro", "456", 200);
    }
}
