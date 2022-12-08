package basicos;// Algoritmo Fundamental Nº 1
// Descrição : basicos.Troca dos valores de duas variáveis.
// Problema  : Dadas duas variáveis, trocar os valores atribuídos a elas.
// Aplicações: Algoritmos de ordenação.

import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = entrada.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = entrada.nextInt();

        int aux = a;
        a = b;
        b = aux;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}


