package br.com.cotemig.trabalho.atividade1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SubMenuAtividade1 {

    public static void SubMenuAluno() {
        List<Aluno> listaDeAlunos = new ArrayList<>();
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
                    Aluno.Cadastro(listaDeAlunos);
                    break;
                case 2:
                    Aluno.Consultar(listaDeAlunos);
                    break;
                case 3:
                    Aluno.Remover(listaDeAlunos);
                    break;
                case 4:
                    Aluno.Atulizar(listaDeAlunos);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

            }
        }
    }

        public static void SubMenuDisciplina() {
            List<Disciplina> listaDeDisciplinas = new ArrayList<>();
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
                        Disciplina.Cadastro(listaDeDisciplinas);
                        break;
                    case 2:
                        Disciplina.Consultar(listaDeDisciplinas);
                        break;
                    case 3:
                        Disciplina.Remover(listaDeDisciplinas);
                        break;
                    case 4:
                        Disciplina.Atulizar(listaDeDisciplinas);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

                }

            }

        }

    public static void SubMenuCurso() {
        List<Curso> listaDeCursos = new ArrayList<>();
        int loop = 1;

        while (loop == 1) {
            int opcaoSubMenuCurso = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um serviço para acessar: " +
                    "\n1 - Cadastrar Curso" +
                    "\n2 - Consultar Curso" +
                    "\n3 - Remover Curso" +
                    "\n4 - Atualizar Curso" +
                    "\n0 - Menu Principal"));

            switch (opcaoSubMenuCurso) {
                case 0:
                    loop = 0;
                    break;
                case 1:
                    Curso.Cadastro(listaDeCursos);
                    break;
                case 2:
                    Curso.Consultar(listaDeCursos);
                    break;
                case 3:
                    Curso.Remover(listaDeCursos);
                    break;
                case 4:
                    Curso.Atulizar(listaDeCursos);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente!");

            }

        }

    }




























































    }