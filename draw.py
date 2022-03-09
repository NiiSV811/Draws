from random import randint
import turtle as tl
win=tl.Screen()
win.setup(width=700, height=900)
win.bgcolor('black')
win.tracer(0)
win.colormode(255)
pencil=tl.Turtle()

position=[]
for i in range(151):
    pencil.pencolor(randint(0,255),randint(0,255),randint(0,255))
    pencil.fd(10+i)
    pencil.left(60)
    
pencil.pu()
pencil.goto(pencil.xcor()-2, pencil.ycor()-2)
pencil.pd()
for b in range(6):
    position.append(pencil.pos())
    pencil.pencolor(randint(0,255),randint(0,255),randint(0,255))
    pencil.fd(10+i)
    pencil.left(60)


for pxy in range(len(position)):
    rev=151
    pencil.pu()
    pencil.goto(position[pxy])
    pencil.pd()
    if pxy==5:
        rev=153
    for i in range(rev):
        pencil.pencolor(randint(100,255),randint(100,255),randint(100,255))
        pencil.fd(10+i)
        pencil.left(60)

name=tl.Turtle()
name.pu()
name.goto(-300,-400)
name.color('#ffffff')
name.write('Cristian Palta', font='consolas 15')

tl.done()