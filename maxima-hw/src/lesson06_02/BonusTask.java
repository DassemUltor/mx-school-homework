package lesson06_02;

public class BonusTask {

    int primitive = 10;
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};


    public void passByPrimitive(int a) {
        a = 25;
        System.out.println("Значение внутри метода: " + a);

    }

    public void passByObject(int[] array) {
        array[3] = 333;
        System.out.println("Значение внутри метода: " + array[3]);

    }




    /*
В добавок создайте два метода, принимающие в качестве параметра примитив и объект, изменяющие внутри себя эти параметры.
Выведите в консоль значения соответствующих примитива/объекта до вызова метода, внутри метода после изменения,
и после выполнения метода - чтобы увидеть разницу между передачей этих объектов в метод.
 Вспомните механизм передачи параметров по значению и по ссылке (по значению ссылки)

     */
}
