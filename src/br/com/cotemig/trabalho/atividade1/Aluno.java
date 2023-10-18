package br.com.cotemig.trabalho.atividade1;

import javax.swing.*;
import java.util.List;

public class Aluno {

    private int matricula;
    private int cpf;
    private  String nome;
    private  int telefone;
    private String email;
    private List <Aluno> alunos;

    public Aluno(int matricula, int cpf, String nome, int telefone, String email) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public static void Cadastro(List<Aluno> listaDeAlunos){
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula do aluno: "));
        int cpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o CPF do aluno: "));;
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o telefone do aluno: "));;
        String email = JOptionPane.showInputDialog(null, "Informe o email do aluno: ");

        Aluno cadastroAluno = new Aluno(matricula, cpf, nome, telefone, email);

        listaDeAlunos.add(cadastroAluno);
    }

    public  static void Consultar(List<Aluno> listaDeAlunos){
        for (Aluno a: listaDeAlunos) {

        }

        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula do aluno: "));
        Aluno pegaMatricula = listaDeAlunos.stream().filter(a -> a.matricula == busca).findFirst().orElse(null);

        if (pegaMatricula != null) {
            JOptionPane.showMessageDialog(null, "Matricula: " + pegaMatricula.matricula +
                    "\nCPF: " + pegaMatricula.cpf +
                    "\nNome: " + pegaMatricula.nome +
                    "\nTelefone: " + pegaMatricula.telefone +
                    "\nEmail: " + pegaMatricula.email);

        } else {
            JOptionPane.showMessageDialog(null, "Matricula não encontrado. Tente novamente!");
        }
    }

    public static void Remover(List<Aluno> listaDeAlunos){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula do aluno: "));
        Aluno pegaMatricula = listaDeAlunos.stream().filter(a -> a.matricula == busca).findFirst().orElse(null);

        if (pegaMatricula != null){
            listaDeAlunos.remove(pegaMatricula);
            JOptionPane.showMessageDialog(null,"Matricula " + busca + " removida!");
        } else {
            JOptionPane.showMessageDialog(null, "Matricula não encontrado. Tente novamente!");
        }
    }

    public static void Atulizar(List<Aluno> listaDeAlunos){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula do aluno: "));
        Aluno pegaMatricula = listaDeAlunos.stream().filter(a -> a.matricula == busca).findFirst().orElse(null);

        if (pegaMatricula != null) {
            JOptionPane.showMessageDialog(null, "Matricula: " + pegaMatricula.matricula +
                    "\nCPF: " + pegaMatricula.cpf +
                    "\nNome: " + pegaMatricula.nome +
                    "\nTelefone: " + pegaMatricula.telefone +
                    "\nEmail: " + pegaMatricula.email);

            int verificaAtulizar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja alterar está matricula: " +
                    "\n1 - Alterar" +
                    "\n2 - Cancelar"));

            if (verificaAtulizar == 1){
                pegaMatricula.nome = JOptionPane.showInputDialog(null, "Digite o Nome: ");
                pegaMatricula.telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Telefone: "));
                pegaMatricula.email = JOptionPane.showInputDialog(null, "Digite o Email");

            } else {
                return;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Matricula não encontrado. Tente novamente!");
        }


    }

}


