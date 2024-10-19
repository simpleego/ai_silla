import turtle as t

#사용자 입력
polygon_num = input("원하는 도형은 ? 예: 오각형 (5)")
polygon_num = int(polygon_num)
theta = 360 / polygon_num

t.shape('circle')
# t.shape('turtle')
t.speed(1)
t.penup()
t.goto(100,100)
t.pendown()
# t.color("#ff0000")
t.begin_fill()
t.color("red")

#다각형 그리기
for i in range(polygon_num):
    t.forward(100)
    t.right(theta)

t.end_fill()

t.exitonclick()