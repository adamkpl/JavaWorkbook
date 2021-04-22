package workbook;

public class Patterns {
    public static void main(String[] args) {

        /*
        Right Triangle
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        rightTriangle(5);

        System.out.println("");

        /*
        Pyramid Program
            *
           * *
          * * *
         * * * *
        * * * * *
        */
        pyramidTriangle(5);

    }

    public static void pyramidTriangle(int rows) {
        // outer loop to handle number of rows
        // rows in this case
        for (int i = 0; i < rows; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = rows - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }

    private static void rightTriangle(int rows) {
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}