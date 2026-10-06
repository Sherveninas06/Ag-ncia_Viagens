public class Venda {

    // Encapsulamento
    private String cliente;
    private String formaPagamento;
    private String data;
    private PacoteViagem pacote;

    // Conversão dólar -> reais
    public double calcularTotalReais(double totalDolar, double cotacao) {
        return totalDolar * cotacao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }

    public void setPacote(PacoteViagem pacote) {
        this.pacote = pacote;
    }
}