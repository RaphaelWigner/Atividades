
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class LeituradeArquivo {

    private String c;

    public static void main(String[] args) {

        LeituradeArquivo leitor = new LeituradeArquivo();

        Scanner ler = new Scanner(System.in);

        System.out.println("Coloque o nome do arquivo que deseja acessar: ");
        leitor.setc(ler.nextLine());

        leitor.LerArquivos();

        ler.close();
    }

    public String getc() {
        return c;
    }

    public void setc(String c) {
        this.c = c;
    }

    public void LerArquivos() {
        Scanner GravarLinha = new Scanner(System.in);
        String caminho = getc();

        System.out.println("Caso queira sair, digite EXIT");

        while (true) {
            System.out.println("Digite uma linha para ser gravada:");

            String gravar = GravarLinha.nextLine();

            if (gravar.equalsIgnoreCase("EXIT")) {
                System.out.println("Você saiu do programa.");
                break;
            }

            try (FileWriter file = new FileWriter(caminho, true)) {
                file.write(gravar + "\n");
            } catch (IOException e) {
                System.out.println("Erro ao gravar no arquivo.");
                e.printStackTrace();
            }
        }

        GravarLinha.close();

        System.out.println("\n Conteúdo do arquivo '" + caminho + "':");
        try (Scanner leitorArquivo = new Scanner(new File(caminho))) {
            while (leitorArquivo.hasNextLine()) {
                System.out.println(leitorArquivo.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        }
    }
}
