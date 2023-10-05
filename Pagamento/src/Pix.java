public class Pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    // ... Constructors, if necessary ...

    public String imprimirCupomFiscal() {
        return "Cupom Fiscal - Pix";
    }

    // Getter
    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    // Setter
    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }
}
