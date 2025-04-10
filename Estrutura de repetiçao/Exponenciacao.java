import java.util.Scanner;
public class Exponenciacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int base, expoente, resultado;
      
        System.out.println("Digite o valor da base: ");
        base = input.nextInt();
        System.out.println("Digite o valor do expoente: ");
        expoente = input.nextInt();
      
        resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    
    input.close();

    }
}