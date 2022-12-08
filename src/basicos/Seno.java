package basicos;// Algoritmo Fundamental Nº 5
// Descrição : Cálculo de uma série infinita
// Problema  : Calcular o valor de S, conforme definido
//             pela seguinte série infinita:
//             S = x/1! - (x^3)/3! + (x^5)/5! - (x^7)/7! + ...
// Aplicações: Cálculos matemáticos e estatísticos.

import java.util.Scanner;

public class Seno {

    public static long fatorial(int n) {
        long fat = 1;
        for (int i = n; i >= 1; i--) {
            fat = fat * i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x, termo, seno = 0;
        int n, sinal = 1, j = 1;

        System.out.print("Digite o valor de x: ");
        x = entrada.nextDouble();

        System.out.print("Digite o número de termos da série: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            termo = Math.pow(x, j) / fatorial(j); // Usa-se aqui a função fatorial
            seno = seno + sinal * termo;
            sinal = -1 * sinal;
            j = j + 2;
        }

        System.out.println("sen(x) = " + seno);
    }
}