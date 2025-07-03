import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        SistemaCadastro cadastro = new SistemaCadastro();
        int opcao;

        while (true) {
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar todos os alunos");
            System.out.println("3. Buscar aluno por matrícula");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = teclado.nextLine();

                    System.out.print("Digite a matrícula: ");
                    int matricula = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Digite o curso: ");
                    String curso = teclado.nextLine();

                    Aluno novoAluno = new Aluno(nome, curso, matricula);
                    cadastro.addAluno(novoAluno);
                    break;

                case 2:
                    cadastro.listarAlunos();
                    break;

                case 3:
                    System.out.print("Digite a matrícula do aluno: ");
                    int buscaMatricula = teclado.nextInt();

                    Aluno encontrado = cadastro.buscarAluno(buscaMatricula);
                    if (encontrado != null) {
                        System.out.println("Aluno encontrado:");
                        encontrado.exibeInfo();
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    teclado.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
