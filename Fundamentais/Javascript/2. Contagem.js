// Algoritmo Fundamental Nº 2
// Descrição : Contagem
// Problema  : Dado um conjunto de n notas de alunos em um exame,
//             fazer uma contagem do número de alunos que foram
//             aprovados no exame. Será considerado aprovado o aluno
//             que tirar nota 50 ou maior (no intervalo de 0 a 100).
// Aplicações: Todas as formas de contagem.

var qn = parseInt(prompt("Digite a quantidade de alunos: "));
var nota;
var contagem = 0;

for (i = 1; i <= qn; i++) {
    nota = parseInt(prompt("Digite a nota do " + i + "° aluno: "));

    if (nota >= 50) {
        contagem = + 1;
    }
}
document.write("Alunos aprovados = " + contagem);
