import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Nota;

        do {
            System.out.println("Digite um numero de 1 a 10:");
            Nota = scanner.nextInt();

            if (Nota < 1 || Nota > 10) {
                System.out.println("Numero invalido, digite novamente");
            }
        } while (Nota < 1 || Nota > 10);
        
        System.out.println("Valido");

        scanner.close();
    }
}