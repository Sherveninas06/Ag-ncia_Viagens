import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==============================
        // CLIENTE
        // ==============================

        System.out.print("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        // ==============================
        // TRANSPORTE
        // ==============================

        System.out.print("Digite o tipo de Transporte: ");
        String tipoTransporte = scanner.nextLine();

        System.out.print("Digite o valor do transporte em dolar: ");
        double valorTransporte = scanner.nextDouble();

        scanner.nextLine();

        Transporte transporte = new Transporte();

        transporte.setTipo(tipoTransporte);
        transporte.setValorDolar(valorTransporte);

        // ==============================
        // HOSPEDAGEM
        // ==============================

        System.out.print("Digite a descrição da hospedagem: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o valor da diária em dólar: ");
        double valorDiaria = scanner.nextDouble();

        scanner.nextLine();

        Hospedagem hospedagem = new Hospedagem();

        hospedagem.setDescricao(descricao);
        hospedagem.setValorDiariaDolar(valorDiaria);

        // ==============================
        // PACOTE DE VIAGEM
        // ==============================

        System.out.print("Digite o destino: ");
        String destino = scanner.nextLine();

        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        PacoteViagem pacote = new PacoteViagem();

        pacote.setTransporte(transporte);
        pacote.setHospedagem(hospedagem);
        pacote.setDestino(destino);
        pacote.setDias(dias);

        // ==============================
        // MARGEM E TAXAS
        // ==============================

        System.out.print("Digite a margem de lucro (%): ");
        double margem = scanner.nextDouble();

        System.out.print("Digite o valor das taxas adicionais em dólar: ");
        double taxasAdicionais = scanner.nextDouble();

        // Calcula o total do pacote
        double totalPacote = pacote.calcularTotalPacote(
                margem,
                taxasAdicionais
        );

        // Calcula o total da hospedagem
        double totalHospedagem = pacote.calcularTotalHospedagem();

        // Calcula o valor base
        double valorBase = transporte.getValorDolar()
                + totalHospedagem;

        // Calcula o valor com lucro
        double valorComLucro = pacote.calcularComLucro(
                valorBase,
                margem
        );

        // Calcula somente o lucro
        double lucro = valorComLucro - valorBase;

        // ==============================
        // VENDA
        // ==============================

        scanner.nextLine();

        System.out.print("Digite a forma de pagamento: ");
        String formaPagamento = scanner.nextLine();

        System.out.print("Digite a data da venda: ");
        String data = scanner.nextLine();

        Venda venda = new Venda();

        venda.setCliente(cliente);
        venda.setFormaPagamento(formaPagamento);
        venda.setData(data);
        venda.setPacote(pacote);

        // ==============================
        // COTAÇÃO DO DÓLAR
        // ==============================

        System.out.print("Digite a cotação do dolar em reais: ");
        double cotacao = scanner.nextDouble();

        // Converte o total para reais
        double totalReais = venda.calcularTotalReais(
                totalPacote,
                cotacao
        );

        // ==============================
        // NOTA FISCAL
        // ==============================

        System.out.println();
        System.out.println("==================================================");
        System.out.println("              NOTA FISCAL - VIAGEM");
        System.out.println("==================================================");

        System.out.println();
        System.out.println("CLIENTE");
        System.out.println("Nome: " + venda.getCliente());
        System.out.println("Data: " + venda.getData());
        System.out.println("Forma de pagamento: " + venda.getFormaPagamento());

        System.out.println();
        System.out.println("DADOS DA VIAGEM");
        System.out.println("Destino: " + pacote.getDestino());
        System.out.println("Transporte: " + transporte.getTipo());
        System.out.println("Hospedagem: " + hospedagem.getDescricao());
        System.out.println("Quantidade de dias: " + pacote.getDias());

        System.out.println();
        System.out.println("VALORES");

        System.out.println(
                "Transporte: US$ "
                + transporte.getValorDolar()
        );

        System.out.println(
                "Hospedagem: US$ "
                + totalHospedagem
        );

        System.out.println(
                "Valor base: US$ "
                + valorBase
        );

        System.out.println(
                "Margem de lucro: "
                + margem
                + "%"
        );

        System.out.println(
                "Lucro: US$ "
                + lucro
        );

        System.out.println(
                "Taxas adicionais: US$ "
                + taxasAdicionais
        );

        System.out.println();
        System.out.println(
                "TOTAL DO PACOTE: US$ "
                + totalPacote
        );

        System.out.println(
                "Cotação do dólar: R$ "
                + cotacao
        );

        System.out.println(
                "TOTAL DA VENDA: R$ "
                + totalReais
        );

        System.out.println();
        System.out.println("==================================================");
        System.out.println("              VENDA FINALIZADA");
        System.out.println("==================================================");

        scanner.close();
    }
}