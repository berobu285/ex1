package com.easylabs;

import java.util.Scanner;
public class Main {
    //Прямоугольник
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую сторону прямоугольника: " );
        double x = scanner.nextDouble();
        System.out.print("Введите вторую сторону прямоугольника: ");
        double y = scanner.nextDouble();
        double P, S;
        P = 2*(x+y);
        System.out.println("Периметр прямоугольника:" + P);
        S = x*y;
        System.out.println("Площадь прямоугольника:" + S);*/




        //Кв. урванение
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый коэф.: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второй коэф.: ");
        double b = scanner.nextDouble();
        System.out.print("Введите третий коэф.: ");
        double c = scanner.nextDouble();
        double D;
        D = b * b - 4 * a * c;
        double x1, x2, x3;
        System.out.print("D = " +D);
if (D > 0) {
    x1 = (-b + Math.sqrt(D))/2*a;
    x2 = (-b - Math.sqrt(D))/2*a;
    System.out.print("Первый корень уравнения х1 = "+ x1 +" и второй x2 = "+ x2);
}
if(D==0){
x3 = b/2*a;
System.out.print("Корнем уравнения является x3 = "+ x3);
}
if (D<0){
    System.out.println("   Корней нет, т.к. дискриминант отрицательный.");
    }*/



    //Стороны квадрата
   /* Scanner scanner = new Scanner(System.in);
     System.out.print("Введите периметр квадрата: ");
    double P = scanner.nextDouble();
    double a ;
    a = P/4;
    System.out.print("Сторона квадрата а = " + a);*/





   // Вычисление значений переменной ans
        Scanner scanner = new Scanner(System.in);
        System.out.println("Эта программа позволяет посчитать 4 уравнения по заданным формулам. Помните, что каждая указанная вами переменная сохраняется и возможности её изменить не будет.");
        System.out.println("Первое уравнение имеет такой вид : (b + корень из(b^2 + 4ac))/2a - a^3*c + b^(-2)");
        System.out.println("Введем переменные уравнения.( 'a' не может быть равно 0)");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = " );
        double b = scanner.nextDouble();
        System.out.print("c = " );
        double c = scanner.nextDouble();
        double ans1 = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/2*a - a*Math.pow(c, 3) + Math.pow(b, -2) );
        if (a != 0 ){
            System.out.println("Результат уравнения: " + ans1);
        }
        else if (a == 0){

            System.out.println("Уравнение не имеет решений.");
        }
        System.out.println("Второе уравнение имеет такой вид : x - x^3/3 + x^5/5");
        System.out.println("Введем переменные уравнения.( В этом случае ограничений у нас нет.)");
        System.out.print("x = ");
        double x = scanner.nextDouble();
        double ans2 = (x - Math.pow(x, 3)/3 + Math.pow(x, 5)/5);
        System.out.println("Результат уравнения: " + ans2);

        System.out.println("Третье уравнение имеет такой вид : (x+y)/(y+1) - (xy-12)/(34+x)");
        System.out.println("Введем переменные уравнения.( 'x' не может быть равно -34, а переменная 'y' не может быть равна -1.)");
        System.out.println("x = " + x);
        System.out.print("y = " );
        double y = scanner.nextDouble();
        if(x == -34 || y == - 1){
            System.out.print("Уравнение не имеет решений.");
        }
        if(x != -34 && y != -1){
            double ans3 = (x + y) / (y + 1) - (x * y - 12) / (34 + x);
            System.out.println("Результат уравнения: " + ans3);
        }
        System.out.println("Четвертое уравнение имеет такой вид : sin(корень из(x+1)) - sin(корень из(x-1))");
        System.out.println("Введем переменные уравнения.( В этом случае ограничений у нас нет.)");
        System.out.println("x = " + x);
        double ans4 = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1));
        System.out.println("Результат последнего уравнения: " + ans4);
    }
}
