package br.com.cotemig.trabalho.atividade1;

import javax.swing.*;

public class MenuPrincipalAtividade1 {

    public static void MenuPrincipalAtvd1() {
        int loop = 1;

        while (loop == 1) {
            int opcaoMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                    "\n1 - Gerenciar Alunos" +
                    "\n2 - Gerenciar Disciplinas" +
                    "\n3 - Gerenciar Cursos" +
                    "\n0 - Sair"));

            switch (opcaoMenuPrincipal) {
                case 0:
                    loop = 0;
                    break;
                case 1:
                    SubMenuAtividade1.SubMenuAluno();
                    break;
                case 2:
                    SubMenuAtividade1.SubMenuDisciplina();
                    break;
                case 3:
                    SubMenuAtividade1.SubMenuCurso();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

            }
        }

    }
}


