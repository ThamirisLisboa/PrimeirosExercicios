import java.util.Scanner;

public class Lição3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par");
            System.out.println("A raiz quadrada é: " + Math.sqrt(numero));
        } else {
            System.out.println("O número é ímpar");
            System.out.println("O número elevado ao quadrado é: " + Math.pow(numero, 2));
        }
    }
}