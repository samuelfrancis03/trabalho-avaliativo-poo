package br.com.cotemig.trabalho.atividade1;

import jdk.nashorn.internal.ir.WhileNode;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int id;
    private String instituicao;
    private String nome;
    private  double valor;

    List<Disciplina> cursoDisciplina;
    List<Curso> cursos;

    public Curso(int id, String instituicao, String nome, double valor) {
        this.id = id;
        this.instituicao = instituicao;
        this.nome = nome;
        this.valor = valor;
        this.cursoDisciplina = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Disciplina> getCursoDisciplina() {
        return cursoDisciplina;
    }

    public void setCursoDisciplina(List<Disciplina> cursoDisciplina) {
        this.cursoDisciplina = cursoDisciplina;
    }

    public static void Cadastro(List<Curso> listaDeCursos, List<Disciplina> listaDeDisciplinas){
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a ID do Curso: "));
        String instituicao = JOptionPane.showInputDialog(null, "Informe a Instituição do Curso: ");
        String nome = JOptionPane.showInputDialog(null, "Informe o Nome do Curso: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Valor do Curso: "));
        int diciplinas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da Disciplinas que deseja incluir no Curso: \n(0 - Sair)"));
        Disciplina aux;

        Curso cadastroCurso = new Curso(id, instituicao, nome, valor);

       while (diciplinas != 0){
           for (Disciplina d: listaDeDisciplinas) {
               if (d.getId() == diciplinas){
                   aux = d;
                   cadastroCurso.cursoDisciplina.add(d);
               }
           }

           diciplinas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da Disciplinas que deseja incluir no Curso: \n(0 - Sair)"));
       }

       listaDeCursos.add(cadastroCurso);
    }

    public  static void Consultar(List<Curso> listaDeCursos){
        for (Curso c: listaDeCursos) {

        }


        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do Curso: "));
        Curso pegaId = listaDeCursos.stream().filter(c -> c.id == busca).findFirst().orElse(null);
        List<Disciplina> pegaDisciplina = pegaId.cursoDisciplina;

        if (pegaId != null) {

            String retornaDiciplina = "";
            for (Disciplina d: pegaDisciplina) {

                retornaDiciplina += "\nID: " + d.getId() +
                                    "\nNome: " + d.getNome() +
                                    "\nCarga Horária" + d.getCargaHoraria() +
                                    "\nNota: " + d.getNota() +
                                    "\n ------------------ \n";

            }

            JOptionPane.showMessageDialog(null, "ID: " + pegaId.id +
                    "\nInstituição: " + pegaId.instituicao +
                    "\nNome: " + pegaId.nome +
                    "\nValor: " + pegaId.valor +
                    "\n--------------------------" +
                    "\nDisciplinas\n " +
                    retornaDiciplina);

        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }



    }

    public static void Remover(List<Curso> listaDeCursos){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do Curso: "));
        Curso pegaId = listaDeCursos.stream().filter(c -> c.id == busca).findFirst().orElse(null);

        if (pegaId != null){
            listaDeCursos.remove(pegaId);
            JOptionPane.showMessageDialog(null,"ID " + busca + " removido!");
        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }
    }

    public static void Atulizar(List<Curso> listaDeCursos){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do Curso: "));
        Curso pegaId = listaDeCursos.stream().filter(c -> c.id == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "ID: " + pegaId.id +
                    "\nInstituição: " + pegaId.instituicao +
                    "\nNome do Curso: " + pegaId.nome +
                    "\nValor do Curso: " + pegaId.valor);

            int verificaAtulizar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja alterar esse Curso: " +
                    "\n1 - Alterar" +
                    "\n2 - Cancelar"));

            if (verificaAtulizar == 1){
                pegaId.instituicao = JOptionPane.showInputDialog(null, "Digite a Instituição: ");
                pegaId.nome = JOptionPane.showInputDialog(null, "Digite o Nome: ");
                pegaId.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Valor: "));

            } else {
                return;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }


    }



}
