public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    // ... Constructors, if necessary ...

    public String imprimirCupomFiscal() {
        return "Cupom Fiscal - Cartão de Débito: " + numCartao;
    }

    // Getters
    public String getNumCartao() {
        return numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    // Setters
    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }
}
