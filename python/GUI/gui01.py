from tkinter import *

win = Tk()

def hello():
    print("Hello~~")

# 필요한 위젯을 추가한다
button = Button(win, text="Hello", command=hello)
button1 = Button(win, text="취소")
#button.pack(side=LEFT)
#button1.pack(side=RIGHT)
button.place(x=100, y=100)
button1.place(x=100, y=150)

win.mainloop()
