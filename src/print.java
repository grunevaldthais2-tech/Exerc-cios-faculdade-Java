import java.util.Scanner;
public class print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos deseja cadastrar a nota?: ");
        int quantidade_alunos = scanner.nextInt();
        scanner.nextLine();
        int[] numeros = new int[quantidade_alunos];

        String[] nomes_alunos = new String[quantidade_alunos];
        for (int i = 0; i < quantidade_alunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomes_alunos[i] = scanner.nextLine();
            System.out.println("Digite a nota: ");
            numeros[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temporario = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temporario;
                    String temporario_nome = nomes_alunos[i];
                    nomes_alunos[i] = nomes_alunos[j];
                    nomes_alunos[j] = temporario_nome;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Aluno: " + (nomes_alunos[i]));
            System.out.printf("Nota: %d\n", (numeros[i]));

            if (numeros[i] < 7) {
                System.out.printf("Os alunos reprovados foram: " + nomes_alunos[i] + numeros[i]);
            }
        }
    }
}
