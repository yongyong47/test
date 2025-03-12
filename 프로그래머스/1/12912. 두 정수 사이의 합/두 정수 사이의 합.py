def solution(a, b):
    if a==b: return a
    if a>b : return sum(n for n in range(b, a+1))
    if b>a : return sum(n for n in range(a, b+1))