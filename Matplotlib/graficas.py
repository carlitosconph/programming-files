
from matplotlib import pyplot as plt
import math
import numpy as np


#! FUNCTION f(x) = kx^2
#? k = [-3, -2, -1, 0, 1, 2, 3]
def kx2():
    k = 3
    x = np.linspace(start=-10, stop=10, num=100)
    y = np.zeros(len(x))

    for i in range(len(x)):
        y[i] = k * (x[i] ** 2)

    plt.plot(x,y, color="red")
    plt.title("Grafica de la funcion f(x) = kx^2")
    plt.xlabel("x")
    plt.ylabel("kx^2")
    plt.grid()
    plt.show()

#! FUNCTION cos(0)
def coseno():
    def cos(x):
        return np.cos(x)

    x = np.linspace(start=-10, stop=10, num=100)
    y = cos(x)

    plt.plot(x,y, color="red")
    plt.title("Grafica de la funcion coseno")
    plt.xlabel("x")
    plt.ylabel("Cos(x)")
    plt.grid()
    plt.show()

def seno():
    def sen(x):
        return np.sin(x)

    x = np.linspace(start=-10, stop=10, num=100)
    y = sen(x)

    plt.plot(x,y, color="red")
    plt.title("Grafica de la funcion seno")
    plt.xlabel("x")
    plt.ylabel("Sen(x)")
    plt.grid()
    plt.show()

seno()