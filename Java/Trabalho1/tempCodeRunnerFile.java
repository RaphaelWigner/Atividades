
import java.util.Scanner;

class Program {

    /* 1 arquivo chamado alunos|informações(Nome, Matricula, Idade)
       1 Arquivo de notas e disciplinas (matricula do aluno, disciplina : nota 1 e nota 2)
       Interligar os numeros de alunos e suas matriculas
       O usuario vai poder digitar o nome ou a matricula, as disciplinas do aluno e as notas deles e vai listar se está aprovado ou não


       O programa vai iniciar pergutando se quer registrar um aluno ou abrir a lista de alunos
       Caso for registrar, o usuario vai poder registrar o nome do aluno, sua nota, idade e matricula. O usuario vai digitar esses elementos e apos isso, vai atualizar o arquivo dentro
       Caso for abrir o arquivo, o arquivo será escrito no console, com as informações

       O programa deve ser capaz de atualizar as informações dos alunos caso o usuario deseja.
     */
    public String[] alunos = {};
    public int[] idade = {};
    public String[] Matricula = {};
    public float[] notas = {};

    public static void main(String[] args) {

        Scanner LerLinha = new Scanner(System.in);

        int escolha = LerLinha.nextInt();

        System.out.println("Registrar um aluno = 1" + "\n" + "Abrir lista de alunos e matriculas = 2");

        if (escolha == 1) {
            RegistrarAluno();

        }
        if (escolha == 2) {
            AbrirAlunos();
        }

    }

    static void RegistrarAluno() {
        System.out.println("Teste = 1");
    }

    static void AbrirAlunos() {
        System.out.println("Teste = 2");
    }
}
