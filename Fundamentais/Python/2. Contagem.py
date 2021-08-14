# Algoritmo Fundamental Nº 2
# Descrição : Contagem
# Problema  : Dado um conjunto de n notas de alunos em um exame,
#             fazer uma contagem do número de alunos que foram
#             aprovados no exame. Será considerado aprovado o aluno
#             que tirar nota 50 ou maior (no intervalo de 0 a 100).
# Aplicações: Todas as formas de contagem.

qn = int(input("Digite a quantidade de alunos: "))
contador = 0

for i in range(1, qn+1):
    print("Digite a nota do", i, "° aluno: ", end="")
    nota = int(input())
    if (nota >= 5):
        contador += 1

print("Alunos aprovados =", contador)
