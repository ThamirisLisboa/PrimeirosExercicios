import java.util.Scanner;

public class li��o1 {


	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int a, b, c;
	        System.out.println("Digite o primeiro n�mero: ");
	        a = input.nextInt();
	        System.out.println("Digite o segundo n�mero: ");
	        b = input.nextInt();
	        System.out.println("Digite o terceiro n�mero: ");
	        c = input.nextInt();
	        if (a > b && a > c) {
	            System.out.println("O primeiro n�mero � o maior.");
	        } else if (b > a && b > c) {
	            System.out.println("O segundo n�mero � o maior.");
	        } else {
	            System.out.println("O terceiro n�mero � o maior.");
	        }
	    }
	}
