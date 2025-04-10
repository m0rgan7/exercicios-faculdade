import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int[] resultado = contarParesImpares(numero1, numero2);

        System.out.println("Quantidade de números pares: " + resultado[0]);
        System.out.println("Quantidade de números ímpares: " + resultado[1]);

        scanner.close();
    }

    public static int[] contarParesImpares(int num1, int num2) {
        int pares = 0;
        int impares = 0;

        // Verificar o 1o nmr
        if (num1 % 2 == 0) {
            pares++;
        } else {
            impares++;
        }

        // Verificar o 2o nmr
        if (num2 % 2 == 0) {
            pares++;
        } else {
            impares++;
        }

        return new int[]{pares, impares};
    }
}