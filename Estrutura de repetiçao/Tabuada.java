import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 10 para gerar a tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
        } else {
            // Gerar e imprimir a tabuada para o número fornecido pelo usuário
            System.out.println("Tabuada de " + numero + " é:");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
        scanner.close();
    }
}