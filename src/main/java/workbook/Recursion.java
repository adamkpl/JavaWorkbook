package workbook;

/**
 * Recursion example
 * @see <a href="https://www.youtube.com/watch?v=fpuWkZs51aM">Intermediate Java Tutorial - 3 - Recursion</a>
 * @see <a href="https://www.matemaks.pl/silnia.html">Silnia - definicja, przykłady i metody liczenia</a>
 *
 * Silnia liczby naturalnej n - to iloczyn kolejnych liczb naturalnych od 1 do n.
 *         Silnię liczby naturalnej n oznaczamy symbolem n! (czytamy en silnia).
 *         Mamy zatem:
 *         n!=1⋅2⋅3⋅...⋅(n−1)⋅n
 */

public class Recursion {
    public static void main(String[] args) {
        /*
        Samples & expected results:
            a) 3!=1⋅2⋅3=6
            b) 4!=1⋅2⋅3⋅4=24
            c) 5!=1⋅2⋅3⋅4⋅5=120
            d) 6!=1⋅2⋅3⋅4⋅5⋅6=720
            e) 10!=1⋅2⋅3...⋅9⋅10=3628800
            f) 17!=1⋅2⋅3...⋅16⋅17=355687428096000
        */

        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(10));
        System.out.println(factorial(17));
    }

    private static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}