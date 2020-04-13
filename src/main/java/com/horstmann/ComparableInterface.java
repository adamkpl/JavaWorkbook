package com.horstmann;

/* Java. Podstawy. Wydanie X – Cay S. Horstmann"
 * JAVA API: https://docs.oracle.com/javase/8/docs/api/
 * "(...) każda klasa implementująca interfejs Comparable musi mieć metodę compareTo, która przyjmuje
 * parametr typu Object i zwraca liczbę całkowitą." */

import java.math.BigDecimal;

/**
 * Interfaces, chapter 6.1
 * @version 1.0 2020-03-24
 * @author Adam K.
 */

public class ComparableInterface {

    public static void main(String[] args) {

       /* "W wywołaniu x.compareTo(y) metoda compareTo musi porównać dwa podane obiekty i zwrócić informację na temat
       tego, który z nich jest większy. Liczba ujemna oznacza, że większy jest y, zero, że obiekty są równe, a liczba
       dodatnia, że większy jest x."

       "Z dokumentacji interfejsu Comparable wynika, że metoda compareTo powinna być zgodna z metodą equals,
       tj. wynik operacji x.compareTo(y) powinien wynosić zero dokładnie w tych przypadkach, w których taki wynik
       zwraca operacja x.equals(y).
       Większość implementujących interfejs Comparable klas API Javy honoruje tę zasadę, ale jednym z ważnych wyjątków
       jest klasa BigDecimal. W poniższym przypadku wynik operacji x.equals(y) jest fałszywy, ponieważ porównywane
       liczby różnią się stopniem precyzji. Operacja x.compareTo(y) zwróci jednak zero. Tak naprawdę nie powinna, ale
       nie było oczywistego sposobu na wybranie, która z wartości powinna zostać uznana za pierwszą. */

        Integer a = 0;
        Integer b = 1;
        Integer c = 2;
        Integer d = 2;
        BigDecimal x = new BigDecimal("1.0");
        BigDecimal y = new BigDecimal("1.00");

        System.out.println("Integer: comparing variables using compareTo method: ");
        System.out.println("0 & 1: " + a.compareTo(b)); // -1
        System.out.println("2 & 2: " + c.compareTo(d)); // 0
        System.out.println("1 & 2: " + d.compareTo(b)); // 1
        System.out.println("BigDecimal: comparing variables using compareTo method: ");
        System.out.println("x & y: " + x.compareTo(y)); // 0
        System.out.println("y & x: " + y.compareTo(x)); // 0

        //todo Add hashCode() & equals()
        //todo Lists, Sets, Maps (seperate class?)

    }
}