import tkinter as tk
from tkinter import messagebox

def bmi_calc():
    lbl_result['text'] = ""

    try:
        weight = float(weight_entry.get())
        height = float(height_entry.get())/100

        bmi = weight / (height*height)
        bmi = round(bmi,2)

        result=""
        if bmi < 18.5:
            result="저체중"
        elif bmi < 23:
            result="정상체중"
        elif bmi < 25:
            result="과체중"
        elif bmi < 30:
            result="비만"
        else:
            result="고도비만"

        result = lbl_result['text'] + 'BMI지수('+str(bmi)+'), ' + result
        lbl_result['text'] = result
        messagebox.showinfo("BMI 결과", result)

    except ValueError:
        messagebox.showinfo("BMI Error", "체중과 키는 숫자로 입력하세요")

win = tk.Tk()
win.title("BMI 계산기")

lbl_weight = tk.Label(text="체중 : ")
lbl_height = tk.Label(text="신장 : ")
lbl_result = tk.Label(text="판정결과 : ")

weight_entry = tk.Entry(win)
height_entry = tk.Entry(win)

lbl_weight.grid(row=0,column=0)
weight_entry.grid(row=0, column=1)

lbl_height.grid(row=1, column=0)
height_entry.grid(row=1, column=1)

btn_calc = tk.Button(win, text="계산", command=bmi_calc)

lbl_result.grid(row=2, column=0)
btn_calc.grid(row=2, column=1)

win.mainloop()