import java.util.Scanner;

public class Li��o4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();
        if (idade >= 10 && idade <= 14) {
            System.out.println("Infantil");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade inv�lida");
        }
    }
}