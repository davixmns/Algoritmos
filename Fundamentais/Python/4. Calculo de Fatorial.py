# Algoritmo Fundamental Nº 4
# Descrição : Cálculo do fatorial
# Problema  : Dado um número n, calcular o fatorial de n, onde n >= 0.
# Aplicações: Probabilidade, cálculos estatísticos e matemáticos.

n = int(input("Digite o número a ser fatorado: "))
fator = 1

for i in range(n, 0, -1):
    fator = fator * i;

print("Fatorial =",fator)
