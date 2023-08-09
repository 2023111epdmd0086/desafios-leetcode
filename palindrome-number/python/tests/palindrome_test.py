from palindrome import isPalindromo

def test_deve_retornar_se_for_palindromo():
    assert (isPalindromo(121) == True)
    assert (isPalindromo(-121) == False)
    assert (isPalindromo(10) == False)
    