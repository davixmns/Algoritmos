# Algoritmo Fundamental Nº 3
# Descrição : Soma de um conjunto de números
# Problema  : Dado um conjunto de n números, calcular a soma desses números.
#             Assumir que n é maior ou igual a zero.
# Aplicações: Cálculos de média, cálculos de variância e mínimos quadrados.

qn = int(input("Digite a quantidade de números: "))
soma = 0

for i in range(1, qn + 1):
    print("Digite o", i, "°", "número: ", end="")
    numero = int(input())
    soma += numero

print("Soma dos números =", soma)
