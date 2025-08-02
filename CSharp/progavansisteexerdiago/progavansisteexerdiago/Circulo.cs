// Criar uma classe circulo que tenha um atributo de raio e dois metodos : calcular circuferencia e area
// Criar um metodo
namespace progavansisteexerdiago
{
    


using System;
class Circulo {
    private double PI = Math.PI;
    private double r;

    void CalcularCircuferencia()
    {
        // c = Circuferencia
        double c;
        c = 2 * PI * r;
        Console.WriteLine("Circuferencia : " + c);
    }

    void CalcularArea()
    {
        // a = area
        double a;
        a = PI * Math.Pow(r, 2);   
        Console.WriteLine("Area : " + a);
    }

    void InfoCirculo()
    {
    Console.WriteLine("Digite o valor do raio");
    r = Convert.ToDouble(Console.ReadLine());
    




    CalcularCircuferencia();
    CalcularArea();
    }

    public static void Main(string[] args)
    {
        Circulo cir = new Circulo();
    cir.InfoCirculo();

    }
}
}

