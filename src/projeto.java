import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


        if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é um(a) idoso(a).");
        }

        scanner.close();

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Exemplo com o loop for:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento: " + matriz[i][j]);
            }
        }

        System.out.println("\n\nExemplo com o loop foreach:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.println("Elemento: " + elemento);
            }
        }

    }
}



