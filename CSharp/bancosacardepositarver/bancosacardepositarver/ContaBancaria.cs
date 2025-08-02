using System;
using System.ComponentModel;
using System.Diagnostics;
using System.Dynamic;
using System.Runtime.CompilerServices;

namespace ContaBancaria
{
    public class BancariaConta
    {
        // get e set
        private string idbancariouuid = Guid.NewGuid().ToString();
        public string GetAccountUUID // invez de estar no construtor o uuid pode ser utilizado sendo chamado tambem aqui!
        {
            get { return idbancariouuid; }
        }

        private string nomedotitular = "";
        public string NomeDoTitular
        {
            get { return nomedotitular; }
            set { nomedotitular = value; }

        }
        private double saldo = 10000;
        public double Saldo
        {
            get { return saldo; }
            set { saldo = value; }
        }

        public BancariaConta(string nomepessoa,double money)
        {
            this.nomedotitular = nomepessoa;
            this.saldo = money;
        }
        // get e set

        // metodos para depositar, sacar e exibir o saldo atual da conta
        public void Depositar() // Metodo para depositar
        {
            Console.WriteLine("Deposite o seu valor");
            double deposit = Convert.ToDouble(Console.ReadLine());
            Saldo = deposit + Saldo;
            Console.WriteLine("O seu saldo agora é :" + Saldo);
        }
        public void Sacar() // Metodo para sacar, caso tiver menos, da como invalido
        {
            Console.WriteLine("Quanto deseja sacar?");
            double sacar = Convert.ToDouble(Console.ReadLine());

            if (sacar > saldo) { Console.WriteLine("Saldo insuficiente");}
            else
            {
                Saldo = Saldo - sacar;
                Console.WriteLine("seu saldo agora é :" + Saldo);
            }
        }
        public void VerSaldo() // Metodo para ver o saldo
        {
            Console.WriteLine("Seu saldo é : " + Saldo);
        }
        // Menu

        // Inicialização
    }
}