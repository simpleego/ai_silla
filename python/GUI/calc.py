from tkinter import *

win = Tk()
win.title("계산기")
display = Entry(win, width=33, bg="yellow")
display.grid(row=0, column=0, columnspan=5)

button_list = [
    '7','8','9','/','C',
    '4','5','6','*',' ',
    '1','2','3','-',' ',
    '0','.','=','+',' ' 
]

row_index = 1
col_index = 0

def click(key):
    if key == "=":
        # entry에 저장된 수식을 가져오기
        result = eval(display.get())
        # 계산된 결과값을 entry에 출력
        display.delete(0, len(display.get()))
        display.insert(END,result)
    else:
        display.insert(END,key)


for button_text in button_list:
    def process(t=button_text):
        click(t)
    Button(win, text=button_text,width=5,
           command=process).grid(row=row_index, column=col_index)
    col_index += 1
    if col_index > 4:
        row_index += 1
        col_index = 0

win.mainloop()