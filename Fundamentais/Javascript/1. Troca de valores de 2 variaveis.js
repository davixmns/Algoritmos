// Algoritmo Fundamental Nº 1
// Descrição : Troca dos valores de duas variáveis.
// Problema  : Dadas duas variáveis, trocar os valores atribuídos a elas.
// Aplicações: Algoritmos de ordenação.

var a = prompt("Digite o valor de A:");
var b = prompt("Digite o valor de B:");

var aux = a;
a = b;
b = aux;

document.write("A = " + a + "<br>");
document.write("B = " + b + "<br>");

