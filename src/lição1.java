import java.util.Scanner;

public class lição1 {


	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int a, b, c;
	        System.out.println("Digite o primeiro número: ");
	        a = input.nextInt();
	        System.out.println("Digite o segundo número: ");
	        b = input.nextInt();
	        System.out.println("Digite o terceiro número: ");
	        c = input.nextInt();
	        if (a > b && a > c) {
	            System.out.println("O primeiro número é o maior.");
	        } else if (b > a && b > c) {
	            System.out.println("O segundo número é o maior.");
	        } else {
	            System.out.println("O terceiro número é o maior.");
	        }
	    }
	}
