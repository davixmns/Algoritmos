# Algoritmo Fundamental Nº 7
# Descrição : Inversão dos dígitos de um número inteiro
# Problema  : Inverter a ordem dos dígitos de um número inteiro positivo.
# Aplicações: Hashing e recuperação de informação, aplicativos de banco
#             de dados.

import math

numero = int(input("Digite o número a ser invertido: "))
quociente = numero
invertido = 0

while (quociente != 0):
    resto = quociente % 10
    invertido = invertido * 10 + resto
    quociente = math.trunc(quociente / 10)

print(invertido)
