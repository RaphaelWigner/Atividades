
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Jogo jogu = new Jogo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o dia da semana? :");
        String dia = scanner.nextLine().trim();
        if (dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo")) {
            System.out.println("Bom final de semana!");
        } else {
            System.out.println("Boa Semana!");
        }
        System.out.println("Digite um numero inteiro");

        int NumeroInt = scanner.nextInt();
        System.out.println(NumeroInt);

        if (NumeroInt < 0) {
            System.out.println("Seu numero é negativo!");
        } else {
            System.out.println("Seu numero é positivo!");
        }

        System.out.println("Quer jogar uma gameyplis? 1 = Sim, 2 = Não");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            jogu.game();
        }
        if (resposta == 2) {
            System.out.println("Tenha um bom dia!");
        }

    }
}
