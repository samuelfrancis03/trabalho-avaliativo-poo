package br.com.cotemig.trabalho.atividade2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SubMenuAtividade2 {

    static List<Cliente> listaDeCliente = new ArrayList<>();
    static List<Conta> listaDeConta = new ArrayList<>();
    public static void SubMenuCliente() {



        int loop = 1;

        while (loop == 1) {
            int opcaoSubMenuCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                    "\n1 - Cadastrar Cliente" +
                    "\n2 - Consultar Cliente" +
                    "\n3 - Remover Cliente" +
                    "\n4 - Atualizar Cliente" +
                    "\n0 - Menu Principal"));

            switch (opcaoSubMenuCliente) {
                case 0:
                    loop = 0;
                    break;
                case 1:
                    Cliente.Create(listaDeCliente);
                    break;
                case 2:

                   Cliente.Consultar(listaDeCliente);
                    break;
                case 3:
                    Cliente.Remover(listaDeCliente);
                    break;
                case 4:
                   Cliente.Atulizar(listaDeCliente);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

            }

        }


    }




    public static void SubMenuConta() {
        int loop = 1;


        while (loop == 1) {
            int opcaoSubMenuConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                    "\n1 - Cadastrar Conta para Cliente" +
                    "\n2 - Sacar dinheiro da Conta do Cliente" +
                    "\n3 - Depositar dinheiro da Conta do Cliente" +
                    "\n4 - Verificar saldo da Conta do Cliente" +
                    "\n5 - Transferir dinheiro da Conta do Cliente para outro Cliente" +
                    "\n0 - Menu Principal"));

            switch (opcaoSubMenuConta) {
                case 0:
                    loop = 0;
                    break;
                case 1:
                    Conta.Create(listaDeConta,listaDeCliente);
                    break;
                case 2:
                    Cliente cliente = Cliente.consultarCliente(listaDeCliente);
                    cliente.conta.sacar();
                    break;
                case 3:
                    Cliente cliente2 = Cliente.consultarCliente(listaDeCliente);
                    cliente2.conta.depositar();

                    break;
                case 4:
                    Cliente cliente3 = Cliente.consultarCliente(listaDeCliente);
                    cliente3.conta.saldoAtual();
                    break;
                case 5:
                    Cliente cliente4 = Cliente.pix(listaDeCliente);
                    cliente4.conta.transferir1();
                    Cliente cliente5 = Cliente.pix2(listaDeCliente);
                    cliente5.conta.transferir2();

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

            }
        }
    }

}
