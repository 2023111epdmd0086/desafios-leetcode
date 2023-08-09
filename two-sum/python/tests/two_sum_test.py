from two_sum import two_sum


def test_deve_somar_numeros_em_vetor_e_comparar_com_target_e_retornar_posicao():
    assert two_sum(nums=[2, 7, 11, 15], target=9) == [0, 1]
    assert two_sum(nums=[3, 2, 4], target=6) == [1, 2]
    assert two_sum(nums=[3, 3], target=6) == [0, 1]
