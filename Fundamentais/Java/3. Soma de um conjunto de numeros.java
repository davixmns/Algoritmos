// Algoritmo Fundamental Nº 3
// Descrição : Soma de um conjunto de números
// Problema  : Dado um conjunto de n números, calcular a soma desses números.
//             Assumir que n é maior ou igual a zero.
// Aplicações: Cálculos de média, cálculos de variância e mínimos quadrados.

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = entrada.nextInt();
        int acumulador = 0;
        int numero;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "° " + "número: ");
            numero = entrada.nextInt();
            acumulador += numero;
        }

        System.out.println("Soma dos números = " + acumulador);
    }
}
