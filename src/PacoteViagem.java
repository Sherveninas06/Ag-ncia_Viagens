public class PacoteViagem {

    // Colocando objetos de outras classes dentro da classe PacoteViagem
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int dias;

    // Total da hospedagem = valor da diária × quantidade de dias
    public double calcularTotalHospedagem() {
        return hospedagem.getValorDiariaDolar() * dias;
    }

    // Lucro = valor + (valor × margem% / 100)
    public double calcularComLucro(double valor, double margem) {
        return valor + (valor * margem / 100);
    }

    // Total do pacote = lucro(transporte + total da hospedagem, margem) + taxas adicionais
    public double calcularTotalPacote(double margem, double taxasAdicionais) {

        double totalHospedagem = calcularTotalHospedagem();

        double valorBase = transporte.getValorDolar() + totalHospedagem;

        double valorComLucro = calcularComLucro(valorBase, margem);

        return valorComLucro + taxasAdicionais;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}