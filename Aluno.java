package controller;

import model.*;
import view.*;
import java.util.ArrayList;
import java.util.List;

public class AcademiaController {
    private List<Aluno> alunos;
    private View view;

    public AcademiaController() {
        this.alunos = new ArrayList<>();
        this.view = new AcademiaView();
    }

    public void matricular(String nome, String cpf, double valor) {
        Aluno novoAluno = new Aluno(nome, cpf, valor);
        alunos.add(novoAluno);
        view.msg("Matriculado: " + nome);
    }

    public View getView() {
        return view;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void removerAluno(String cpf) {
        alunos.removeIf(aluno -> aluno.getCpf().equals(cpf));
    }

    public Aluno buscarAluno(String cpf) {
        return alunos.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }
}
