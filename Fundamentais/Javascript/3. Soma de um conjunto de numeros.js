// Algoritmo Fundamental Nº 3
// Descrição : Soma de um conjunto de números
// Problema  : Dado um conjunto de n números, calcular a soma desses números.
//             Assumir que n é maior ou igual a zero.
// Aplicações: Cálculos de média, cálculos de variância e mínimos quadrados.

var n = parseInt(prompt("Digite a quantidade de numeros:"));
var soma = 0;
var numero;

for (i = 0; i < n; i++) {
    numero = parseInt(prompt("Digite o " + i + "° " + "número: "));
    soma += numero;
}
document.write("Soma dos numeros = " + soma);
