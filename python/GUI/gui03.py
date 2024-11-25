from tkinter import *
from PIL import Image

def change_img():
    path = inputBox.get()
    img = PhotoImage(file=path)
    imageLabel.configure(image=img)
    imageLabel.image = img

win = Tk()

photo = PhotoImage(file="wonderful_life.png")
imageLabel = Label(win, image=photo)
imageLabel.pack()

inputBox = Entry(win)
inputBox.pack()

button = Button(win, text="이미지 변경", command=change_img)
button.pack()

win.mainloop()