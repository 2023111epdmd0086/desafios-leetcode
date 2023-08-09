def isPalindrome(s: str):
    remover_chars = r" @#_`-;?/:.,[]{}'\\"
    for char in remover_chars:
        s = s.replace(str(char), "")
    s = s.replace('"','')
    if (s.lower() == s.lower()[::-1]):
        return True
    else:
        return False