public class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    // a) Construtores, setters e getters
    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
        // os restantes serão definidos pelo método completaDados ou pelos setters
    }

    public void completaDados(String foto, String localAchado, String dataHora) {
        this.foto = foto;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
    }

    // Incluir aqui os métodos setters e getters...

    // b) Método buscarTitulo
    public String buscaTitulo(String titulo) {
        if(this.titulo.equalsIgnoreCase(titulo)) {
            return "Título: " + this.titulo + ", Descrição: " + descricao + ", Local: " + localAchado;
        }
        return "Não encontrado";
    }

    // c) Método visualizarDetalhes
    public void visualizarDetalhes() {
        System.out.println("Título: " + titulo + "\nFoto: " + foto + "\nLocal: " + localAchado + "\nTipo: " + tipo + "\nStatus: " + status);
    }
}
