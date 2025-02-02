
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    private int PontuacaoJogador = 0;
    private final int Pontos = 100;

    void game() {
        Scanner leitura = new Scanner(System.in);
        Random gerador = new Random();

        int x = 0;

        while (x < 10) {

            int chute = gerador.nextInt(4);

            System.out.println("Chute um numero de 0 a 3!");
            int RespostaJogo = leitura.nextInt();

            if (RespostaJogo == chute) {
                System.out.println("Você ganhou 25 pontos!");
                PontuacaoJogador += 25;
            } else {
                System.out.println("Errou!");
            }
            x++;
            if (PontuacaoJogador == Pontos) {
                System.out.println("Parabens você ganhou!");
                break;
            }
        }
        if (PontuacaoJogador < Pontos) {
            System.out.println("Você perdeu, que pena");
        }
    }
}
