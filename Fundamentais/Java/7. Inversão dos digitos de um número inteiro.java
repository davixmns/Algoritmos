// Algoritmo Fundamental Nº 7
// Descrição : Inversão dos dígitos de um número inteiro
// Problema  : Inverter a ordem dos dígitos de um número inteiro positivo.
// Aplicações: Hashing e recuperação de informação, aplicativos de banco de dados.

import java.util.Scanner;

public class inversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número a ser invertido: ");
        double numero = entrada.nextInt();
        double quociente = numero;
        double resto;
        double invertido = 0;

        while (quociente != 0) {
            resto = quociente % 10;
            invertido = invertido * 10 + resto;
            quociente = Math.round(quociente / 10);
        }
        System.out.println((int)invertido);
    }
}