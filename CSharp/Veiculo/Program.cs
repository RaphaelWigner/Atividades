using System.ComponentModel;
using System.Security.Cryptography.X509Certificates;


class Campo_{
    static void Main(string[] args){
        Veiculuu.Componentes();

    } 



}










static class Veiculuu{

    public static void Componentes(){
    int Ocupantes;
    int Rodas;
    float CombustivelAtual;
    float CombustivelMaximo_L;
    float NiveldoCombustivelPorcetagem;
    float ConsumoMedioKmLitro;
    float QuantiaQuePodePecorrer;


    
    CombustivelAtual = float.Parse(Console.ReadLine());
    CombustivelMaximo_L = 55;
    NiveldoCombustivelPorcetagem = (CombustivelAtual - CombustivelMaximo_L);
    double x = Math.Pow(NiveldoCombustivelPorcetagem, -2);
    Console.WriteLine("Hello, World : " + CombustivelAtual);
        Console.WriteLine("Hello, World : " + CombustivelMaximo_L);
    Console.WriteLine("Hello, World : " + x + "%");
    



         }
     }