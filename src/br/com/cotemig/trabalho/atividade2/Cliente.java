package br.com.cotemig.trabalho.atividade2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    int CPF;
    String nome;
    String endereco;
     Conta conta;

    public Cliente(int CPF, String nome, String endereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;

    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void addConta(Conta conta) {
      this.conta = conta;
    }



    public static void Create(List<Cliente> listaDeCliente) {

        int CPF = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe seu CPF: " ));

        String nome = (JOptionPane.showInputDialog(null, "Informe seu nome: " ));



        String endereco = (JOptionPane.showInputDialog(null, "Informe seu endereco: " ));



        Cliente cliente = new Cliente(CPF,nome, endereco);

        listaDeCliente.add(cliente);

    }



    public  static Cliente consultarCliente(List<Cliente> listaDeCliente) {
        for (Cliente c : listaDeCliente) {

        }

        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o CPF: "));
        Cliente pegaId = listaDeCliente.stream().filter(c -> c.CPF == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "CPF: " + pegaId.CPF +
                    "\nNome: " + pegaId.nome +
                    "\nEndereco: " + pegaId.endereco);

        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }
        return pegaId;
    }

    public  static Cliente pix(List<Cliente> listaDeCliente) {
        for (Cliente c : listaDeCliente) {

        }

        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o CPF de qual conta deseja sacar o dinheiro: "));
        Cliente pegaId = listaDeCliente.stream().filter(c -> c.CPF == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "CPF: " + pegaId.CPF +
                    "\nNome: " + pegaId.nome +
                    "\nEndereco: " + pegaId.endereco);

        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }
        return pegaId;
    }
    public  static Cliente pix2(List<Cliente> listaDeCliente) {
        for (Cliente c : listaDeCliente) {

        }

        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o CPF da conta que receberá o dinehiro: "));
        Cliente pegaId = listaDeCliente.stream().filter(c -> c.CPF == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "CPF: " + pegaId.CPF +
                    "\nNome: " + pegaId.nome +
                    "\nEndereco: " + pegaId.endereco);

        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }
        return pegaId;
    }

    public  static void Consultar(List<Cliente> listaDeCliente){
        for (Cliente c: listaDeCliente) {

        }

        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o CPF: "));
        Cliente pegaId = listaDeCliente.stream().filter(c -> c.CPF == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "CPF: " + pegaId.CPF +
                  "\nNome: " + pegaId.nome +
                  "\nEndereco: " + pegaId.endereco);

        } else {
            JOptionPane.showMessageDialog(null, "ID não encontrado. Tente novamente!");
        }
    }


    public static void Remover(List<Cliente> listaDeCliente){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o CPF: "));
        Cliente pegaId = listaDeCliente.stream().filter(d -> d.CPF == busca).findFirst().orElse(null);

        if (pegaId != null){
            listaDeCliente.remove(pegaId);
            JOptionPane.showMessageDialog(null,"CPF " + busca + " removido!");
        } else {
            JOptionPane.showMessageDialog(null, "CPF não encontrado. Tente novamente!");
        }
    }

    public static void Atulizar(List<Cliente> listaDeCliente){
        int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o CPF: "));
        Cliente pegaId = listaDeCliente.stream().filter(c -> c.CPF == busca).findFirst().orElse(null);

        if (pegaId != null) {
            JOptionPane.showMessageDialog(null, "CPF: " + pegaId.CPF +
                    "\nNome : " + pegaId.nome +
                    "\nEndereco: " + pegaId.endereco);

            int verificaAtulizar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja alterar essa CPF: " +
                    "\n1 - Alterar" +
                    "\n2 - Cancelar"));

            if (verificaAtulizar == 1){
                pegaId.CPF = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo CPF: "));
                pegaId.nome = JOptionPane.showInputDialog(null, "Digite o novo Nome: ");
                pegaId.endereco = (JOptionPane.showInputDialog(null, "Digite o novo endereco: "));


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
