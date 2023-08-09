def romanToInt(s:str) -> int:
    print("teste "+s)
    dicionario = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }
    soma = 0
    for i in range(len(s)):
        
        if(s[i] == s[i+1]):
            soma += dicionario.get(s[i])
        if (i+1 < len(s)):
            if(dicionario.get(s[i]) < dicionario.get(s[i+1])):
                soma += (dicionario.get(s[i]) - dicionario.get(s[i+1]))
        
        
        
        # FUNCIONANDO OK ATE TERCEIRO TESTE
        # soma += dicionario.get(s[i]) 

    return soma
