from palindrome import isPalindromo


print("Insira um número inteiro pra saber se é palindromo: ")
numero = int(input())
if (isPalindromo(numero)):
    print("É palindromo!!!!")
else:
    print("Não é palindromo!!!!")
    