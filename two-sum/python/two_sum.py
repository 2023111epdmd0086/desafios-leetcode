def two_sum(nums, target):
    lista = []
    for i in range(len(nums)):
        for j in range(len(nums)):
            if (i != j):
                if (nums[i] + nums[j] == target):
                    lista.append(i)
    return lista
