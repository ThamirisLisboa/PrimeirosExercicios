import java.util.Scanner;

public class LI��o2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Digite o primeiro n�mero: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        num2 = input.nextInt();
        System.out.println("Digite o terceiro n�mero: ");
        num3 = input.nextInt();
        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num1 > num3) {
            int aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if (num2 > num3) {
            int aux = num2;
            num2 = num3;
            num3 = aux;
        }
        System.out.println("Os n�meros em ordem crescente s�o: " + num1 + " " + num2 + " " + num3);
    }
}

