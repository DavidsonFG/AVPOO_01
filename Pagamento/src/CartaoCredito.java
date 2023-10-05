public class CartaoCredito extends Pagamento {
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    // ... Constructors, if necessary ...

    public String imprimirCupomFiscal() {
        return "Cupom Fiscal - Cartão de Crédito: " + numCartao;
    }

    // Getters
    public String getNumCartao() {
        return numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    // Setters
    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }
}
