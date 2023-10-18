import br.com.cotemig.trabalho.atividade1.MenuPrincipalAtividade1;
import br.com.cotemig.trabalho.atividade2.MenuPrincipalAtividade2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    int opcaoMenu, loop;

    JOptionPane.showMessageDialog(null, "Bem vindo ao Trabalho Prático de POO" +
                                                                    "\nFaculdade COTEMIG - 2023" +
                                                                    "\nAlunos: Samuel Francis | Caio Alves Almeida" +
                                                                    "\nProfessor: Lucas Schmidt");

    loop = 1;
    opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de atividades: " +
                                                                "\n1 - Atividade 1" +
                                                                "\n2 - Atividade 2" +
                                                                "\n0 - Sair"));

    while (loop == 1){

        switch (opcaoMenu){
            case 0:
                loop = 0;
                break;
            case 1:
                MenuPrincipalAtividade1 menuPrincipal1 = new MenuPrincipalAtividade1();
                MenuPrincipalAtividade1.MenuPrincipalAtvd1();
                break;

            case 2:
                MenuPrincipalAtividade2 menuPrincipal2 = new MenuPrincipalAtividade2();
                MenuPrincipalAtividade2.MenuPrincipalAtvd2();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

        }
    }
    }




}
