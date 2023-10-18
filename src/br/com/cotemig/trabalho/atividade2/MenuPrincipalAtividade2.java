package br.com.cotemig.trabalho.atividade2;

import javax.swing.*;

public class MenuPrincipalAtividade2 {

    public static void MenuPrincipalAtvd2() {
        int loop = 1;

        while (loop == 1) {
            int opcaoMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                    "\n1 - Gerenciar Clientes" +
                    "\n2 - Gerenciar Contas" +
                    "\n0 - Sair"));

            switch (opcaoMenuPrincipal) {
                case 0:
                    loop = 0;
                    break;
                case 1:
                    SubMenuAtividade2.SubMenuCliente();
                    break;
                case 2:
                    SubMenuAtividade2.SubMenuConta();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

            }
        }

    }

}
