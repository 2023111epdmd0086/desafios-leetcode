from bissexto import isBissexto


def test_deveRetornarTrueSeForBissexto():
    assert isBissexto(2024) == True
    assert isBissexto(2000) == True
    assert isBissexto(1900) == False
    assert isBissexto(4) == True
    assert isBissexto(1) == False

