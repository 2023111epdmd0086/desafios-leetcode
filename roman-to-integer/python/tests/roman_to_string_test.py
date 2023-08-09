from roman_to_string import romanToInt


def test_deve_converter_romano_para_inteiro():
    assert romanToInt("III") == 3
    assert romanToInt("LVIII") == 58
    assert romanToInt("MCMXCIV") == 1994
