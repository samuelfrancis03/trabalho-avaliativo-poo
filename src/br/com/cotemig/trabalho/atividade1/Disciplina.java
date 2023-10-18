package br.com.cotemig.trabalho.atividade1;

import javax.swing.*;
import java.util.List;

public class Disciplina {

    private int id;
    private String nome;
    private String cargaHoraria;
    private double nota;
    private List<Disciplina> disciplinas;

    public Disciplina(int id, String nome, String cargaHoraria, double nota) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    public static void Cadastro(List<Disciplina> listaDeDiciplinas){
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a ID da Disciplina: "));
        String cargaHoraria = JOptionPane.showInputDialog(null, "Informe a Carga Horária da Disciplina: ");
        String nome = JOptionPane.showInputDialog(null, "Informe o Nome da Disciplina: ");
        double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota da Disciplina: "));

        Disciplina cadastroDisciplina = new Disciplina(id, nome, cargaHoraria, nota);

        listaDeDiciplinas.add(cadastroDisciplina);
    }

    public  static void Consultar(List<Disciplina> listaDeDiciplinas){
        for (Disciplina d: listaDeDiciplinas) {

        }

        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID da Disciplina: "));
        Disciplina pegaId = listaDeDiciplinas.stream().filter(d -> d.id == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "ID: " + pegaId.id +
                    "\nCarga Horária: " + pegaId.cargaHoraria +
                    "\nNome: " + pegaId.nome +
                    "\nNota: " + pegaId.nota);

        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }
    }

    public static void Remover(List<Disciplina> listaDeDisciplinas){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID da Disciplina: "));
        Disciplina pegaId = listaDeDisciplinas.stream().filter(d -> d.id == busca).findFirst().orElse(null);

        if (pegaId != null){
            listaDeDisciplinas.remove(pegaId);
            JOptionPane.showMessageDialog(null,"ID " + busca + " removida!");
        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }
    }

    public static void Atulizar(List<Disciplina> listaDeDisciplinas){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID da Disciplina: "));
        Disciplina pegaId = listaDeDisciplinas.stream().filter(d -> d.id == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "ID: " + pegaId.id +
                    "\nCarga Horaria: " + pegaId.cargaHoraria +
                    "\nNome da Disciplina: " + pegaId.nome +
                    "\nNota da Disciplina: " + pegaId.nota);

            int verificaAtulizar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja alterar essa Disciplina: " +
                    "\n1 - Alterar" +
                    "\n2 - Cancelar"));

            if (verificaAtulizar == 1){
                pegaId.cargaHoraria = JOptionPane.showInputDialog(null, "Digite a Carga Horária: ");
                pegaId.nome = JOptionPane.showInputDialog(null, "Digite o Nome: ");
                pegaId.nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Nota: "));

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
