
class exer1 {

    public static void main(String[] args) throws InterruptedException {
        Veiculo Veiculu = new Veiculo(1, 1, 1, 1, 1, 1, 1);

        Veiculu.getQuilometragem();
        Veiculu.setQuilometragem(5);

        Veiculu.getConsumoMedioCombustivel();
        Veiculu.setConsumoMedioCombustivel(10);

        System.out.println(Veiculu.getQuilometragem());

        System.out.println(Veiculu.getConsumoMedioCombustivel());

        System.out.println("Pecorrendo...");
        Thread.sleep(2000);

    }
}
