package br.com.cotemig.trabalho.atividade2;


import javax.swing.*;
import java.util.List;

public class Conta {
    Cliente cliente;

    int agencia;
    double saldo;

    public Conta(Cliente cliente, int agencia){
        this.cliente = cliente;

        this.agencia = agencia;
        this.saldo = 0;
    }

    public static void Create(List<Conta> listaDeConta, List<Cliente> listaDeCliente) {

        Cliente cliente = Cliente.consultarCliente(listaDeCliente);

        int agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua agencia: " ));




        Conta conta = new Conta(cliente,agencia);
        cliente.conta= conta;

        listaDeConta.add(conta);

    }

    public void sacar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quanto deseja sacar: " ));
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }



    public void depositar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quanto deseja depositar: " ));
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor negativo");
        }
    }


    public void saldoAtual(){

       JOptionPane.showMessageDialog(null, "Seu Saldo é: "+ cliente.conta.saldo);
    }

    public double quanto(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe quanto deseja sacar: " ));
        return valor;
    }

    public double transferir1(){
       double quanto = cliente.conta.quanto();
        if (quanto > 0 && quanto <= this.saldo) {
            this.saldo -= quanto;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return quanto;
    }

    public void transferir2() {
        double quanto = cliente.conta.transferir1();
        if (quanto > 0) {
            this.saldo += quanto;
        } else {
            System.out.println("Valor negativo");
        }
    }


}


