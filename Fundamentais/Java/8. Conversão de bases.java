// Algoritmo Fundamental Nº 8
// Descrição : Conversão de base
// Problema  : Converter um número inteiro decimal para a
//             sua representação binária correspondente.
// Aplicações: Interpretação de dados e instruções armazenados em computador.

import java.util.Scanner;

public class oi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro decimal: ");
        int numero = entrada.nextInt();
        int q = numero;
        int resto[] = new int[100];
        int i = 0;

        while (q > 0) {
            resto[i] = q % 2;
            i++;
            q = (int) Math.floor(q / 2);
        }

        System.out.print("Número na base binária = ");
        for (int j = i; j >= 0; j--) {
            System.out.print(resto[j]);
        }
    }
}
