from tkinter import *

win = Tk()

def hello():
    label['text'] = "안녕 친구야~~"
    label.configure(text="~~~")


label = Label(text="여기에 출력해줘")

label.grid(row=0,column=0)
# label.pack()

# 필요한 위젯을 추가한다
button = Button(win, text="Hello", command=hello)
button1 = Button(win, text="취소")
#button.pack(side=LEFT)
#button1.pack(side=RIGHT)
# button.place(x=100, y=100)
# button1.place(x=100, y=150)
button.grid(row=1, column=0)
button1.grid(row=1, column=1)

win.mainloop()
