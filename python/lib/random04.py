import functools

num_list = [3, 2, 8, 1, 6, 7]
max_num = functools. reduce(lambda x, y: x if x < y else y, num_list)
print(max_num)  # 8 출력
