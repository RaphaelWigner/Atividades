
import java.util.Scanner;

class Aula4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String[] nomesconhecidos = {"Mora", "Dstokvi", "Marta", "Bonce", "Bussy"};

        String AtribuirANomesDesconhecidos = "";

        while (true) {
            String entrada = ler.nextLine();

            if (entrada.equalsIgnoreCase("EXIT")) {
                System.out.println("Anotado...");
                break;
            }
            AtribuirANomesDesconhecidos += entrada + " ";
        }

        String[] nomesdesconhecidos = AtribuirANomesDesconhecidos.split(" ");

        for (int i = nomesconhecidos.length - 1; i >= 0; i--) {
            System.out.println(nomesconhecidos[i]);
        }
        System.out.println("Nomes Desconhecidos : ");
        for (int i = nomesdesconhecidos.length - 1; i >= 0; i--) {

            System.out.println(nomesdesconhecidos[i] + " ");

        }

        int[] NInteiro = {12, 241, 321, 43, 421, 6123, 721, 82, 9213, 2110, 1431, 1263, 1523, 1442, 1521, 14326, 172, 1854, 139, 203};
        for (int i = NInteiro.length - 1; i > 0; i--) {
            System.out.println(NInteiro[i] + 10 + " posição : " + i);
        }

        int soma = 0;
        int[] NinteiroMenor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i <= 19; i++) {
            System.out.println(NinteiroMenor[i]);

            if (NinteiroMenor[i] < 10) {
                soma += NinteiroMenor[i];

                System.out.println(soma);
            }

        }
    }
}
