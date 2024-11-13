try:
    file = open("test.txt", "r")
    file.write("Hello, World!")
except:
    print("파일을 열 수 없습니다.")
finally:
    file.close()