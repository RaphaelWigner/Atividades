
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
    private ArrayList<String> alunos = new ArrayList<>();
    private ArrayList<Integer> idades = new ArrayList<>();
    private ArrayList<Integer> cursos = new ArrayList<>();
    /* Cursos:
     * 120432 - Sistemas de Informação
     * 430212 - Análise e Desenvolvimento de Sistemas
     * 202132 - Engenharia
     * 099323 - Projeto Interdisciplinar
     */
    private ArrayList<Float> notas = new ArrayList<>();
    private ArrayList<Integer> CodigoDisciplina = new ArrayList<>();

    public static void main(String[] args) {
        //Esquisito
        Program pogramis = new Program();
        Anotacoes anotations = pogramis.new Anotacoes();
        //Esquisito
        System.out.println("Registrar um aluno = 1" + "\n" + "Abrir lista de alunos e matriculas = 2" + "\n" + "Cursos" + "\n" + "120432 - Sistemas de Informação" + "\n" + "430212 - Análise e Desenvolvimento de Sistemas" + "\n" + "202132 - Engenharia" + "\n" + "099323 - Projeto Interdisciplinar" + "\n");
        Scanner LerLinha = new Scanner(System.in);
        // Aqui o usuario tem a escolha de entre registro ou abrir algum arquivo
        int escolha = LerLinha.nextInt();

        if (escolha == 1) {
            anotations.RegistrarAluno();

        }
        if (escolha == 2) {
            anotations.AbrirAlunos();
        }
        LerLinha.close();
    }

    public class Anotacoes {

        public void RegistrarAluno() {
            Scanner registro = new Scanner(System.in);
            // Guarda as informações
            System.out.println("Informações do aluno : ");
            System.out.println("Nome : ");
            String registrar1 = registro.nextLine();

            System.out.println("Idade : ");
            int registrar2 = registro.nextInt();
            registro.nextLine();

            System.out.println("Matrícula : ");
            int registrar3 = registro.nextInt();

            System.out.println("Nota 1 : ");
            float registrar4 = registro.nextFloat();
            registro.nextLine();

            System.out.println("Nota 2 : ");
            float registrar5 = registro.nextFloat();
            registro.nextLine();
            // Guarda as informações

            // Esses nextLines servem para consumir a quebra na leitura no console
            alunos.add(registrar1);
            idades.add(registrar2);
            cursos.add(registrar3);
            notas.add(registrar4);
            notas.add(registrar5);

            // Debug
            System.out.println(alunos + " Debug");
            System.out.println(idades + " Debug");
            System.out.println(cursos + " Debug");
            System.out.println(notas + " Debug");
            // isso é o caminho "trabalho1"

            try (FileWriter FileRegistro = new FileWriter("trabalho1.txt", true); FileWriter FileAlunos = new FileWriter("Alunos.txt", true)) {    //Formato para salvar

                FileRegistro.write("\n" + "Registro do " + registrar1 + ";" + "Nome : " + registrar1 + ";" + "Idade : " + registrar2 + ";" + "Curso : " + registrar3 + ";" + "Nota 1 : " + registrar4 + ";" + "Nota 2 : " + registrar5 + ";");
                FileAlunos.write("\n" + registrar1 + ";");

            } catch (IOException e) {
                System.out.println("Erro");
                e.printStackTrace();
            }

        }

        public void AbrirAlunos() {
            System.out.println("Teste = 2");
        }
    }
}
