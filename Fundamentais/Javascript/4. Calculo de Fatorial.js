// Algoritmo Fundamental Nº 4
// Descrição : Cálculo do fatorial
// Problema  : Dado um número n, calcular o fatorial de n, onde n >= 0.
// Aplicações: Probabilidade, cálculos estatísticos e matemáticos.

var n = parseInt(prompt("Digite o número a ser fatorado: "));
var fator = 1;

for (i = n; i >= 1; i--) {
    fator = fator * i;
}
document.write("Fatorial " + fator);
