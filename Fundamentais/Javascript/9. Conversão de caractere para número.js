// Algoritmo Fundamental Nº 9
// Descrição : Conversão de caractere para número
// Problema  : Dada a representação em caracteres de um número inteiro,
//             convertê-la para o seu formato decimal convencional.
// Aplicações: Aplicativos de negócios, processamento de dados.

var texto = prompt("numero a ser convertido");
var numero = 0;

document.write("Entrada em string: " + texto + "<br><br>")

for (i = 0; i < texto.length; i++) {
    numero = numero * 10 + (texto.charCodeAt(i) - 48);
}

document.write("Saida em number = " + numero)
