def isPalindromo(numero):
    string = str(numero).replace(" ", "").lower()
    if (string == string[::-1]):
        return True
    else :
        return False