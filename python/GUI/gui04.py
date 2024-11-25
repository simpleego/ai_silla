from tkinter import *

def paint(event):
    x1,y1 = (event.x-1),(event.y+1)
    x2,y2 = (event.x+10),(event.y+10)
    canvas.create_line(x1,y1,x2,y2)
    # canvas.create_oval(x1,y1,x2,y2)
   
win = Tk()
canvas = Canvas(win)
canvas.pack()
canvas.bind("<B1-Motion>", paint)

win.mainloop()