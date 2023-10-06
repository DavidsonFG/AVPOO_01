import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {
        // d) e e) Criando, inicializando, e manipulando objeto AchadoPerdido
        AchadoPerdido achadoPerdido = new AchadoPerdido("Chave de Carro", "Chave de carro preta", "Chave", "Encontrado");

        // Preencher mais dados
        achadoPerdido.completaDados("FotoXYZ.jpg", "Biblioteca", "04/10/2023 10:30");

        // Usando Scanner para entrada de texto pelo teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do item que está procurando:");
        String tituloBuscado = scanner.nextLine();

        // Buscar título e visualizar detalhes
        System.out.println(achadoPerdido.buscaTitulo(tituloBuscado));
        achadoPerdido.visualizarDetalhes();

        scanner.close(); // não esquecer de fechar o scanner
    }
}
