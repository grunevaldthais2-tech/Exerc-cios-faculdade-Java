import java.util.Arrays;
import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crie um algoritmo em Java que solicita três números decimais ao usuário. Em seguida, a média destes números é calculada e mostrada na tela para o usuário.

        System.out.println("Digite um número decimal: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite um segundo número decimal: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite um terceiro número decimal: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.printf("A média dos números digitados é: %.2f \n", media);

        // 2. Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.
        System.out.println("Digite qualquer número: ");
        double numero = scanner.nextDouble();
        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é zero.");
        }

        // 3. Crie um algoritmo em Java que mostre na tela todos os múltiplos de 3 entre os números 0 e 30 usando a estrutura “do while”.
        // meu jeito sem do while:
        int[] valores = new int[]{0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        System.out.print(Arrays.toString(valores) + "\n");
        // jeito requerido:
        int contador = 0;
        do {
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
        while (contador <= 30);


        // 4. Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro (exemplo: 14).
        //  Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”.

        System.out.println("Digite um número inteiro: \n");
        int numero_digitado = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            int resultado = numero_digitado * i;
            System.out.println(numero_digitado + "x" + i + "=" + resultado);
        }

        // 5. Crie um algoritmo em Java que peça ao usuário para que se digite um ano (exemplo: 2032). Em seguida, o algoritmo
        // deve verificar se o ano informado é ou não bissexto.

        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();
        boolean bissexto = false;
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                }
            } else {
                bissexto = true;
            }
        }

        if (bissexto) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        // 6- Crie um algoritmo que solicita um número inteiro ao usuário. Em seguida, deve-se verificar se o número
        // digitado é ou não é um número primo.

        System.out.println("Digite um número inteiro: ");
        int n_primo = scanner.nextInt();
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        } else {
            primo = true;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
            } else {
                primo = true;
            }
            break;
        }
        if (primo) {
            System.out.println("O número É primo!");
        } else {
            System.out.println("O número NÃO é primo!");
        }


    //7-Crie um algoritmo em Java que peça ao usuário a temperatura em graus Celsius e converta-a para graus Fahrenheit.
    // Além disso, o programa deve imprimir se está frio (abaixo de 32°F), moderado (entre 32°F e 80°F) ou quente
    // (acima de 80°F).

        System.out.println("Digite a temperatura em graus Celsius para converter em graus Fahrenheit: ");
        double temperatura = scanner.nextDouble();
        double fahrenheit = (temperatura * 9 / 5.0) + 32;
        if (fahrenheit <= 32) {
            System.out.printf("A temperatura em Fahrenheit é %.2f ... e está frio!" , fahrenheit);
        }
        else if (fahrenheit > 32 && fahrenheit <= 80) {
            System.out.printf("A temperatura em Fahrenheit é de %.2f ... o clima está moderado!" , fahrenheit);
        }
        else {
            System.out.printf("A temperatura em Fahrenheit é %.2f... e está calor!", fahrenheit);
        }
        System.out.println();

    //8- Desenvolva um algoritmo em Java que peça ao usuário um número inteiro n e gere um padrão de asteriscos

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    //9-Crie um programa que peça um número inteiro (ex: 1234) e imprima cada dígito separadamente, identificando sua
    // casa decimal (Unidade: 4, Dezena: 3, Centena: 2, Milhar: 1). Dica: use as operações de divisão (/) e resto (%)
    // por 10.
      // meu jeito que deu certo porém "limitado":
        System.out.println("Digite um número inteiro: ");
        int num_digitado = scanner.nextInt();
        int unidade = num_digitado % 10;
        int dezena = (num_digitado / 10) % 10;
        int centena = (num_digitado / 10) / 10 % 10;
        int milhar =  (num_digitado / 10) / 10 / 10 % 10;

        System.out.printf(" Unidade: %d , Dezena: %d , Centena: %d , Milhar: %d" , unidade , dezena, centena, milhar);
        System.out.println();

      // jeito da resolução do professor:

        System.out.print("Digite um número inteiro para decompor: ");
        int numero_decompor = scanner.nextInt();

        // Variável auxiliar para mostrar a casa (1 = unidade, 10 = dezena...)
        int casaDecimal = 1;

        System.out.println("\nDecompondo o número:");

        // Enquanto o número ainda tiver dígitos (for maior que 0)
        while (numero_decompor > 0) {
            // Passo 1: Pegamos o último dígito usando o resto da divisão por 10
            int digito = numero_decompor % 10;

            // Passo 2: Mostramos o resultado
            System.out.println("Casa " + casaDecimal + ": " + digito);

            // Passo 3: "Cortamos" o último dígito do número original
            numero_decompor = numero_decompor / 10;

            // Passo 4: Atualizamos a casa decimal para a próxima rodada
            casaDecimal = casaDecimal * 10;
        }



    //Crie um algoritmo em Java que solicita ao usuário para que insira um número inteiro entre 1 e 1000 e converta-o
    // em um número romano. Por exemplo, se o usuário inserir 58, o programa deve imprimir "LVIII".

        System.out.println("Digite um número inteiro entre 1 (um) e 4.000 (mil):  ");
        int digitado = scanner.nextInt();

        String[] unidadesRomanas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] dezenasRomanas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenasRomanas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] milharesRomanas = {"", "M", "MM", "MMM"};

        if (digitado < 1 || digitado > 4000) {
            System.out.println("O número digitado é inválido, tente novamente.");
        }
        else {

            String unidades = unidadesRomanas[digitado % 10];
            String dezenas = dezenasRomanas[(digitado / 10) % 10];
            String centenas = centenasRomanas[(digitado / 100) % 10];
            String milhares = milharesRomanas[(digitado / 1000) % 10];

            String algarismo = milhares + centenas + dezenas + unidades;

            System.out.printf("Número digitado: %d\nAlgarismo Romano equivalente: %s ", digitado, algarismo);


        }












    //11. Crie um algoritmo em Java contendo a lógica do jogo da forca. O programa deve escolher aleatoriamente uma
    // palavra de uma lista de palavras e o usuário deve adivinhar a palavra, uma letra de cada vez. O usuário tem um
    // número fixo de tentativas para adivinhar a palavra. Dica: para manipular textos que mudam com frequência
    // (como as letras descobertas na forca, como “_ _ A _”), lembre-se de que a String comum no Java não pode ser
    // alterada. Pesquise sobre como usar o mtodo setCharAt() da classe StringBuilder para substituir os “_” pelas
    //  letras corretas













    //12. Crie um programa que leia uma frase, remova os espaços, verifique se ela é um palíndromo (lê-se igual de
    // trás para frente, ex: 'arara') e conte quantas vogais ela possui. Utilize laços for e métodos da classe String
    // como charAt() e length().
















        Scanner close;

    }
}







