import java.util.Scanner;
public class maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numeroum = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int numerodois = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numerotres = scanner.nextInt();

        if (numeroum == numerodois && numerodois == numerotres) {
            System.out.println("Todos os números são iguais!");
        }
        if (numeroum == numerodois) {
            System.out.println("O primeiro e segundo número são iguais!");
            if (numeroum == numerodois && numerodois > numerotres) {
                System.out.println("Primeiro e segundo além de iguais, são os maiores!");
            }
        }
        if (numeroum == numerotres) {
            System.out.println("O primeiro e terceiro número são iguais!");
            if (numeroum == numerotres && numerotres > numerodois) {
                System.out.println("Primeiro e terceiro além de iguais são os maiores!");
            }
        }
        if (numerodois == numerotres) {
            System.out.println("O segundo e terceiro número são iguais!");
            if (numerodois == numerotres && numerotres > numeroum) {
                System.out.println("Segundo e terceiro além de iguais são os maiores!");
            }
        }
        if (numeroum > numerodois && numeroum > numerotres ) {
            System.out.println("O maior número é o primeiro número");
        }
        if (numerodois > numerotres && numerodois > numeroum) {
            System.out.println("O maior número é o segundo número");
        }
        if (numerotres > numeroum && numerotres > numerodois) {
            System.out.println("O maior número é o terceiro número");
        }
    }
}
