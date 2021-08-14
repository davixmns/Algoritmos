# Algoritmo Fundamental Nº 1
# Descrição : Troca dos valores de duas variáveis
# Problema  : Dadas duas variáveis, trocar os valores atribuídos a elas.
# Aplicações: Algoritmos de ordenação.

a = input("Digite o valor de A: ")
b = input("Digite o valor de B: ")

aux = a
a = b
b = aux

print("A =", a)
print("B =", b)
