import java.util.Scanner;

public class Li��o3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um n�mero: ");
        numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O n�mero � par");
            System.out.println("A raiz quadrada �: " + Math.sqrt(numero));
        } else {
            System.out.println("O n�mero � �mpar");
            System.out.println("O n�mero elevado ao quadrado �: " + Math.pow(numero, 2));
        }
    }
}