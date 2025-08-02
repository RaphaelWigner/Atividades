using ContaBancaria;

namespace Program
{
    public class Program
    {
        public void Menu(BancariaConta Cbb) // Menu
        {
            while (true)
            {
                int X;
                X = Convert.ToInt16(Console.ReadLine());
                switch (X)
                {
                    case 1:
                        Cbb.Sacar();
                        break;
                    case 2:
                        Cbb.Depositar();
                        break;
                    case 3:
                        Cbb.VerSaldo();
                        break;
                    case 0:
                        return;
                    default:
                        Console.WriteLine("Digite um numero menor que 0!");
                        break;
                }
            }
        }

            static void Main(string[] args)
            {
                Console.WriteLine("1 = Sacar" + "\n" + "2 = Depositar" + "\n" + "3 = Ver Saldo" + "\n" + "0 = Sair do Programa");
                BancariaConta Cbb = new BancariaConta("José", 10000);
                Program acc = new Program();
                string uuid = Cbb.GetAccountUUID;
                Console.WriteLine(uuid);
                acc.Menu(Cbb);
            }
        }
    }