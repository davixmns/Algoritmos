// Algoritmo Fundamental Nº 2
// Descrição : Contagem
// Problema  : Dado um conjunto de n notas de alunos em um exame,
//             fazer uma contagem do número de alunos que foram
//             aprovados no exame. Será considerado aprovado o aluno
//             que tirar nota 50 ou maior (no intervalo de 0 a 100).
// Aplicações: Todas as formas de contagem.

import java.util.Scanner;

public class contagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qn = entrada.nextInt();
        int nota;
        var contagem = 0;

        for (int i = 1; i <= qn; i++) {
            System.out.print("Digite a nota do " + i + "° aluno: ");
            nota = entrada.nextInt();

            if (nota >= 6) {
                contagem = +1;
            }
        }

        System.out.println("Alunos aprovados = " + contagem);
    }
}