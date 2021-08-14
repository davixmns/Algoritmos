// Algoritmo Fundamental Nº 8
// Descrição : Conversão de base
// Problema  : Converter um número inteiro decimal para a
//             sua representação binária correspondente.
// Aplicações: Interpretação de dados e instruções armazenados em computador.

var n = parseInt(prompt("Digite um número inteiro decimal: "))
var q = n;
var r = [];
var i = 0;

while (q > 0) {
    r[i] = q % 2;
    i++;
    q = Math.trunc(q / 2);
}

document.write("Número na base binária = ");
for (var j = i - 1; j >= 0; j--) {
    document.write(r[j]);
}
