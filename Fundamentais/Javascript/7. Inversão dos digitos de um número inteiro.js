// Algoritmo Fundamental Nº 7
// Descrição : Inversão dos dígitos de um número inteiro
// Problema  : Inverter a ordem dos dígitos de um número inteiro positivo.
// Aplicações: Hashing e recuperação de informação, aplicativos de banco de dados.

var numero = parseInt(prompt("Digite o número a ser invertido"));
var quociente = numero;
var resto;
var invertido = 0;

while (quociente != 0) {
    resto = quociente % 10;
    invertido = invertido * 10 + resto;
    quociente = Math.trunc(quociente / 10);
}
document.write(invertido)
