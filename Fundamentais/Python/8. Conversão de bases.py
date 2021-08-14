# Algoritmo Fundamental Nº 8
# Descrição : Conversão de base
# Problema  : Converter um número inteiro decimal para a
#             sua representação binária correspondente.
# Aplicações: Interpretação de dados e instruções armazenados em computador.

import math

n = int(input("Digite um número inteiro decimal: "))
q = n
r = []
i = 0
a = 0

while (q > 0):
    r.insert(i, q % 2)
    i += 1
    q = math.trunc(q / 2)

j = i - 1
print("Número na base binária = ",end="")
for a in range(j, -1, -1):
    print(r[a], end="")
