// Algoritmo Fundamental Nº 6
// Descrição : Geração da sequência de Fibonacci
// Problema  : Gerar e imprimir os n primeiros termos da sequência
//             de Fibonacci, onde n >= 1. Os primeiros termos são:
//             0, 1, 1, 2, 3, 5, 8, 13, ...
//             Cada termo, além dos dois primeiros, é derivado da
//             soma de seus dois antecessores mais próximos.
// Aplicações: Botânica, teoria das redes elétricas, ordenação e pesquisa.

var n = parseInt(prompt("Digite a quantidade de termos: "));
var a = 0;
var b = 1;
var c;

if (n == 1) {
    document.write(a);
} else {
    document.write(a + " " + b);
}

for (i = 0; i < n - 2; i++) {
    c = a + b;
    document.write(" " + c);
    a = b;
    b = c;
}
