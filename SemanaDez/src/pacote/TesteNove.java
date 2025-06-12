package pacote;
import java.util.Scanner;

public class TesteNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Conta do Hotel ===");

        System.out.print("Nome do hóspede: ");
        String nome = scanner.nextLine();

        System.out.print("Tipo do apartamento (A, B, C ou D): ");
        String tipoApto = scanner.nextLine().toUpperCase();

        System.out.print("Número de diárias: ");
        int numDiarias = scanner.nextInt();

        System.out.print("Valor do consumo interno (R$): ");
        double consumo = scanner.nextDouble();

        double valorDiaria = 0.0;

        switch (tipoApto) {
            case "A":
                valorDiaria = 450.00;
                break;
            case "B":
                valorDiaria = 375.00;
                break;
            case "C":
                valorDiaria = 299.00;
                break;
            case "D":
                valorDiaria = 249.00;
                break;
            default:
                System.out.println("Tipo de apartamento inválido.");
                break;
        }

        double totalDiarias = valorDiaria * numDiarias;
        double subtotal = totalDiarias + consumo;
        double taxaServico = subtotal * 0.10;
        double totalGeral = subtotal + taxaServico;

        System.out.println("\n=== Conta Final ===");
        System.out.println("Nome do hóspede: " + nome);
        System.out.println("Tipo do apartamento: " + tipoApto);
        System.out.println("Número de diárias: " + numDiarias);
        System.out.printf("Valor da diária: R$ %.2f%n", valorDiaria);
        System.out.printf("Total das diárias: R$ %.2f%n", totalDiarias);
        System.out.printf("Consumo interno: R$ %.2f%n", consumo);
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Taxa de serviço (10%%): R$ %.2f%n", taxaServico);
        System.out.printf("Total geral: R$ %.2f%n", totalGeral);

        scanner.close();
    }
}
