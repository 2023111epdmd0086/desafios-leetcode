from two_sum import two_sum


listaNumeros = []
print("Insira quantos números que deseja inserir")
qtd = int(input())
for i in range(qtd):
    print(f"Insira o número de posição {i+1}")
    numero = int(input())
    listaNumeros.append(numero)

print("Insira o valor que deve ter a soma")
target = int(input())

print(two_sum(nums=listaNumeros, target=target))
