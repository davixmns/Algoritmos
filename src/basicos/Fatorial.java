package basicos;// Algoritmo Fundamental Nº 4
// Descrição : Cálculo do fatorial
// Problema  : Dado um número n, calcular o fatorial de n, onde n >= 0.
// Aplicações: Probabilidade, cálculos estatísticos e matemáticos.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número a ser fatorado: ");
        int n = entrada.nextInt();
        var fator = 1;

        for (int i = n; i >= 1; i--) {
            fator = fator * i;
        }

        System.out.println("basicos.Fatorial = " + fator);
    }
}