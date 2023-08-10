def isFatorial(f: int):
    for i in range(f-1, 0, -1):
        f = f*i
    return f