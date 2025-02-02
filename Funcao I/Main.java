
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tabuada();
        For();
        CalcularIMC();
        Fatorial();
        RealParaDollarParaReal();
        CalculoRetangulo();
        CalcularCirculo();
    }

    static void CalcularIMC() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Peso: ");
        float peso = scanner.nextFloat();

        float IMC = peso / (altura * altura);

        System.out.println("O índice de massa corporal do paciente é : " + IMC);

    }

    static void Fatorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("FATORIAL! Insera um numero");

        float Fat = scanner.nextFloat();
        float FatInicio = 1;

        for (int i = 1; i <= Fat; i++) {
            FatInicio *= i;

            System.out.println("Fat = " + FatInicio);

        }

    }

    static void For() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }

    }

    static void RealParaDollarParaReal() {
        Scanner scanner = new Scanner(System.in);

        float dollar = 1;
        float real = 4.80f * dollar;

        System.out.println("Conversão de dollar para real! Digite um Valor: ");
        float ValorDollar = scanner.nextFloat();

        float ResultadoFinal = ValorDollar * real;

        System.out.println("A conversão para real é... :" + ResultadoFinal);
    }

    static void CalculoRetangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de retangulo!");

        System.out.println("Altura :");
        float altura = scanner.nextFloat();
        System.out.println("Base :");
        float base = scanner.nextFloat();
        float A = base * altura;
        float P = (base * base) + (altura * altura);

        System.out.println("Area :" + A);
        System.out.println("Perimetro :" + P);
    }

    static void CalcularCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcular area de circulo e perimetro!");

        float PI = 3.14f;
        System.out.println("Raio: ");
        float raio = scanner.nextFloat();

        float A = PI * (raio * raio);

        float P = 2 * PI * raio;

        System.out.println("Perimetro: " + P);
        System.out.println("Area:" + A);

    }

    static void Tabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insera um numero que deseja ver a tabuada!");

        int NumeroOculto = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + NumeroOculto + "= " + i * NumeroOculto);
        }

    }
}
