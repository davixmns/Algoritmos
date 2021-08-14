# Algoritmo Fundamental Nº 5
# Descrição : Cálculo de uma série infinita
# Problema  : Calcular o valor de S, conforme definido
#             pela seguinte série infinita:
#             S = x/1! - (x^3)/3! + (x^5)/5! - (x^7)/7! + ...
# Aplicações: Cálculos matemáticos e estatísticos.

import math

def fatorial(n):
    fator = 1
    for i in range(1, n):
        fator = fator * i
        return fator


n = input("Digite o número de termos: ")
x = input("Digite o valor de x: ")

s = 0
i = -1
sinal = -1
j = 1

for j in range(1, n):
    i = i + 2
    sinal = -sinal
    termo = sinal * math.pow(x, i) / fatorial(i)
    s = s + termo

print("S =", s)
