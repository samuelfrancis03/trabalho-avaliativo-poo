package br.com.cotemig.trabalho.atividade1;

import javax.swing.*;

public class SubMenuAtividade1 {

    public static void SubMenuAluno() {
        int loop = 1;

        while (loop == 1) {
            int opcaoSubMenuAluno = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                    "\n1 - Cadastrar Aluno" +
                    "\n2 - Consultar Aluno" +
                    "\n3 - Remover Aluno" +
                    "\n4 - Atualizar Aluno" +
                    "\n0 - Menu Principal"));

            switch (opcaoSubMenuAluno) {
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

        public static void SubMenuDisciplina() {
            int loop = 1;

            while (loop == 1) {
                int opcaoSubMenuDisciplina = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                        "\n1 - Cadastrar Disciplina" +
                                "\n2 - Consultar Disciplina" +
                                "\n3 - Remover Disciplina" +
                                "\n4 - Atualizar Disciplina" +
                                "\n0 - Menu Principal"));

                switch (opcaoSubMenuDisciplina) {
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

    public static void SubMenuCurso() {
        int loop = 1;

        while (loop == 1) {
            int opcaoSubMenuCurso = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                    "\n1 - Cadastrar Disciplina" +
                    "\n2 - Consultar Disciplina" +
                    "\n3 - Remover Disciplina" +
                    "\n4 - Atualizar Disciplina" +
                    "\n0 - Menu Principal"));

            switch (opcaoSubMenuCurso) {
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




























































    }