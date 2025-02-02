
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite um numero positivo");
        Scanner scanner = new Scanner(System.in);

        int Num = scanner.nextInt();
        int NumFinal = 0;

        boolean teste = Num > 1;

        while (Num > NumFinal) {
            Num--;
            System.out.println("Numero está em : " + Num);
        }
    }
}
