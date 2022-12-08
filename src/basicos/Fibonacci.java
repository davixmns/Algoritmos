package basicos;// Algoritmo Fundamental Nº 6
// Descrição : Geração da sequência de basicos.Fibonacci
// Problema  : Gerar e imprimir os n primeiros termos da sequência
//             de basicos.Fibonacci, onde n >= 1. Os primeiros termos são:
//             0, 1, 1, 2, 3, 5, 8, 13, ...
//             Cada termo, além dos dois primeiros, é derivado da
//             soma de seus dois antecessores mais próximos.
// Aplicações: Botânica, teoria das redes elétricas, ordenação e pesquisa.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int n = entrada.nextInt();
        int a = 0;
        int b = 1;
        int c;

        if (n == 1) {
            System.out.print(a);
        } else {
            System.out.print(a + " " + b);
        }

        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
