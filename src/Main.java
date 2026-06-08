import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade = 21;
        float altura = 1.64f;
        String nome = "Taís";

        int x, y;
        x = 24;
        y = 21;
        float a, b;
        a = 1.72f;
        b = 1.64f;
        boolean p, q;
        p = (24>=21);
        q = (true || false);

        Scanner scanner = new Scanner(System.in);

        System.out.print("O que você quer saber?(Idade|Altura|Nome)");
        String resposta = scanner.next();

        if (resposta.equals("Idade")){
            System.out.println("Sua idade é: " + idade);
        }
        else if (resposta.equals("Altura")){
            System.out.println("Sua altura é: " + altura);
        }
        else if (resposta.equals("Nome")){
            System.out.println("Seu nome é: " + nome);
        }
        else {
            System.out.println("Opção Inválida!");
        }
        System.out.println("x = " + x);
        System.out.println(idade + x);
        System.out.println(a);
    }
}