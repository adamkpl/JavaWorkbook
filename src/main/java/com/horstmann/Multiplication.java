package com.horstmann;

/* Java. Podstawy. Wydanie X – Cay S. Horstmann"
 * JAVA API: https://docs.oracle.com/javase/8/docs/api/ */

/**
 * Constructors
 * @version 1.0 2019-08-07
 * @author Adam K.
 */

public class Multiplication
{
   /*4.3. Definiowanie własnych klas
   "Pola w klasie można oznaczyć słowem kluczowym public, ale nie jest to zalecane. Ich wartości mogłyby być odczytane
    i zmodyfikowane z każdego miejsca programu, a to jest całkowicie sprzeczne z ideą hermetyzacji. Każda metoda z
    każdej klasy może zmodyfikować publiczne pole — z naszego doświadczenia wynika, że tak się dzieje zawsze w najmniej
    oczekiwanym momencie. Zalecamy stosowanie zawsze specyfikatora private dla pól klas."
   "Implementując klasę, wszystkie jej pola oznaczamy słowem kluczowym private, ponieważ dane publiczne mogą być
   niebezpieczne." */

    private long x;
    private long y;
    private long result;

    //A constructor
   /* "Jak widać, konstruktor ma taką samą nazwę jak klasa. Konstruktor ten działa, kiedy tworzony jest obiekt klasy
   i nadaje polom określone przez początkowe wartości." */

    public Multiplication(long a, long b)
    {
        x = a;
        y = b;
        result = a * b;
    }

    //get results method
    public long getResults()
    {
        return result;
    }
}