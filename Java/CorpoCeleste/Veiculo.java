
public class Veiculo {

    private int Ocupantes;
    private int Rodas;
    private float CapacidadeMaximaCombustivel;
    private float NivelAtualCombustivelPercentual;
    private float ConsumoMedioCombustivel;
    private float Quilometragem;
    private float Autonomia;

    public int getOcupantes() {
        return this.Ocupantes;
    }

    public void setOcupantes(int Ocupantes) {
        this.Ocupantes = Ocupantes;
    }

    public int getRodas() {
        return this.Rodas;
    }

    public void setRodas(int Rodas) {
        this.Rodas = Rodas;
    }

    public float getCapacidadeMaximaCombustivel() {
        return this.CapacidadeMaximaCombustivel;
    }

    public void setCapacidadeMaximaCombustivel(float CapacidadeMaximaCombustivel) {
        this.CapacidadeMaximaCombustivel = CapacidadeMaximaCombustivel;
    }

    public float getNivelAtualCombustivelPercentual() {
        return this.NivelAtualCombustivelPercentual;
    }

    public void setNivelAtualComustivelPercentual(float NivelAtualCombustivelPercentual) {
        this.NivelAtualCombustivelPercentual = NivelAtualCombustivelPercentual;
    }

    public float getAutonomia() {
        return this.Autonomia;
    }

    public void setAutonomia(float Autonomia) {
        this.Autonomia = Autonomia;
    }

    public float getQuilometragem() {
        return this.Quilometragem;
    }

    public void setQuilometragem(float Quilometragem) {
        this.Quilometragem = Quilometragem;
    }

    public float getConsumoMedioCombustivel() {
        return this.ConsumoMedioCombustivel;
    }

    public void setConsumoMedioCombustivel(float ConsumoMedioCombustivel) {
        this.ConsumoMedioCombustivel = ConsumoMedioCombustivel;

    }

    public float Pecorrer(float qtdQuilometros) {
        this.Quilometragem += qtdQuilometros;
        return this.Quilometragem;
    }

    public Veiculo(int Ocupantes, int Rodas, float CapacidadeMaximaCombustivel, float NivelAtualCombustivelPercentual,
            float ConsumoMedioCombustivel, float Quilometragem, float Autonomia) {
        this.Ocupantes = Ocupantes;
        this.Rodas = Rodas;
        this.CapacidadeMaximaCombustivel = CapacidadeMaximaCombustivel;
        this.NivelAtualCombustivelPercentual = NivelAtualCombustivelPercentual;
        this.ConsumoMedioCombustivel = ConsumoMedioCombustivel;
        this.Quilometragem = Quilometragem;
        this.Autonomia = Autonomia;
    }

    public static class Carro extends Veiculo {

        private String ModelodoCarro;
        private int QuantidadeDePortas;

        public Carro(String ModelodoCarro, int QuantidadeDePortas, int Ocupantes, int Rodas, float CapacidadeMaximaCombustivel, float NivelAtualCombustivelPercentual, float ConsumoMedioCombustivel, float Quilometragem, float Autonomia) {

            super(Ocupantes, Rodas, CapacidadeMaximaCombustivel, NivelAtualCombustivelPercentual,
                    ConsumoMedioCombustivel, Quilometragem, Autonomia);
        }

    }

}
