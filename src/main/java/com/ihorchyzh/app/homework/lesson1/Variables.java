package com.ihorchyzh.app.homework.lesson1;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class Variables {

    public static void main(String[] args) {

        byte b = 23;
        short s = 2034;
        int i = 424275;
        long l = 63653563866868L;

        float f = 2.7578f;
        double d = 5.7657D;

        int age = 26;                                       //26  age > variable & 26 > literal
        System.out.println("Your age is " + age);
        age = 16;                                           //16
        System.out.println("Your age is " + age);
        age += 1;                                           //17
        System.out.println("Your age is " + age);
        age = age * 2;                                      //34
        System.out.println("Your age is " + age);
        age = (age * 2) - age + 2;                          //36
        System.out.println("Your age is " + age);
    }
}

// binary >>> decimal
// 01     >>> 0123456789

// 0 1 2  3  4   5   6   7   8    9    10   11   12   13   14   15   16    17    18    19    20    21    ...
// 0 1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000 10001 10010 10011 10100 10101 ...

//byte => 00000110
// 0 * 2^0 + 1 * 2^1 + 2^2 = 6

//byte  -  8bit     >>>    – 128 to 127
//short -  16bit    >>>    – 32,768 to 32,767
//int   -  32bit    >>>    – 2,147,483,648 to 2,147,483,647
//long  -  64bit    >>>    – 9,223,372,036,854,775,808 to 9 ,223,372,036,854,775,807

//float -  32bit    >>>    - 1.4e-45f to 3.4e+38f
//double - 64bit    >>>    - 4.9e-324 to 1.7е+308

//char  -  16bit    >>>    Unicode, UTF-16 (буквы и цифры), ‘\u0000’, 0 to 65,535

//boolean           >>>    true / false [1bit in array / 32bit in general]

//Literals

// \а    Предупреждение (звонок)
// \b    Возврат курсора на шаг
// \f    Перевод страницы
// \n    Следующая строка (перевод на новую строку)
// \r    Возврат каретки
// \t    Табуляция
// \\    Отображение обратной косой черты
// \’    Отображение одинарной кавычки
// \”    Отображение двойной кавычки
// \ааа  Символ восьмеричного значения (не более 377 — т.е. 255 в десятичной системе)­

// public void <name>(<values>) <exeptions> {...}
// public <type> <name> [ = <initial value>]; // KISS

//Варианты импорта, 3 вида:
//- по имени import Part3.common.Course;
//- в объекте полный путь public Part3.common.Course course = new Course();
//- импорт всех классов из пакета import Part3.common.*;

/*
4 Types:
- class;
- constructor
- enum
- annotations

Дефолтные значения для полей класса:

- reference => null;
- byte, short, int, long => 0;
- float, double => 0.0;
- boolean => false;
- char => '\u0000'; //null in ASCII
 */