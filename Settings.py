import pygame 
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLU import *
import numpy as np
import math


display = (800, 600)
h_display = (int(display[0])/2,int(display[1])/2)
titik_tengah = (int(h_display[0]),int(h_display[1]))
def gambar(x,y):
    glVertex2f(math.ceil(x),math.ceil(y))

def dda(x1,y1,x2,y2,r,g,b):
    glClearColor(0.1, 0.4, 0.5, 1)
    glColor3f(r,g,b)
    glPointSize(1.0)
    glBegin(GL_POINTS)
    dx = x2-x1
    dy = y2-y1
    if abs(dx) > abs(dy):
        if(x2 > x1):
            y = y1
            for x in range(x1, x2 + 1):
                y = y + dy/abs(dx)
                gambar(x,y)
        else:
            y = y1
            for x in range(x2, x1 - 1):
                y = y + dy/abs(dx)
                gambar(x,y)      
    else:
        if(y2 > y1):
            x = x1
            for y in range(y1, y2 + 1):
                x = x + dx/abs(dy)
                gambar(x,y)
        else:
            x = x1
            for y in range(y2, y1 - 1):
                x = x + dx/abs(dy)
                gambar(x,y) 

    glEnd()

def titik_focus():
    y = int(h_display[1])
    x = int(h_display[0])/3+100

def pantulan():
    jarak_bayangan = -(1/ (int(h_display[0])/3))+ 1/(int(h_display[0])/3+100)
    ukurang_bayangan =  (jarak_bayangan * int(h_display[1]-40))/
    pass
    
def object():
    x1 = int(h_display[0])/3
    y1 = int(h_display[1])
    x2 = int(h_display[0])/3
    y2 = int(h_display[1]-40)
    
    r, g, b = 0.5, 0.6 , 1
    dda(x1,y1,x2,y2,r,g,b)
def cermin():
    x1 = int(h_display[0])
    x2 = int(h_display[0])
    y1 = 0
    y2 = int(display[1]) 
    r, g, b = 0, 0.2 , 0.8
    dda(x1,y1,x2,y2,r,g,b)

def main():
    pygame.init()
    pygame.display.set_mode(display, DOUBLEBUF|OPENGL)

    glOrtho(0, 800, 600, 0, -1, 1)
    
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
        
        glClear(GL_COLOR_BUFFER_BIT)
        dda(0,int(h_display[1]),int(display[0]),int(h_display[1]), 1,0,0)
        object()
        cermin()
        pygame.display.flip()
        pygame.time.wait(10)

main()