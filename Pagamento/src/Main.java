public class Main {
    public static void main(String[] args) {

        // Criar um objeto da classe CartaoCredito e imprimir o cupom fiscal
        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.setNumCartao("1234-5678-9101-1121");
        cartaoCredito.setBandeiraCartao("Visa");
        cartaoCredito.setTitularCartao("João Silva");
        System.out.println(cartaoCredito.imprimirCupomFiscal());

        // Criar um objeto da classe Pix e imprimir o cupom fiscal
        Pix pix = new Pix();
        pix.setComprovanteTransacaoPix(true); // Exemplo de uso do setter
        System.out.println(pix.imprimirCupomFiscal());

        // Criar um objeto da classe CartaoDebito e imprimir o cupom fiscal
        CartaoDebito cartaoDebito = new CartaoDebito();
        cartaoDebito.setNumCartao("2233-4455-6677-8899");
        cartaoDebito.setTitularCartao("Maria Oliveira");
        System.out.println(cartaoDebito.imprimirCupomFiscal());
    }
}
