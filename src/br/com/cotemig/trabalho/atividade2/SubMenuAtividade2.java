package br.com.cotemig.trabalho.atividade2;

import javax.swing.*;

public class SubMenuAtividade2 {

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
                    JOptionPane.showMessageDialog(null, "Acessou Menu Gerenciar");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Acessou Menu Consultar");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Acessou Menu Remover");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Acessou Menu Atualizar");
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
                    JOptionPane.showMessageDialog(null, "Acessou Menu Cadastrar");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Acessou Menu Sacar");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Acessou Menu Depositar");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Acessou Menu Verificar");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Acessou Menu Transferir");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

            }
        }
    }

}
