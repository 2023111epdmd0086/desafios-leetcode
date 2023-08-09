from valid_palindrome import isPalindrome


def test_deve_retornar_se_for_palindromo():
    assert isPalindrome("A man, a plan, a canal: Panama") == True
    assert isPalindrome("race a car") == False
    assert isPalindrome(" ") == True
    assert isPalindrome("ab@a") == True
    assert isPalindrome("c#dc") == True
    assert isPalindrome("ab_a") == True
    assert isPalindrome("Marge, let's \"[went].\" I await {news} telegram.") == True
    assert isPalindrome("A man, a plan, a canal -- Panama") == True
    assert isPalindrome("Live on evasions? No, I save no evil.") == True
    assert isPalindrome("I, man, am regal; a German am I.") == True
    assert isPalindrome("`l;`` 1o1 ??;l`") == True